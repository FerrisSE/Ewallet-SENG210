
public class Currency {
	private double rate = 0;
	private String name = "";	

	public String getCurrency() {
		return "Rate: " + this.rate + ", Name: " + this.name;
	}
	public double getRate() {
		return this.rate;
	}
	public String getName() {
		return this.name;
	}
	
	public Currency(double rate, String name) {
		this.rate = rate;
		this.name = name;
	}		
}
