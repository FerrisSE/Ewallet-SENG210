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
		JButton nextButton;
		JButton addIncomeButton;
		JButton addExpenseButton;
		private JButton reportsButton;

	
	MenuFrame() {

		

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
		addExpenseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_addExpenseButton = new GridBagConstraints();
		gbc_addExpenseButton.insets = new Insets(0, 0, 5, 0);
		gbc_addExpenseButton.gridx = 0;
		gbc_addExpenseButton.gridy = 3;
		getContentPane().add(addExpenseButton, gbc_addExpenseButton);
		
		reportsButton = new JButton("Reports");
		reportsButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		reportsButton.setForeground(UIManager.getColor("Button.disabledForeground"));
		reportsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_reportsButton = new GridBagConstraints();
		gbc_reportsButton.gridx = 0;
		gbc_reportsButton.gridy = 4;
		getContentPane().add(reportsButton, gbc_reportsButton);
		
		

		
	

	

	//create JFrame window
		JFrame mainMenu = new JFrame();
			setTitle("Bank app--Main Menu ");
			this.setSize(420, 360);
}


	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == addIncomeButton) {
			JFrame incomeFrame = new JFrame();
			String incomeName = JOptionPane.showInputDialog(incomeFrame,"Enter Income");
		}
		if(event.getSource() == addExpenseButton) {
			JFrame expenseFrame = new JFrame();
			String expenseName = JOptionPane.showInputDialog(expenseFrame,"Enter Expense");
		}
	}
}
