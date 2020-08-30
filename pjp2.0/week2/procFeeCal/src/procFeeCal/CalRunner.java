package procFeeCal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class CalRunner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<TranList> trlist = new ArrayList<TranList>();
		String path = "C:\\Users\\Bharathi\\Desktop\\sapient\\PJP 2.0\\Sample_Data_Fee_Calculator.CSV";
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
				String[] da = values[4].split("-");
				/*
				 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR,
				 * Integer.parseInt(da[2])); cal.set(Calendar.MONTH, Integer.parseInt(da[0]));
				 * cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(da[1])); Date date =
				 * cal.getTime();
				 */
				Date date = new Date(Integer.parseInt(da[2]), Integer.parseInt(da[0]), Integer.parseInt(da[1]));
				TranList tran = new TranList();
				tran.setClientId(values[1]);
				tran.setEx_TransactionId(values[0]);
				tran.setSecurityId(values[2]);
				tran.setTransactionType(values[3]);
				tran.setTransactionDate(date);
				tran.setMarketValue(Double.parseDouble(values[5]));
				tran.setPriorityFlag(values[6]);
				// System.out.println(tran);
				trlist.add(tran);
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	}

	Collections.sort(trlist, new Rearrange());
	
	for (int i = 0; i < trlist.size()-1; i++) {
		for(int j=1;j<trlist.size();j++)
		{if((trlist.get(i).ClientId==trlist.get(j).ClientId)&&(trlist.get(i).TransactionDate==trlist.get(j).TransactionDate))
		{if((trlist.get(i).TransactionType=="BUY")&&(trlist.get(j).TransactionType=="SELL")) {
			
					trlist.get(i).setProcessingFee(10.0);
					trlist.get(j).setProcessingFee(10.0);
					trlist.get(i).setFlag(1);
					trlist.get(j).setFlag(1);
		}	
		}	
		}
	}
	
	for (TranList element : trlist) {
		if (element.getFlag() == 0) {

			if (element.getPriorityFlag().equals("Y")) {
				element.setProcessingFee(500.0);
			} else
			{

				if ((element.TransactionType.equals("BUY"))
						|| (element.TransactionType.equals("DEPOSIT"))) {
					element.setProcessingFee(50.0);
		
		}
		if ((element.TransactionType.equals("SELL")) || (element.TransactionType.equals("WITHDRAW"))) {
			element.setProcessingFee(100.0);
	    }
		
	    }
	}
	System.out.println(element.getProcessingFee());

	}
	
		

try {
	File path2 = new File("C:\\Users\\Bharathi\\Desktop\\sapient\\PJP 2.0\\SummaryReport.csv");
			if (!path2.exists()) {
				path2.createNewFile();

			FileWriter fw = new FileWriter(path2);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Client Id,Transaction Type,Transaction Date,Priority,Processing Fee");
			bw.newLine();
			for (TranList element2 : trlist) {

				String date = String.join("-", Integer.toString(element2.getTransactionDate().getDate()),
						Integer.toString(element2.getTransactionDate().getMonth()),
						Integer.toString(element2.getTransactionDate().getYear()));

				bw.write(String.join(",", element2.getClientId(), element2.getTransactionType(),
						date,
						element2.getPriorityFlag(), Double.toString(element2.getProcessingFee())));
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


