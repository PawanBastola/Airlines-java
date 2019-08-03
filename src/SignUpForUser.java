import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class SignUpForUser {
	SignUpForUser(){
		JFrame frame=new JFrame("Sign Up For New User");
		frame.setSize(600, 680);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		

		// panel for retrieving (name, address, phone, email, Employee id ,Date of
		// Birth)
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 10, 750, 350);
		frame.add(jp);

		// adding the name in the panel.
		JLabel name = new JLabel("Name:");
		name.setBounds(5, 5, 100, 30);
		name.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField nametextfield = new JTextField();
		nametextfield.setBounds(150, 5, 250, 30);

		jp.add(name);
		jp.add(nametextfield);

		// adding the Address in the panel.
		JLabel address = new JLabel("Address:");
		address.setBounds(5, 50, 150, 30);
		address.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField addresstextfield = new JTextField();
		addresstextfield.setBounds(150, 50, 250, 30);

		jp.add(address);
		jp.add(addresstextfield);

		// adding the phone in the panel.
		JLabel phone = new JLabel("Phone:");
		phone.setBounds(5, 95, 100, 30);
		phone.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField phonetextfield = new JTextField();
		phonetextfield.setBounds(150, 95, 250, 30);

		jp.add(phone);
		jp.add(phonetextfield);

		// adding the email in the panel.
		JLabel email = new JLabel("Email:");
		email.setBounds(5, 140, 100, 30);
		email.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField emailtextfield = new JTextField();
		emailtextfield.setBounds(150, 140, 250, 30);

		jp.add(email);
		jp.add(emailtextfield);

		// adding the employee id in the panel.
		JLabel employeeid = new JLabel("Emp Id:");
		employeeid.setBounds(5, 185, 150, 30);
		employeeid.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField employeeidtextfield = new JTextField();
		employeeidtextfield.setBounds(150, 185, 250, 30);

		jp.add(employeeid);
		jp.add(employeeidtextfield);

		// adding the date of Birth in the panel.
		
		  JLabel dob1 = new JLabel("D.O.B:"); 
		  dob1.setBounds(5,230,150,30);
		  dob1.setFont(new Font("moonspace",Font.BOLD,20));
		  JTextField dobtextfield1 = new JTextField();
		  dobtextfield1.setBounds(150,230,250,30);
		  
		  jp.add(dob1);
		  jp.add(dobtextfield1);
		  
		  JButton btn3=new JButton("RESET");
		  btn3.setBounds(240,280,120,60);
		  btn3.setBackground(Color. orange);
		  jp.add(btn3);
		  
		 /// end of the register panel

		/*
		 * again creating another panel for (user name, password, confirm password,
		 * cancel button, reset button and sign-up button)
		 */

		JPanel account_register = new JPanel();
		account_register.setLayout(null);
		account_register.setBackground(Color.GRAY);
		account_register.setBounds(0, 365, 850, 290);
		frame.add(account_register);

		// addding user name in the account_register panel
		JLabel username = new JLabel("Username");
		username.setBounds(5, 30, 100, 30);
		username.setFont(new Font("moonspace", Font.BOLD, 20));
		JTextField usernametextfield = new JTextField();
		usernametextfield.setBounds(150, 30, 250, 30);

		account_register.add(username);
		account_register.add(usernametextfield);

		// adding password in the account_register panel
		JLabel password = new JLabel("Password");
		password.setBounds(5, 75, 100, 30);
		password.setFont(new Font("moonspace", Font.BOLD, 20));
		JPasswordField passwordfield = new JPasswordField();
		passwordfield.setBounds(150, 75, 250, 30);

		account_register.add(password);
		account_register.add(passwordfield);

		// adding confirm password in the account_register panel
		JLabel confirmpassword = new JLabel("Confirm Password");
		confirmpassword.setBounds(5, 120, 100, 30);
		confirmpassword.setFont(new Font("moonspace", Font.BOLD, 20));
		JPasswordField confirmpasswordfield = new JPasswordField();
		confirmpasswordfield.setBounds(150, 120, 250, 30);

		account_register.add(confirmpassword);
		account_register.add(confirmpasswordfield);

		// adding reset button in the account_register panel

		JButton reset = new JButton("Reset");
		reset.setBounds(10, 180, 120, 60);

		account_register.add(reset);
		reset.setBackground(Color.yellow);

		// adding cancel button in the account_register panel

		JButton cancel = new JButton("Cancel");
		cancel.setBounds(240, 180, 120, 60);

		account_register.add(cancel);
		cancel.setBackground(Color. orange);
		// adding sign up button in the account_register panel

		JButton sign_up = new JButton("Sign Up");
		sign_up.setBounds(460, 180, 120, 60);

		account_register.add(sign_up);
		sign_up.setBackground(Color.green);

		/*
		 * bound box haru set gareko xaina font pani milauna baaki xa hai nirajan vaai
		 */

	}






public static void main(String[]args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new SignUpForUser();
		}
	});
}
}
	


