package avgSumCal;

public class InputRecord {
	String City;
	String Country;
	String Gender;
	String Currency;
	Double AvgIncome;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		this.Currency = currency;
	}

	public Double getAvgIncome() {
		return AvgIncome;
	}

	public void setAvgIncome(Double avgIncome) {
		this.AvgIncome = avgIncome;
	}

	public InputRecord() {
		super();
	}

	@Override
	public String toString() {
		return " " + City + ", " + Country + ", " + Gender + ", " + Currency + ", " + AvgIncome + "";
	}

}
