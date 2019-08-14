import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class update_delete_customerdetails {

	update_delete_customerdetails(String tno) {

		Connect connect = new Connect();

		JFrame frame = new JFrame("update and cancel ticket");
		frame.setSize(300, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel cname = new JLabel("customer name:");
		cname.setBounds(0, 10, 100, 20);
		frame.add(cname);

		JTextField namefield = new JTextField();
		namefield.setBounds(100, 10, 70, 20);
		frame.add(namefield);

		// for father name
		JLabel citizenship = new JLabel("Citizenship no.:");
		citizenship.setBounds(0, 40, 100, 20);
		frame.add(citizenship);

		JTextField citizenfield = new JTextField();
		citizenfield.setBounds(100, 40, 70, 20);
		frame.add(citizenfield);

		// for gender selection
		JLabel gender = new JLabel("gender:");
		gender.setBounds(0, 70, 70, 20);
		frame.add(gender);

		JRadioButton male = new JRadioButton("male");
		male.setBounds(80, 70, 70, 20);
		frame.add(male);

		JRadioButton female = new JRadioButton("female");
		female.setBounds(160, 70, 70, 20);
		frame.add(female);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(male);
		group1.add(female);

		/*
		 * // for date of birth JLabel year1 = new JLabel("D-O-B:"); year1.setBounds(0,
		 * 125, 40, 20); frame.add(year1);
		 * 
		 * JComboBox<Integer> cmbBox = new JComboBox<Integer>(); for (int k1 = 2000; k1
		 * <= 2080; k1++) { cmbBox.addItem(k1); } cmbBox.setBounds(50, 125, 60, 20);
		 * frame.add(cmbBox);
		 * 
		 * JComboBox<Integer> cmb1Box = new JComboBox<Integer>(); for (int k1 = 1; k1 <=
		 * 12; k1++) { cmb1Box.addItem(k1); } cmb1Box.setBounds(115, 125, 40, 20);
		 * frame.add(cmb1Box);
		 * 
		 * JComboBox<Integer> cmb2 = new JComboBox<Integer>(); for (int k1 = 1; k1 <=
		 * 30; k1++) { cmb2.addItem(k1); } cmb2.setBounds(160, 125, 40, 20);
		 * frame.add(cmb2);
		 */
		// for phone number
		JLabel phone = new JLabel("phone:");
		phone.setBounds(0, 100, 60, 20);
		frame.add(phone);

		JTextField phonefield = new JTextField();
		phonefield.setBounds(60, 100, 60, 20);
		frame.add(phonefield);

		/*
		 * // for nationality JLabel nationality = new JLabel("nationality:");
		 * nationality.setBounds(0, 175, 70, 20); frame.add(nationality);
		 * 
		 * String[] snationality = { "Nationality", "Nepal", "India", "Australia",
		 * "America", "New Zealand", "Canada", "Germany" }; JComboBox<String>
		 * nationselect = new JComboBox<String>(snationality);
		 * nationselect.setBounds(70, 175, 105, 20); frame.add(nationselect);
		 */

		// for address
		JLabel address = new JLabel("address:");
		address.setBounds(0, 130, 70, 20);
		frame.add(address);

		JTextField addressfield = new JTextField();
		addressfield.setBounds(80, 130, 70, 20);
		frame.add(addressfield);

		// date of journey

		/*
		 * JLabel dateofjourney = new JLabel("date:"); dateofjourney.setBounds(0, 230,
		 * 40, 20); frame.add(dateofjourney);
		 * 
		 * JComboBox<Integer> cmb1Box2 = new JComboBox<Integer>(); for (int k1 = 2000;
		 * k1 <= 2080; k1++) { cmb1Box2.addItem(k1); } cmb1Box2.setBounds(50, 230, 50,
		 * 20); frame.add(cmb1Box2);
		 * 
		 * JComboBox<Integer> cmb2Box = new JComboBox<Integer>(); for (int k1 = 1; k1 <=
		 * 12; k1++) { cmb2Box.addItem(k1); } cmb2Box.setBounds(110, 230, 40, 20);
		 * frame.add(cmb2Box);
		 * 
		 * JComboBox<Integer> cmb3Box = new JComboBox<Integer>(); for (int k1 = 1; k1 <=
		 * 30; k1++) { cmb3Box.addItem(k1); } cmb3Box.setBounds(160, 230, 40, 20);
		 * frame.add(cmb3Box);
		 */
		// for flight id
		JLabel flightid = new JLabel("flight id:");
		flightid.setBounds(0, 160, 80, 20);
		frame.add(flightid);

		JTextField flightidfield = new JTextField();
		flightidfield.setBounds(90, 160, 80, 20);
		frame.add(flightidfield);

		// for seat number
		JLabel seatno = new JLabel("seat no.:");
		seatno.setBounds(0, 190, 80, 20);
		frame.add(seatno);

		JTextField seatnofield = new JTextField();
		seatnofield.setBounds(90, 190, 50, 20);
		frame.add(seatnofield);

		JLabel class1 = new JLabel("Class");
		class1.setBounds(0, 230, 80, 20);
		frame.add(class1);

		JTextField classfield = new JTextField();
		classfield.setBounds(90, 230, 50, 20);
		frame.add(classfield);

		JButton update = new JButton("Update");
		update.setBounds(0, 270, 80, 20);
		frame.add(update);

		try {
			String sqlsearchname = "SELECT * FROM `customerdetails` where `ticketno`='" + tno + "'";
			ResultSet rs = connect.display(sqlsearchname);
			while (rs.next()) {

				namefield.setText(rs.getString(3).toString());
				citizenfield.setText(rs.getString(4).toString());
				// gender
				if (rs.getString(5).equals("male")) {
					male.setSelected(true);
				} else
					female.setSelected(true);

				// gender

				// combo
				// date of birth
				// combo
				phonefield.setText(rs.getString(7).toString());

				// nation

				// nation
				addressfield.setText(rs.getString(9).toString());

				// date of journey

				// date of journey
				flightidfield.setText(rs.getString(11).toString());
				seatnofield.setText(rs.getString(12).toString());
				classfield.setText(rs.getString(13).toString());

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				String updatenamefield = namefield.getText().toString();
				int updatecitizenfield = Integer.parseInt(citizenfield.getText().toString());
				String updategender = null;

				if (male.isSelected()) {
					updategender = "male";
				}
				if (female.isSelected()) {
					updategender = "female";
				}

				String updatephonefield = phonefield.getText().toString();
				String updateaddressfield = addressfield.getText().toString();
				int updateflightidfield = Integer.parseInt(flightid.getText().toString());
				int sseatnofield = Integer.parseInt(seatnofield.getText().toString());
				String sclassfield = classfield.getText().toString();

				String sqlupdate = "UPDATE `customerdetails` SET `name`='" + updatenamefield + "',`citizenshipno`='"
						+ updatecitizenfield + "',`gender`='" + updategender + "',`phone`='" + updatephonefield + "',`address`='"
						+ updateaddressfield + "',`flightid`='" + updateflightidfield + "',`seatno`='" + sseatnofield
						+ "',`class`='" + sclassfield + "' WHERE `ticketno`='" + tno + "'";
				connect.append(sqlupdate, "updated");
			}

		});

//sql ko rs.getString(1) ho yesto mileko xaina.	
	}

}
