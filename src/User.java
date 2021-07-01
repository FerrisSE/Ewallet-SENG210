import java.util.ArrayList;

public class User {
	private ArrayList <Currency>currencyRates = new ArrayList<Currency>();
	private ArrayList <Wage>Income = new ArrayList<Wage>();  // user income sources that user can record or view or search by type or month 
	public ArrayList <Expense>Spending = new ArrayList<Expense>(); //user's expenses 
	
	private double updatedsavings;
	
	String username;
	String pwd;
	
	//current total income - total 
	double balance;
	// possible monthly savings, calculated using monthly income (most recent) assuming the data we have is for one year, and monthly and biweekly expenses, here you can assume yearly expenses that are recorded have already been paid. 
	double monthlysavings;	
	//should add constructor(s)
	public User() {
		this.updatedsavings = 0;
	}
	public void setSavings(double updatedsavings) {
		this.updatedsavings = monthlysavings;
	}
	//public void getSavings() {
		//return Income - Spending;
	//}
	public void printExpenses() {
		System.out.println(this.monthlysavings + " saved this month!");
		
		for (Expense e : Spending) {
			System.out.print(e);
		}
	}
	
	
	User(String username,String password){}
}
