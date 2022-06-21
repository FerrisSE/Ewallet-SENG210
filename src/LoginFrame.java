import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JFrame;

public class LoginFrame extends JFrame implements ActionListener {
	ExpenseCalculator brain;
	// initialize GUI components
	JButton nextButton;

	// initialize variables
	private String userName;
	private String password;
	private JTextField userNameField;
	private JTextField passwordField;
	// initialize GUI components
	//JButton nextButton;


	// boolean variables
	boolean foundDigit = false;
	boolean foundUpperCase = false;
	boolean foundLowerCase = false;
	boolean foundSymbol = false;
	boolean foundLength = false;

	// getters
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public JTextField getUserNameField() {
		return userNameField;
	}

	public JTextField getPasswordField() {
		return passwordField;
	}

	// setters
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserNameField(JTextField userNameField) {
		this.userNameField = userNameField;

	}

	public void setPasswordField(JTextField passwordField) {
		this.passwordField = passwordField;
	}

	public LoginFrame(ExpenseCalculator brain) {
		this.brain=brain;
		// create JFrame window
		setTitle("Bank app");
		this.setSize(420, 360);

		// mainPanel
		JPanel mainPanel = new JPanel();
		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWidths = new int[] { 93, 50, 104, 56, 0 };
		gbl_mainPanel.rowHeights = new int[] { 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_mainPanel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_mainPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		mainPanel.setLayout(gbl_mainPanel);
		getContentPane().add(mainPanel);

		// welcomeLabel
		JLabel welcomeLabel = new JLabel("Welcome to Bank App!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_welcomeLabel = new GridBagConstraints();
		gbc_welcomeLabel.gridwidth = 2;
		gbc_welcomeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_welcomeLabel.gridx = 1;
		gbc_welcomeLabel.gridy = 1;
		mainPanel.add(welcomeLabel, gbc_welcomeLabel);

		// userNameLabel
		JLabel userNameLabel = new JLabel("Username:");
		GridBagConstraints gbc_userNameLabel = new GridBagConstraints();
		gbc_userNameLabel.anchor = GridBagConstraints.EAST;
		gbc_userNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_userNameLabel.gridx = 1;
		gbc_userNameLabel.gridy = 3;
		mainPanel.add(userNameLabel, gbc_userNameLabel);

		// userNameField
		userNameField = new JTextField();
		GridBagConstraints gbc_userNameField = new GridBagConstraints();
		gbc_userNameField.insets = new Insets(0, 0, 5, 5);
		gbc_userNameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_userNameField.gridx = 2;
		gbc_userNameField.gridy = 3;
		mainPanel.add(userNameField, gbc_userNameField);
		userNameField.setColumns(10);
		userName = userNameField.getText();

			// passwordLabel
			JLabel passwordLabel = new JLabel("Password:");
			GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
			gbc_passwordLabel.anchor = GridBagConstraints.EAST;
			gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
			gbc_passwordLabel.gridx = 1;
			gbc_passwordLabel.gridy = 4;
			mainPanel.add(passwordLabel, gbc_passwordLabel);

			// passwordField
			passwordField = new JTextField();
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.insets = new Insets(0, 0, 5, 5);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 2;
			gbc_passwordField.gridy = 4;
			mainPanel.add(passwordField, gbc_passwordField);
			passwordField.setColumns(10);
			password = passwordField.getText();

		// next button
		nextButton = new JButton("Next");
		nextButton.setFocusable(false);
		nextButton.addActionListener(this);
		GridBagConstraints gbc_nextButton = new GridBagConstraints();
		gbc_nextButton.insets = new Insets(0, 0, 5, 5);
		gbc_nextButton.gridx = 2;
		gbc_nextButton.gridy = 6;
		mainPanel.add(nextButton, gbc_nextButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}


/*	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == nextButton) {
			MenuFrame mFrame = new MenuFrame();
			userName = userNameField.getText();
			System.out.println(userName);

			password = passwordField.getText();
			System.out.println(password);
		}}
	public boolean Validate() throws IOException {

		// open file and starts verifying username and password against the text file
		System.out.println("Opening file... "); // Opening file confidentialInfo.txt.
		FileInputStream fileByteStream = new FileInputStream("checkLogin.txt"); // created a new fileInputStream
		Scanner inFS = new Scanner(fileByteStream);

		System.out.println("Verifying your username and password.");
		while (inFS.hasNext()) {
			String verifyUsername = inFS.next();
			String verifyPassword = inFS.next();
			if (userName.equals(verifyUsername) && password.equals(verifyPassword)) {

				JOptionPane.showMessageDialog(this, "login success!");
				return true;
			}

		}
		// only when we are out of the loop, we are sure un/pwd not found
		JOptionPane.showMessageDialog(this, "Username or password not found!");
		System.out.println("Username not found");
		// close checkLogin.txt file
		System.out.println("Closing program...");
		fileByteStream.close();
		return false;
	}
		}
		
	}
	*/
 public boolean Validate() throws IOException {
	
	 //open file and starts verifying username and password against the text file
			System.out.println("Opening file... "); //Opening file confidentialInfo.txt.
		    FileInputStream fileByteStream = new FileInputStream("checkLogin.txt"); //created a new fileInputStream
		    Scanner inFS = new Scanner(fileByteStream);
		    
		    
		    System.out.println("Verifying your username and password.");
		    while (inFS.hasNext()) {
		    	String verifyUsername = inFS.next();
		    	String verifyPassword = inFS.next();
		    	 if (userName.equals(verifyUsername) && password.equals(verifyPassword)){
		    		
		    		 JOptionPane.showMessageDialog(this,"login Success!");
		    		 return true; 
		    	 }
		    	 
		    }
		    //only when we are out of the loop, we are sure un/pwd not found
	    	JOptionPane.showMessageDialog(this,"Username or password not found!");
	    	System.out.println("Username not found");
			 //close checkLogin.txt file
			System.out.println("Closing program...");  
			fileByteStream.close(); 
			return false;
 }
	

	@Override
	public void actionPerformed(ActionEvent event) {
		
		userName = userNameField.getText();
		System.out.println(userName);
		
		password = passwordField.getText();
		System.out.println(password);
		try {
			if (Validate()) {
				//String sucessLogin = null;
				//sucessLogin = JOptionPane.showInputDialog(this,"Success1!.");
				//TODOs login success message box 
				
				// run the menuframe
				//create object of the second frame and hide this frame
				JOptionPane.showMessageDialog(this,"login Success!");
				new MenuFrame(brain).setVisible(true);
				this.setVisible(false);
				
			//equivalent to --> MenuFrame mFrame = new MenuFrame();
			}
			else {
				String failLogin = null;
				failLogin = JOptionPane.showInputDialog(failLogin,"Failed login. Try again.");
				System.out.println(" failed login try again");
			}
		} catch (IOException e) {
			System.out.println(" login file exception");
			e.printStackTrace();
		}
	}
}


