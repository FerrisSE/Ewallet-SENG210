import java.util.ArrayList;

/**
 * A class for creating user objects, which contains currency rates, income, expenses, balance, and monthly savings
 */
public class User {
	private ArrayList <Currency>currencyRates;
	private ArrayList <Wage>Income;  // user income sources that user can record or view or search by type or month 
	private ArrayList <Expense>Spending; //user's expenses 
	String username;
	String pwd;
	//current total income - total 
	double balance;
	// possible monthly savings, calculated using monthly income (most recent) assuming the data we have is for one year, and monthly and biweekly expenses, here you can assume yearly expenses that are recorded have already been paid. 
	double monthlysavings;	
	//should add constructor(s)

	/**
	 * When creating a User object, the user needs to provide a username and password.
	 * @param username user's desired username as String
	 * @param password user's desired password as String
	 */
	User(String username, String password){
		this.username = username;
		this.pwd = password;
	}

	/**
	 * Method responsible for getting user's username
	 * @return user's username as String
	 */
	protected String getUsername() {
		return this.username;
	}

	/**
	 * Method responsible for getting user's password
	 * @return user's password as String
	 */
	protected String getPwd() {
		return this.pwd;
	}

	/**
	 * Method responsible for updating the user's username
	 * @param username user's desired username
	 */
	protected void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Method responsible for updating the user's password
	 * @param password user's desired password
	 */
	protected void setPwd(String password) {
		this.pwd = password;
	}
	
	/**
	 * Method responsible for adding expense to the arraylist
	 * @param Ex user's calculated expense
	 */
	protected void addExpense(Expense Ex) {
		Spending.add(Ex);
	}

}
