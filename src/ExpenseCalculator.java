
/**
 * This class is used to implement the Expenser interface
 * @author SENG 210 - Joseph Castro, Julie Chambers, Cameron Basham
 *
 */


public class ExpenseCalculator implements Expenser{

	
	public ExpenseCalculator (User u) {
		userAtHand = u;
		
	}
	
	
	public User userAtHand;
	
	

	@Override
	public void addExpense(Expense Ex) {
		userAtHand.Spending.add(Ex); 
		
	}

	@Override
	public void addMonthlyIncome(Wage W) {
		userAtHand.Income.add(W);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintFullreport() {
		
		PrintExpensereport();
		PrintIncomereport();
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintExpensereport() {
		System.out.println(userAtHand.Spending);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintIncomereport() {
		System.out.println(userAtHand.Income);
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
	public double convertForeignCurrency(String Currency_Name, double amount) {
		for (Currency c : userAtHand.currencyRates) {
			if (c.getName().equals(Currency_Name)) {
				return amount * c.getRate();
			}
		}
		
		// TODO Auto-generated method stub
		return -1;
		// return a error message exception
	}
	
	public double convertForeignCurrency(String Currency_Name) {
		return convertForeignCurrency (Currency_Name, userAtHand.balance);
		//return null;
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
		updateMonthlySavings();
		int numberOfMonths = (int) (price / userAtHand.getSavings());;
	   return numberOfMonths;
	}

	@Override
	public void updateMonthlySavings() {
		double totalMonthlyExpenses = 0;
		for(Expense i : userAtHand.Spending) {
			if (i.foundMonthly) {
				totalMonthlyExpenses += i.getAmount();
			}
			if (i.foundBiweekly) {
				totalMonthlyExpenses += i.getAmount() * 2;
			}
	}	
		double totalMonthlyIncome = 0;
		double totalIncome = 0;
		
		for(Wage i : userAtHand.Income) {
			totalIncome += i.amount;
		}
		totalMonthlyIncome = totalIncome / 12;	
		
		double finalSavings = totalMonthlyIncome - totalMonthlyExpenses;
		userAtHand.setSavings(finalSavings);
		
	}

}



