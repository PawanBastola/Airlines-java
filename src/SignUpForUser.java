import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class SignUpForUser {
	SignUpForUser(){
		JFrame frame=new JFrame("Sign Up For New User");
		frame.setSize(650, 450);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		

		// panel for retrieving (name, address, phone, email, Employee id ,Date of
		// Birth)
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 10, 750, 220);
		frame.add(jp);

		// adding the name in the panel.
		JLabel fname = new JLabel("First Name:");
		fname.setBounds(5, 5, 100, 30);
		
		JTextField fnametextfield = new JTextField();
		fnametextfield.setBounds(120, 5, 120, 30);

		jp.add(fname);
		jp.add(fnametextfield);
		
		JLabel lname = new JLabel("Last Name:");
		lname.setBounds(5, 50, 100, 30);
		
		JTextField lnametextfield = new JTextField();
		lnametextfield.setBounds(120, 50, 120, 30);

		jp.add(lname);
		jp.add(lnametextfield);

		// adding the Address in the panel.
		JLabel address = new JLabel("Address:");
		address.setBounds(5, 95, 100, 30);
		 
		JTextField addresstextfield = new JTextField();
		addresstextfield.setBounds(120, 95, 120, 30);

		jp.add(address);
		jp.add(addresstextfield);
		
		JLabel gender = new JLabel("Gender:");
		gender.setBounds(5, 140, 100, 30);
		 
		

		jp.add(gender);
		
		
		 JRadioButton btn=new JRadioButton("Male");
		    btn.setBounds(120,140,80,30);
		   jp.add(btn);
		    JRadioButton btn1=new JRadioButton("Female");
		    btn1.setBounds(200,140,80,30);
		    jp.add(btn1);
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(btn);
		    bg.add(btn1);
		

		// adding the phone in the panel.
		JLabel phone = new JLabel("Emp ID:");
		phone.setBounds(290,5, 100, 30);
		 
		JTextField phonetextfield = new JTextField();
		phonetextfield.setBounds(400, 5, 120, 30);

		jp.add(phone);
		jp.add(phonetextfield);

		// adding the email in the panel.
		JLabel email = new JLabel("Phone No:");
		email.setBounds(290, 50, 100, 30);
		 
		JTextField emailtextfield = new JTextField();
		emailtextfield.setBounds(400, 50, 120, 30);

		jp.add(email);
		jp.add(emailtextfield);

		// adding the employee id in the panel.
		JLabel employeeid = new JLabel("Email:");
		employeeid.setBounds(290, 95, 100, 30);
		
		JTextField employeeidtextfield = new JTextField();
		employeeidtextfield.setBounds(400, 95, 120, 30);

		jp.add(employeeid);
		jp.add(employeeidtextfield);

		// adding the date of Birth in the panel.
		
		  JLabel dob1 = new JLabel("D.O.B:"); 
		  dob1.setBounds(290,140,100,30);
		   
		  
		  
		  jp.add(dob1);
		  
		  JComboBox<Integer>cmb=new JComboBox<Integer>();
			for(int k1=2000;k1<=2080;k1++) {
				cmb.addItem(k1);
			}
			cmb.setBounds(400, 140, 60, 30);
		    jp.add(cmb);
		    
		    
			JComboBox<Integer>cmb1=new JComboBox<Integer>();
			for(int k1=1;k1<=12;k1++) {
				cmb1.addItem(k1);
			}
			cmb1.setBounds(460, 140, 60, 30);
		    jp.add(cmb1);
		    
		    
			JComboBox<Integer>cmb2=new JComboBox<Integer>();
			for(int k1=1;k1<=31;k1++) {
				cmb2.addItem(k1);
			}
			cmb2.setBounds(520, 140, 60, 30);
		    jp.add(cmb2);

		  
		  
		  
		  
		 /// end of the register panel

		/*
		 * again creating another panel for (user name, password, confirm password,
		 * cancel button, reset button and sign-up button)
		 */

		JPanel account_register = new JPanel();
		account_register.setLayout(null);
		account_register.setBackground(Color.GRAY);
		account_register.setBounds(0, 240, 850, 300);
		frame.add(account_register);

		// addding user name in the account_register panel
		JLabel username = new JLabel("Username");
		username.setBounds(5, 30, 100, 30);
		 
		JTextField usernametextfield = new JTextField();
		usernametextfield.setBounds(120, 30, 120, 30);

		account_register.add(username);
		account_register.add(usernametextfield);

		// adding password in the account_register panel
		JLabel password = new JLabel("Password");
		password.setBounds(5, 75, 100, 30);
	
		JPasswordField passwordfield = new JPasswordField();
		passwordfield.setBounds(120, 75, 120, 30);

		account_register.add(password);
		account_register.add(passwordfield);

		// adding confirm password in the account_register panel
		JLabel confirmpassword = new JLabel("Confirm Password");
		confirmpassword.setBounds(5, 120, 120, 30);
		
		JPasswordField confirmpasswordfield = new JPasswordField();
		confirmpasswordfield.setBounds(120, 120, 120, 30);

		account_register.add(confirmpassword);
		account_register.add(confirmpasswordfield);

		// adding reset button in the account_register panel

		
		// adding sign up button in the account_register panel

		JButton sign_up = new JButton("Add User");
		sign_up.setBounds(460, 120, 150, 50);

		account_register.add(sign_up);
		

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
	


