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

	update_delete_customerdetails(String cuid) {

		Connect connect = new Connect();

		JFrame frame = new JFrame("update ticket");
		frame.setSize(300, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel tnum = new JLabel("ticket no:");
		tnum.setBounds(0, 5, 100, 20);
		frame.add(tnum);

		JTextField tnumfield = new JTextField();
		tnumfield.setBounds(100, 5, 70, 20);
		frame.add(tnumfield);
//

		JLabel cid = new JLabel("customerid:");
		cid.setBounds(0, 35, 100, 20);
		frame.add(cid);

		JTextField cidfield = new JTextField();
		cidfield.setBounds(100, 35, 70, 20);
		frame.add(cidfield);
//

		JLabel cname = new JLabel("customer name:");
		cname.setBounds(0, 65, 100, 20);
		frame.add(cname);

		JTextField namefield = new JTextField();
		namefield.setBounds(100, 65, 70, 20);
		frame.add(namefield);

		// for father name
		JLabel citizenship = new JLabel("Citizenship no.:");
		citizenship.setBounds(0, 95, 100, 20);
		frame.add(citizenship);

		JTextField citizenfield = new JTextField();
		citizenfield.setBounds(100, 95, 70, 20);
		frame.add(citizenfield);

		// for gender selection
		JLabel gender = new JLabel("gender:");
		gender.setBounds(0, 1255, 70, 20);
		frame.add(gender);

		JRadioButton male = new JRadioButton("male");
		male.setBounds(80, 125, 70, 20);
		frame.add(male);

		JRadioButton female = new JRadioButton("female");
		female.setBounds(160, 125, 70, 20);
		frame.add(female);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(male);
		group1.add(female);

		// for date of birth
		JLabel year1 = new JLabel("D-O-B:");
		year1.setBounds(0, 155, 40, 20);
		frame.add(year1);

		JComboBox<Integer> cmbBox = new JComboBox<Integer>();
		for (int k1 = 2000; k1 <= 2080; k1++) {
			cmbBox.addItem(k1);
		}
		cmbBox.setBounds(50, 155, 60, 20);
		frame.add(cmbBox);

		JComboBox<Integer> cmb1Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 12; k1++) {
			cmb1Box.addItem(k1);
		}
		cmb1Box.setBounds(115, 155, 40, 20);
		frame.add(cmb1Box);

		JComboBox<Integer> cmb2 = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 30; k1++) {
			cmb2.addItem(k1);
		}
		cmb2.setBounds(160, 155, 40, 20);
		frame.add(cmb2);

//
		// for phone number
		JLabel phone = new JLabel("phone:");
		phone.setBounds(0, 185, 60, 20);
		frame.add(phone);

		JTextField phonefield = new JTextField();
		phonefield.setBounds(60, 185, 60, 20);
		frame.add(phonefield);

		// for nationality
		JLabel nationality = new JLabel("nationality:");
		nationality.setBounds(0, 215, 70, 20);
		frame.add(nationality);

		String[] snationality = { "Nationality", "Nepal", "India", "Australia", "America", "New Zealand", "Canada",
				"Germany" };
		JComboBox<String> nationselect = new JComboBox<String>(snationality);
		nationselect.setBounds(70, 215, 105, 20);
		frame.add(nationselect);

		// for address
		JLabel address = new JLabel("address:");
		address.setBounds(0, 245, 70, 20);
		frame.add(address);

		JTextField addressfield = new JTextField();
		addressfield.setBounds(80, 245, 70, 20);
		frame.add(addressfield);

		// date of journey

		JLabel dateofjourney = new JLabel("date:");
		dateofjourney.setBounds(0, 275, 40, 20);
		frame.add(dateofjourney);

		JComboBox<Integer> cmb1Box2 = new JComboBox<Integer>();
		for (int k1 = 2000; k1 <= 2080; k1++) {
			cmb1Box2.addItem(k1);
		}
		cmb1Box2.setBounds(50, 275, 50, 20);
		frame.add(cmb1Box2);

		JComboBox<Integer> cmb2Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 12; k1++) {
			cmb2Box.addItem(k1);
		}
		cmb2Box.setBounds(110, 275, 40, 20);
		frame.add(cmb2Box);

		JComboBox<Integer> cmb3Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 30; k1++) {
			cmb3Box.addItem(k1);
		}
		cmb3Box.setBounds(160, 275, 40, 20);
		frame.add(cmb3Box);
// 
		// for flight id
		JLabel flightid = new JLabel("flight id:");
		flightid.setBounds(0, 305, 80, 20);
		frame.add(flightid);

		JTextField flightidfield = new JTextField();
		flightidfield.setBounds(90, 305, 80, 20);
		frame.add(flightidfield);

		// for seat number
		JLabel seatno = new JLabel("seat no.:");
		seatno.setBounds(0, 335, 80, 20);
		frame.add(seatno);

		JTextField seatnofield = new JTextField();
		seatnofield.setBounds(90, 335, 50, 20);
		frame.add(seatnofield);

		JLabel class1 = new JLabel("Class");
		class1.setBounds(0, 365, 80, 20);
		frame.add(class1);

		JTextField classfield = new JTextField();
		classfield.setBounds(90, 365, 50, 20);
		frame.add(classfield);

		JButton update1 = new JButton("Update");
		update1.setBounds(0, 395, 80, 20);
		frame.add(update1);

		try {
			String sqlsearchname = "SELECT * FROM `customerdetails` where `customer_id`='" + cuid + "'";
			ResultSet rs = connect.display(sqlsearchname);
			while (rs.next()) {
				tnumfield.setText(rs.getString(1).toString());
				cidfield.setText(rs.getString(2).toString());
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
				//
				///
				//
				//
				///
				//

				String dateofbirthtobeset = rs.getString(6).toString();

				int start = 0;
				int end = 4;
				char year[] = new char[end - start];
				dateofbirthtobeset.getChars(start, end, year, 0);

				char month[] = new char[7 - 5];
				dateofbirthtobeset.getChars(5, 7, month, 0);
				char day[] = new char[10 - 8];
				dateofbirthtobeset.getChars(8, 10, day, 0);

				cmbBox.setSelectedItem(year);
				cmb1Box.setSelectedItem(month);
				cmb2.setSelectedItem(day);
				//
				///
				//

				//
				///
				//
				//
				///
				//

				// combo
				phonefield.setText(rs.getString(7).toString());

				// nation
				String nationstring = rs.getString(8).toString();
				nationselect.setSelectedItem(nationstring);
				// nation
				addressfield.setText(rs.getString(9).toString());

				// date of journey

				String dateofjourneytobeset = rs.getString(10).toString();

				char jyear[] = new char[4 - 0];
				dateofjourneytobeset.getChars(0, 4, jyear, 0);

				char jmonth[] = new char[7 - 5];
				dateofjourneytobeset.getChars(5, 7, jmonth, 0);
				char jday[] = new char[10 - 8];
				dateofjourneytobeset.getChars(8, 10, jday, 0);

				cmb1Box2.setSelectedItem(jyear);
				cmb2Box.setSelectedItem(jmonth);
				cmb3Box.setSelectedItem(jday);

				// date of journey
				flightidfield.setText(rs.getString(11).toString());
				seatnofield.setText(rs.getString(12).toString());
				classfield.setText(rs.getString(13).toString());

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		update1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int updateticket = Integer.parseInt(tnumfield.getText().toString());
				int updatecid = Integer.parseInt(cidfield.getText().toString());
				String updatenamefield = namefield.getText().toString();
				int updatecitizenfield = Integer.parseInt(citizenfield.getText().toString());
				String updategender = null;

				if (male.isSelected()) {
					updategender = "male";
				}
				if (female.isSelected()) {
					updategender = "female";
				}

				String updateyear = cmbBox.getSelectedItem().toString();
				String updatemonth = cmb1Box.getSelectedItem().toString();
				String updateday = cmb2.getSelectedItem().toString();
				// concated date of birth
				String updatedob = updateyear + "/" + updatemonth + "/" + updateday;

				String updatephonefield = phonefield.getText().toString();

				String updatenationality = nationselect.getSelectedItem().toString();

				String updateaddressfield = addressfield.getText().toString();

				// journey
				String updatejyear = cmb1Box2.getSelectedItem().toString();
				String updatejmonth = cmb2Box.getSelectedItem().toString();
				String updatejday = cmb3Box.getSelectedItem().toString();
				// concated date of birth
				String updatejourneydate = updatejyear + "/" + updatejmonth + "/" + updatejday;

				int updateflightidfield = Integer.parseInt(flightid.getText().toString());
				int sseatnofield = Integer.parseInt(seatnofield.getText().toString());
				String sclassfield = classfield.getText().toString();
				
				/////////////////////////////////milena////////////////////////////////////////////

				String sqlupdate = "UPDATE `customerdetails` SET `name`='" + updatenamefield + "',`citizenshipno`='"
						+ updatecitizenfield + "',`gender`='" + updategender + "',`phone`='" + updatephonefield
						+ "',`address`='" + updateaddressfield + "',`flightid`='" + updateflightidfield + "',`seatno`='"
						+ sseatnofield + "',`class`='" + sclassfield + "',`dateofbirth`='" + updatedob
						+ "',`nationality`='" + updatenationality + "',`dateofjourney`='" + updatejourneydate
						+ "' WHERE `customer_id`='" + cuid + "'";
				connect.append(sqlupdate, "updated");
			}

		});

//sql ko rs.getString(1) ho yesto mileko xaina.	
	}

}
