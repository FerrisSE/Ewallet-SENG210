import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class MenuFrame extends JFrame implements ActionListener {
	//initialize GUI components
	JButton ExpenseReportButton;
	JButton nextButton;
	JButton addIncomeButton;
	JButton addExpenseButton;
	JButton reportsButton;
	ExpenseCalculator brain;

	public MenuFrame(ExpenseCalculator brain) {

        this.brain=brain;
		// create JFrame window
		setTitle("Bank app");
		this.setSize(420, 360);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{406, 0};
		gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		//mainPanel
		JPanel mainPanel = new JPanel();
		GridBagConstraints gbc_mainPanel = new GridBagConstraints();
		gbc_mainPanel.insets = new Insets(0, 0, 5, 0);
		gbc_mainPanel.anchor = GridBagConstraints.NORTH;
		gbc_mainPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_mainPanel.gridx = 0;
		gbc_mainPanel.gridy = 0;
		getContentPane().add(mainPanel, gbc_mainPanel);
		
		//welcome label
		JLabel welcomeLabel = new JLabel("Welcome!");
		mainPanel.add(welcomeLabel);
		
		//Report Expense Button
		ExpenseReportButton = new JButton("Print Expense Report");
		ExpenseReportButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		ExpenseReportButton.setForeground(UIManager.getColor("CheckBox.foreground"));
		ExpenseReportButton.addActionListener(this);
		GridBagConstraints gbc_ExpenseReportButton = new GridBagConstraints();
		gbc_ExpenseReportButton.insets = new Insets(0, 0, 5, 0);
		gbc_ExpenseReportButton.gridx = 0;
		gbc_ExpenseReportButton.gridy = 5;
		getContentPane().add(ExpenseReportButton, gbc_ExpenseReportButton);
		
		//Add income button
		addIncomeButton = new JButton("Add income");
		addIncomeButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		addIncomeButton.setForeground(UIManager.getColor("CheckBox.foreground"));
		addIncomeButton.addActionListener(this);
		GridBagConstraints gbc_addIncomeButton = new GridBagConstraints();
		gbc_addIncomeButton.insets = new Insets(0, 0, 5, 0);
		gbc_addIncomeButton.gridx = 0;
		gbc_addIncomeButton.gridy = 2;
		getContentPane().add(addIncomeButton, gbc_addIncomeButton);
		
		//add expense button
		addExpenseButton = new JButton("Add Expense");
		addExpenseButton.setBackground(UIManager.getColor("Button.darkShadow"));
		addExpenseButton.addActionListener(this);
		
		GridBagConstraints gbc_addExpenseButton = new GridBagConstraints();
		gbc_addExpenseButton.insets = new Insets(0, 0, 5, 0);
		gbc_addExpenseButton.gridx = 0;
		gbc_addExpenseButton.gridy = 3;
		getContentPane().add(addExpenseButton, gbc_addExpenseButton);
		
		reportsButton = new JButton("Reports");
		reportsButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		reportsButton.setForeground(UIManager.getColor("Button.disabledForeground"));
		reportsButton.addActionListener(this);
		
		GridBagConstraints gbc_reportsButton = new GridBagConstraints();
		gbc_reportsButton.gridx = 0;
		gbc_reportsButton.gridy = 4;
		getContentPane().add(reportsButton, gbc_reportsButton);
		
		
		
	//create JFrame window
//		JFrame mainMenu = new JFrame();
			setTitle("Bank app--Main Menu ");
			
			this.setSize(420, 360);
			this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == addIncomeButton) {
			JFrame incomeFrame = new JFrame();
			String incomeName = JOptionPane.showInputDialog(incomeFrame,"Enter Income details separated by space, source, amount,month");
			
			//using split to read 3 values from 1 field, alternatively add a Jframe specific to add income and have 3 fields in it to read source, amount, month. 
			String [] incomeResults = incomeName.split(" "); 
			
			Wage w= new Wage();
			w.source=incomeResults[0];
			w.amount= Double.parseDouble(incomeResults[1]);
			w.month=incomeResults[2];
			
			brain.addMonthlyIncome(w);
			
			System.out.println(incomeName);
		}
		if(event.getSource() == addExpenseButton) {
			JFrame expenseFrame = new JFrame();
			String expenseName = JOptionPane.showInputDialog(expenseFrame,"Enter Expense details spearated by space, source, amount,yealry frequency 1 for once a year 12 for monthly");
			
			String [] expenseResults = expenseName.split(" "); 
			
			Expense e= new Expense();
			e.source=expenseResults[0];
			e.amount= Double.parseDouble(expenseResults[1]);
			e.yearlyFrequency=Integer.parseInt(expenseResults[2]);
			
			
			brain.addExpense(e);
			
			System.out.println(expenseName);
		
		}
		if(event.getSource() == reportsButton) {
			
			//TODO add code to print all expenses or income etc etc in PrintFullreport
		 brain.PrintFullreport();
		}
		
		if(event.getSource() == ExpenseReportButton) {
			brain.PrintExpensereport();
		}
		
	}
	
	//create JFrame window
	//setTitle("Bank app--Main Menu ");
	//this.setSize(420, 360);
	
	// mainPanel
//	JPanel mainPanel = new JPanel();
}
