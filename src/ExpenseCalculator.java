
/**
 * This class is used to implement the Expenser interface
 * @author SENG 210 - Joseph Castro, Julie Chambers, Cameron Basham
 *
 */


public class ExpenseCalculator implements Expenser{

	
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
	
	public User userAtHand;
	

	@Override
	public void addExpense(Expense Ex) {
		userAtHand.Spending.add(Ex); 
		
	}

	@Override
	public void addMonthlyIncome(Wage W) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintFullreport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintExpensereport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintIncomereport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintIncomereportbyTpe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintExpensebyType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportReport(String reportTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Currency convertForeignCurrency(Currency C, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loadExpenseFile(String filePath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadIncomeFile(String filePath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int whenCanIBuy(String itemname, double price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMonthlySavings() {
		// TODO Auto-generated method stub
		
		
	}

}



