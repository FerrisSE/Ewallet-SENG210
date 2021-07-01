/**This class is used for all GUI components, the login, and the main screen(list of options user can choose from).
 * @author SENG 210 - Joseph Castro, Julie Chambers, Cameron Basham
 */
import java.util.Scanner;
import java.util.ArrayList;
/*Teacher notes: 
 * this is the app class, has the GUI and create one object of your expense 
 * calculator class. The expense calculator class is the implementation of the Expenser interface 
 */

public class EWalletApp {
	
	private static ArrayList<User> AllData = new ArrayList<User>();
	
	public void CreateUser(String username, String password) {}

	public static ExpenseCalculator brain = new ExpenseCalculator();
		
	
	
	
	public static void main(String[] args) {
		
		System.out.println("whats is your name");
		String name = "";
		Scanner scnr = new Scanner(System.in);
		
		
		name = scnr.next();
		
		for (User u : AllData) {
			if (u.username.equals(name)) {
				brain.userAtHand = u;
			}
			
			
		}
		
		if (brain.userAtHand == null) {
		User u1 = new User();
		u1.username = name;
		AllData.add(u1);
		brain.userAtHand = u1;
		
		}
		//add eve3nt handler
		Expense e1 = new Expense();
		
		System.out.println("enter the source");
		e1.source = scnr.next();
		
		System.out.println("enter amount");
		e1.amount = scnr.nextDouble();
		
		System.out.println("yearly frequency");
		e1.yearlyfrequency = scnr.nextInt();
		
		//adding expense
		brain.addExpense(e1);
		brain.userAtHand.printExpenses();
		
		//adding monthly income
		//brain.addMonthlyIncome(null);
	
	
	}
	
}
