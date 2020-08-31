package avgSumCal;

public class OutputRecord {
	String city_country;
	String Gender;
	Double AvgIncome;

	public String getCity_country() {
		return city_country;
	}

	public void setCity_country(String city_country) {
		this.city_country = city_country;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Double getAvgIncome() {
		return AvgIncome;
	}

	public void setAvgIncome(Double avgIncome) {
		AvgIncome = avgIncome;
	}

	public OutputRecord() {
		super();
	}

	@Override
	public String toString() {
		return " " + city_country + ", " + Gender + ", " + AvgIncome + ", " + "";
	}

}
