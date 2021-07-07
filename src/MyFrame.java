import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MyFrame extends JFrame implements ActionListener{
	//initialize variables
		private String firstName;
		private String userName;
		private String password;
		private JTextField firstNameField;
		private JTextField userNameField;
		private JTextField passwordField;
		
		
MyFrame(){
	
	
	//initialize GUI components
			JLabel firstNameLabel;
			JButton nextButton;
			
			
			//create JFrame window
			setTitle("Bank app");
			this.setSize(420, 360);
			
		//mainPanel
			JPanel mainPanel = new JPanel();
			GridBagLayout gbl_mainPanel = new GridBagLayout();
			gbl_mainPanel.columnWidths = new int[]{93, 50, 104, 56, 0};
			gbl_mainPanel.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_mainPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_mainPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			mainPanel.setLayout(gbl_mainPanel);
			getContentPane().add(mainPanel);
			
		//welcomeLabel
			JLabel welcomeLabel = new JLabel("Welcome to Bank App!");
			welcomeLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			GridBagConstraints gbc_welcomeLabel = new GridBagConstraints();
			gbc_welcomeLabel.gridwidth = 2;
			gbc_welcomeLabel.insets = new Insets(0, 0, 5, 5);
			gbc_welcomeLabel.gridx = 1;
			gbc_welcomeLabel.gridy = 1;
			mainPanel.add(welcomeLabel, gbc_welcomeLabel);
			
			
		//firstNameLabel
			firstNameLabel = new JLabel("Enter your first name: ");
			GridBagConstraints gbc_firstNameLabel = new GridBagConstraints();
			gbc_firstNameLabel.anchor = GridBagConstraints.WEST;
			gbc_firstNameLabel.insets = new Insets(0, 0, 5, 5);
			gbc_firstNameLabel.gridx = 1;
			gbc_firstNameLabel.gridy = 3;
			mainPanel.add(firstNameLabel, gbc_firstNameLabel);
			
			
		//firstNameField
			firstNameField = new JTextField();
			GridBagConstraints gbc_firstNameField = new GridBagConstraints();
			gbc_firstNameField.insets = new Insets(0, 0, 5, 5);
			gbc_firstNameField.fill = GridBagConstraints.HORIZONTAL;
			gbc_firstNameField.gridx = 2;
			gbc_firstNameField.gridy = 3;
			mainPanel.add(firstNameField, gbc_firstNameField);
			firstNameField.setColumns(10);
			
		//userNameLabel
			JLabel userNameLabel = new JLabel("Username:");
			GridBagConstraints gbc_userNameLabel = new GridBagConstraints();
			gbc_userNameLabel.anchor = GridBagConstraints.EAST;
			gbc_userNameLabel.insets = new Insets(0, 0, 5, 5);
			gbc_userNameLabel.gridx = 1;
			gbc_userNameLabel.gridy = 4;
			mainPanel.add(userNameLabel, gbc_userNameLabel);
			
		//userNameField
			userNameField = new JTextField();
			GridBagConstraints gbc_userNameField = new GridBagConstraints();
			gbc_userNameField.insets = new Insets(0, 0, 5, 5);
			gbc_userNameField.fill = GridBagConstraints.HORIZONTAL;
			gbc_userNameField.gridx = 2;
			gbc_userNameField.gridy = 4;
			mainPanel.add(userNameField, gbc_userNameField);
			userNameField.setColumns(10);
			
		//passwordLabel
			JLabel passwordLabel = new JLabel("Password:");
			GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
			gbc_passwordLabel.anchor = GridBagConstraints.EAST;
			gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
			gbc_passwordLabel.gridx = 1;
			gbc_passwordLabel.gridy = 5;
			mainPanel.add(passwordLabel, gbc_passwordLabel);
			
		//passwordField
			passwordField = new JTextField();
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.insets = new Insets(0, 0, 5, 5);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 2;
			gbc_passwordField.gridy = 5;
			mainPanel.add(passwordField, gbc_passwordField);
			passwordField.setColumns(10);
			
		//next button
			nextButton = new JButton("Next");
			nextButton.setFocusable(false);
			nextButton.addActionListener(this);
			GridBagConstraints gbc_nextButton = new GridBagConstraints();
			gbc_nextButton.insets = new Insets(0, 0, 5, 5);
			gbc_nextButton.gridx = 2;
			gbc_nextButton.gridy = 7;
			mainPanel.add(nextButton, gbc_nextButton);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		firstName = firstNameField.getText();
		System.out.println(firstName);
		
		userName = userNameField.getText();
		System.out.println(userName);
		
		password = passwordField.getText();
		System.out.println(password);
		
		
		
	}
	
}
