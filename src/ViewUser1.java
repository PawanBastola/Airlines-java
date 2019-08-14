import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ViewUser1 {
	ViewUser1() {
		JFrame frame = new JFrame("View User");
		frame.setSize(650, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 10, 850, 250);
		frame.add(jp);

		// adding the name in the panel.

		JLabel fname = new JLabel("First Name:");
		fname.setBounds(5, 20, 100, 30);

		JTextField fnametextfield = new JTextField();
		fnametextfield.setBounds(120, 20, 120, 30);

		jp.add(fname);
		jp.add(fnametextfield);

		JLabel lname = new JLabel("Last Name:");
		lname.setBounds(5, 65, 100, 30);

		JTextField lnametextfield = new JTextField();
		lnametextfield.setBounds(120, 65, 120, 30);

		jp.add(lname);
		jp.add(lnametextfield);

		// adding the Address in the panel.
		JLabel address = new JLabel("Address:");
		address.setBounds(5, 110, 100, 30);

		JTextField addresstextfield = new JTextField();
		addresstextfield.setBounds(120, 110, 120, 30);

		jp.add(address);
		jp.add(addresstextfield);

		JLabel gender = new JLabel("Gender:");
		gender.setBounds(5, 155, 100, 30);

		jp.add(gender);

		JRadioButton btn = new JRadioButton("Male");
		btn.setBounds(120, 155, 80, 30);
		jp.add(btn);
		JRadioButton btn1 = new JRadioButton("Female");
		btn1.setBounds(200, 155, 80, 30);
		jp.add(btn1);
		ButtonGroup bg = new ButtonGroup();
		bg.add(btn);
		bg.add(btn1);

		// adding the phone in the panel.
		JLabel phone = new JLabel("Emp ID:");
		phone.setBounds(290, 20, 100, 30);

		JTextField phonetextfield = new JTextField();
		phonetextfield.setBounds(400, 20, 120, 30);

		jp.add(phone);
		jp.add(phonetextfield);

		// adding the email in the panel.
		JLabel email = new JLabel("Phone No:");
		email.setBounds(290, 65, 100, 30);

		JTextField emailtextfield = new JTextField();
		emailtextfield.setBounds(400, 65, 120, 30);

		jp.add(email);
		jp.add(emailtextfield);

		// adding the employee id in the panel.
		JLabel employeeid = new JLabel("Email:");
		employeeid.setBounds(290, 110, 100, 30);

		JTextField employeeidtextfield = new JTextField();
		employeeidtextfield.setBounds(400, 110, 120, 30);

		jp.add(employeeid);
		jp.add(employeeidtextfield);

		// adding the date of Birth in the panel.

		JLabel dob1 = new JLabel("D.O.B:");
		dob1.setBounds(290, 155, 100, 30);

		jp.add(dob1);

		JComboBox<Integer> cmb = new JComboBox<Integer>();
		for (int k1 = 2000; k1 <= 2080; k1++) {
			cmb.addItem(k1);
		}
		cmb.setBounds(400, 155, 60, 30);
		jp.add(cmb);

		JComboBox<Integer> cmb1 = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 12; k1++) {
			cmb1.addItem(k1);
		}
		cmb1.setBounds(460, 155, 60, 30);
		jp.add(cmb1);

		JComboBox<Integer> cmb2 = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 31; k1++) {
			cmb2.addItem(k1);
		}
		cmb2.setBounds(520, 155, 60, 30);
		jp.add(cmb2);

		/// end of the register panel

		/*
		 * again creating another panel for (user name, password, confirm password,
		 * cancel button, reset button and sign-up button)
		 */

		JPanel account_register = new JPanel();
		account_register.setLayout(null);
		account_register.setBackground(Color.GRAY);
		account_register.setBounds(0, 270, 950, 300);
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

		JButton save = new JButton("Save");
		save.setBounds(250, 180, 150, 40);
		account_register.add(save);

		/*
		 * bound box haru set gareko xaina font pani milauna baaki xa hai nirajan vaai
		 */

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ViewUser1();
			}
		});
	}

}
