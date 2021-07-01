/**This class allows a user to enter an expense, its source, and designate how often the cost occurs(options include monthly,biweekly or yearly)
 * 
 * @author SENG 210 - Joseph Castro, Julie Chambers, Cameron Basham
 *
 */
import java.util.Scanner;

public class Expense {
	private String source;
	private double amount;
	private int yearlyFrequency; //1 for 1 time or once a year, 12 for monthly or or 24 for biweekly
	
	boolean foundDigit = false;
	boolean foundUpperCase = false;
	boolean foundLowerCase = false;
	boolean foundSymbol = false;
	boolean foundLength = false;
	boolean foundMonthly = false;
	boolean foundYearly = false;
	boolean foundBiweekly = false;
	
	
	
	//should add contructor(s)
	
	//setters
	public void setAmount(double amount){
		/*README for (int i = 0; i <= amount; ++i) {
			if (amount.isDigit()) {
				foundDigit = true;
				
				}
			}*/	
		this.amount = amount;
	}
	public void setSource(String source) {
		for (int i = 0; i < source.length(); ++i) {
			
			//checks if lowercase letters are present
			if (source.charAt(i) >= 'a' && source.charAt(i) <= 'z') {
				foundLowerCase = true;
			}
			
			//checks if uppercase letters present
			else if (source.charAt(i) >= 'A' && source.charAt(i) <= 'Z') {
				foundUpperCase = true;
			}
			
			//checks if there are any digits present
			else if (Character.isDigit(source.charAt(i))) {
				foundDigit = true;
			}
			
			//verifies that the input is letters only
			else if (foundLowerCase || foundUpperCase || foundDigit) {
				this.source = source;
			}
			
			else {
				System.out.println("Source can only contain numbers, uppercase letters, or lowercase letters");
			}
		}
		
		
	
		
		
		
		
	}
	public void setYearlyFrequency(int yearlyFrequency) {
		
		//checking for monthly
		if (yearlyFrequency == 12) {
			foundMonthly = true;
		}
		
		//checking for yearly
		else if (yearlyFrequency == 1) {
			foundYearly = true;
		}
		
		//checking for biweekly
		else if (yearlyFrequency == 24) {
			foundBiweekly = true;
		}
		
		//checking to make sure only 1, 12, or 24 is entered
		else if (foundMonthly || foundYearly || foundBiweekly) {
			this.yearlyFrequency = yearlyFrequency;
		}
		else {
			System.out.println("You can only enter the numbers 1, 12, or 24 for your expense occurance.");
		}
		
	}
	
	//getters
	public double getAmount() {
		return amount;
	}
	public String getSource() {
		return source;
	}
	public int getYearlyFrequency() {
		return yearlyFrequency;
	}

	
	public void printExpense() {
		System.out.println(amount +"--"+ source + "--" + yearlyFrequency);
	}
}
