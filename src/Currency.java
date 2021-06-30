
public class Currency {
	public double rate = 0;
	public String name = "";	

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
