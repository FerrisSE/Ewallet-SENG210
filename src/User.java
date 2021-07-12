import java.util.ArrayList;

public class User {
	public ArrayList <Currency>currencyRates = new ArrayList<Currency>();
	
	
	// Current Rates as of 6/68/2021
	private double Euro_rate = 0.84;		
	private double BritishPound_rate = 0.72;
	private double IndianRupee_rate = 0.74;
	private double AustralianDollar_rate = 1.32;
	private double CanadianDollar_rate = 1.23;
	
	Currency Dollars = new Currency(1.0, "Dollars");
	Currency Euros = new Currency(Euro_rate, "Euros");
	Currency Pounds = new Currency(BritishPound_rate, "Pounds");
	Currency Rupees = new Currency(IndianRupee_rate, "Rupees");
	Currency AU_Dollars = new Currency(AustralianDollar_rate, "Australian Dollars");
	Currency CA_Dollars = new Currency(CanadianDollar_rate, "Canadian Dollars");
	
	
	public ArrayList <Wage>Income = new ArrayList<Wage>();  // user income sources that user can record or view or search by type or month 
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
		currencyRates.add(Dollars);
		currencyRates.add(Euros);
		currencyRates.add(Pounds);
		currencyRates.add(Rupees);
		currencyRates.add(AU_Dollars);
		currencyRates.add(CA_Dollars);
		//add other Currency
		this.updatedsavings = 0;
	}
	public void setSavings(double updatedsavings) {
		this.updatedsavings = monthlysavings;
	}
	public double getSavings() {
		return updatedsavings;
	}
	public void printExpenses() {
		System.out.println(this.monthlysavings + " saved this month!");
		
		for (Expense e : Spending) {
			System.out.print(e);
		}
	}
	
	
	User(String username,String password){}
}
