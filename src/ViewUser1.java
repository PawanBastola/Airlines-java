
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ViewUser1 {

    ViewUser1(String employeeid) {
        Connect connect = new Connect();

        JFrame frame = new JFrame("Update user details");
        frame.setSize(650, 460);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.GRAY);
        jp.setBounds(0, 0, 850, 200);
        frame.add(jp);

		// adding the name in the panel.
        JLabel fname = new JLabel("First Name:");
        fname.setBounds(5, 10, 100, 30);

        JTextField fnametextfield = new JTextField();
        fnametextfield.setBounds(120, 10, 120, 30);

        jp.add(fname);
        jp.add(fnametextfield);

        // adding the Address in the panel.
        JLabel address = new JLabel("Address:");
        address.setBounds(5, 95, 100, 30);

        JTextField addresstextfield = new JTextField();
        addresstextfield.setBounds(120, 95, 120, 30);

        jp.add(address);
        jp.add(addresstextfield);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(5, 135, 100, 30);

        jp.add(gender);

        JRadioButton btn = new JRadioButton("Male");
        btn.setBounds(120, 135, 80, 30);
        jp.add(btn);
        JRadioButton btn1 = new JRadioButton("Female");
        btn1.setBounds(200, 135, 80, 30);
        jp.add(btn1);
        ButtonGroup bg = new ButtonGroup();
        bg.add(btn);
        bg.add(btn1);

		// adding the phone in the panel.
        JLabel lname = new JLabel("Last Name:");
        lname.setBounds(290, 10, 100, 30);

        JTextField lnametextfield = new JTextField();
        lnametextfield.setBounds(400, 10, 120, 30);

        jp.add(lname);
        jp.add(lnametextfield);

        // adding the email in the panel.
        JLabel phone = new JLabel("Phone No:");
        phone.setBounds(5, 55, 100, 30);

        JTextField phonetextfield = new JTextField();
        phonetextfield.setBounds(120, 55, 120, 30);

        jp.add(phone);
        jp.add(phonetextfield);

        // adding the employee id in the panel.
        JLabel email = new JLabel("Email:");
        email.setBounds(290, 55, 100, 30);

        JTextField emailtextfield = new JTextField();
        emailtextfield.setBounds(400, 55, 120, 30);

        jp.add(email);
        jp.add(emailtextfield);

		// adding the date of Birth in the panel.
        JLabel dob1 = new JLabel("D.O.B:");
        dob1.setBounds(290, 95, 100, 30);

        jp.add(dob1);

        JComboBox<Integer> cmb = new JComboBox<Integer>();
        for (int k1 = 2000; k1 <= 2080; k1++) {
            cmb.addItem(k1);
        }
        cmb.setBounds(400, 95, 60, 30);
        jp.add(cmb);

        JComboBox<Integer> cmb1 = new JComboBox<Integer>();
        for (int k1 = 1; k1 <= 12; k1++) {
            cmb1.addItem(k1);
        }
        cmb1.setBounds(460, 95, 60, 30);
        jp.add(cmb1);

        JComboBox<Integer> cmb2 = new JComboBox<Integer>();
        for (int k1 = 1; k1 <= 31; k1++) {
            cmb2.addItem(k1);
        }
        cmb2.setBounds(520, 95, 60, 30);
        jp.add(cmb2);

		/// end of the register panel

        /*
         * again creating another panel for (user name, password, confirm password,
         * cancel button, reset button and sign-up button)
         */
		// account_register panel starts
        JPanel account_register = new JPanel();
        account_register.setLayout(null);
        account_register.setBackground(Color.GRAY);
        account_register.setBounds(0, 210, 950, 220);
        frame.add(account_register);

        // addding user name in the account_register panel
        JLabel username = new JLabel("Username");
        username.setBounds(5, 30, 100, 30);

        JTextField usernametextfield = new JTextField();
        usernametextfield.setBounds(120, 30, 120, 30);

        account_register.add(username);
        account_register.add(usernametextfield);

        String type[] = {"admin", "user"};

        JComboBox<String> usertype = new JComboBox<String>(type);
        usertype.setBounds(315, 30, 70, 30);
        account_register.add(usertype);

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
		/*
         * JButton delete = new JButton("Delete"); delete.setBounds(60, 180, 150, 30);
         * account_register.add(delete);
         * 
         * JButton update = new JButton("Update"); update.setBounds(250, 180, 150, 30);
         * account_register.add(update);
         */
        JButton update = new JButton("Update");
        update.setBounds(440, 170, 150, 30);

        account_register.add(update);

        ////////////////////////
        try {
            String sqlemployeeempid = "SELECT * FROM `employee` where `empid`='" + employeeid + "'";
            ResultSet rs = connect.display(sqlemployeeempid);
            while (rs.next()) {

                fnametextfield.setText(rs.getString(2).toString());

                lnametextfield.setText(rs.getString(3).toString());
                phonetextfield.setText(rs.getString(5).toString());
                emailtextfield.setText(rs.getString(6).toString());
                addresstextfield.setText(rs.getString(8).toString());
                // gender
                if (rs.getString(4).equals("male")) {
                    btn.setSelected(true);
                } else {
                    btn1.setSelected(true);
                }
                // gender

                String dateofbirthtobeset = rs.getString(7).toString();
                int yr = Integer.parseInt(dateofbirthtobeset.substring(0, 4));
                cmb.setSelectedItem(yr);

                int mth = Integer.parseInt(dateofbirthtobeset.substring(5, 7));
                cmb1.setSelectedItem(mth);

                int dy = Integer.parseInt(dateofbirthtobeset.substring(8, 10));
                cmb2.setSelectedItem(dy);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sqlsearchadminanduser = "SELECT * FROM `adminanduser` where `empide`='" + employeeid + "'";
            ResultSet ps = connect.display(sqlsearchadminanduser);
            while (ps.next()) {

                String usertypeselect = ps.getString(4).toString();

                usertype.setSelectedItem(usertypeselect);

                // date of journey
                usernametextfield.setText(ps.getString(2).toString());
                passwordfield.setText(ps.getString(3).toString());
                confirmpasswordfield.setText(ps.getString(3).toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

                ////////////////////////
//account_register panel ends here
        // for sql
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // for employee details insertion
                String fname = fnametextfield.getText().toString();
                String lname = lnametextfield.getText().toString();
                String saddress = addresstextfield.getText().toString();

                // for btn male and female
                String sgender = null;
                if (btn.isSelected()) {
                    sgender = "male";
                }
                if (btn1.isSelected()) {
                    sgender = "female";
                }
					// end

                String sphone = phonetextfield.getText().toString();
                String semail = emailtextfield.getText().toString();

                // for combo box
                String syear = cmb.getSelectedItem().toString();
                String smonth = cmb1.getSelectedItem().toString();
                String sday = cmb2.getSelectedItem().toString();
                // combo concatenate
                String sdob = syear + "/" + smonth + "/" + sday; // date of birth so to store in proper formate in

                // for username and password
                String uname = usernametextfield.getText().toString();
                String confirmedpass = String.valueOf(confirmpasswordfield.getPassword());
                String utype = usertype.getSelectedItem().toString();
					// sql query to insert

				// sql(in localhost)
                // ends
                try {
                    String sqlemp = "UPDATE `employee` set first_name='" + fname + "',last_name='" + lname + "',gender='" + sgender + "',phone='" + sphone + "',email='" + semail + "',date_of_birth='" + sdob + "',address='" + saddress + "' WHERE empid='" + employeeid + "'";

                    connect.insert(sqlemp);

                    String sql = "UPDATE  `adminanduser` SET userid='" + uname + "',password='" + confirmedpass + "',usertype='" + utype + "' WHERE empide='" + employeeid + "'";
                    connect.append(sql, "upadated");

                    frame.dispose();
                    new ViewUser();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });

    }

}
