import javax.swing.*;

import MonthlyIncomeTracker.IncomeEntry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MonthlyExpenseTracker extends JFrame implements ActionListener {
    private JTextField numExpensesField;
    private JButton calculateButton;
    private JButton readFileButton;
    public double totalExpense = 0.0;
    public double amount = 0.0;

    public double getTotalExpense() {
        return totalExpense;
    }

    public MonthlyExpenseTracker() {
        setTitle("Monthly Expense Tracker");

        // Number of Expenses Label and Text Field
        JLabel numExpensesLabel = new JLabel("Number of Expenses:");
        numExpensesField = new JTextField(10);

        // Calculate Button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        
        // Read File Button
        readFileButton = new JButton("Read File");
        readFileButton.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());
        add(numExpensesLabel);
        add(numExpensesField);
        add(calculateButton);
        add(readFileButton);

        pack();
        setSize(850, 100);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateExpenses();
            generateReport();
        } else if (e.getSource() == readFileButton) {
        	readExpenseFile();
        }
    }

    public void calculateExpenses() {
        int numExpenses = Integer.parseInt(numExpensesField.getText());
        totalExpense = 0.0; // Assign the value to the member variable

        // Amount of each expense
        for (int i = 1; i <= numExpenses; i++) {
            String amountStr = JOptionPane.showInputDialog(null, "Enter the expense amount for expense #" + i + ":", "Expense Amount", JOptionPane.PLAIN_MESSAGE);

            amount = Double.parseDouble(amountStr);

            totalExpense += amount;
        }
    }
    
    public void readExpenseFile() {
    	
    	 try {
    	      File file = new File("ExpenseFile");
    	      Scanner scnr = new Scanner(file);
    	      scnr.useDelimiter("\n");
    	      while (scnr.hasNextLine()) {
    	    	  System.out.println("test");
    	    	  amount = Double.parseDouble(scnr.nextLine());
    	    	  totalExpense += amount;
    	      }
    	      System.out.println("Success!");
    	      generateReport();
    	      scnr.close();
    	    } catch (FileNotFoundException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    }

    public void generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Monthly Expense Report:\n");
        report.append("----------------------\n");

        int numExpenses = Integer.parseInt(numExpensesField.getText());

        // Amount of each expense
        for (int i = 1; i <= numExpenses; i++) {
            double amount = totalExpense / numExpenses;
            report.append("Expense #" + i + ": $" + amount + "\n");
        }

        // Total Expense
        report.append("----------------------\n");
        report.append("Total Monthly Expense: $" + getTotalExpense() + "\n");
        report.append("----------------------\n");

        JOptionPane.showMessageDialog(this, report.toString(), "Expense Report", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MonthlyExpenseTracker::new);
    }
}

