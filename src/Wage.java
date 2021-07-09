
public class Wage {
	String source;
	double amount;
	String month;
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}

	public Wage(String source, double amount, String month) {
		super();
		this.source = source;
		this.amount = amount;
		this.month = month;
	}

	public Wage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
