package avgSumCal;

public class CuurencyCon {
	Double Value;
	String Currency;

	public Double Convert(Double value, String currency) {
		if (currency.equals("INR")) {
			this.Value = value / 66;
		}
		if (currency.equals("SGP")) {
			this.Value = (value) / 1.5;
		}
		if (currency.equals("HKD")) {
			this.Value = value / 8;
		}
		if (currency.equals("GBP")) {
			this.Value = value / 0.67;
		}
		if (currency.equals("USD")) {
			this.Value = value;
		}
		return Value;

	}

}
