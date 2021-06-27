
public class Expense {
	private String source;
	private double amount;
	private int yearlyfrequency; //1 for 1 time or once a year, 12 for monthly or or 24 for biweekly
	
	//should add contructor(s)
	public void setAmount(double amount){
		this.amount = amount;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setYearlyFrequency(int yearlyFrequency) {
		this.yearlyfrequency = yearlyFrequency;
	}
	public void print() {
		System.out.println(amount +"--"+ source);
	}
}
