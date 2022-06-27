import java.util.ArrayList;

public class User {
	ArrayList<Currency> currencyRates = new ArrayList<Currency>();
	ArrayList<Wage> Income = new ArrayList<Wage>(); // user income sources that user can record or view or
	// search by type or month
	ArrayList<Expense> Spending = new ArrayList<Expense>(); // user's expenses
	String username;
	String pwd;
	// current total income - total
	double balance;
	// possible monthly savings, calculated using monthly income (most recent)
	// assuming the data we have is for one year, and monthly and biweekly expenses,
	// here you can assume yearly expenses that are recorded have already been paid.
	double monthlysavings;

	// should add constructor(s)
	User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}
