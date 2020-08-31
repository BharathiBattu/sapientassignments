package avgSumCal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AvgSumRunner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<InputRecord> list = new ArrayList<InputRecord>();
		String path = "Sample input file Assignment 3.csv";
		String line = "";
		int n = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if (n == 0) {
					n += 1;
					continue;
				}

				InputRecord record = new InputRecord();
				record.setCity(values[0]);
				if (values[1].equals("")) {
					record.setCountry(values[0]);
				} else {
				record.setCountry(values[1]);
			}
				record.setGender(values[2]);
				record.setCurrency(values[3]);
				record.setAvgIncome(Double.parseDouble(values[4]));


				// System.out.println(record);
				list.add(record);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
	}

	ArrayList<OutputRecord> outlist = new ArrayList<OutputRecord>();
	Collections.sort(list, new Rearrange());

	
	  for (InputRecord element : list) { System.out.println(element); }
	 
int i=0;
int j=1;
int k = 0;
CuurencyCon val=new CuurencyCon();
	while(i<list.size()) {
		Double sum = 0.0;
		k = 0;
		while(j<list.size()) {
			if(list.get(i).getGender().equals(list.get(j).getGender())){
				sum=sum+list.get(i).getAvgIncome();
				i = j;
				j++;
				k++;
			}
			else {
				k++;
				sum = sum + list.get(i).getAvgIncome();
				OutputRecord record2 = new OutputRecord();
				sum=val.Convert(sum, list.get(i).getCurrency());
				sum = sum / k;
				record2.setAvgIncome(sum);
				record2.setCity_country(list.get(i).getCountry());
				record2.setGender(list.get(i).getGender());
				System.out.println(record2);
				outlist.add(record2);
			    i=j;
			    j++;
			    break;

			}
			

		if (j == list.size() - 1) {
			sum = sum + list.get(i).getAvgIncome();
			sum = sum + list.get(j).getAvgIncome();
			k = k + 2;
			OutputRecord record2 = new OutputRecord();
			sum = val.Convert(sum, list.get(j).getCurrency());
			sum = sum / k;
			record2.setAvgIncome(sum);
			record2.setCity_country(list.get(j).getCountry());
			record2.setGender(list.get(j).getGender());
			System.out.println(record2);
			outlist.add(record2);
			i = j + 1;
			break;
		}
		
	}

	}

	try {
		File path2 = new File("SummaryReport.csv");
		if (!path2.exists()) {
			path2.createNewFile();

			FileWriter fw = new FileWriter(path2);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("City/Country,Gender,Average Income(in USD)");
			bw.newLine();
			for (OutputRecord element2 : outlist) {

				bw.write(String.join(",", element2.getCity_country(), element2.getGender(),
						Double.toString(element2.getAvgIncome())));
				bw.newLine();

			}

			bw.close();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}




