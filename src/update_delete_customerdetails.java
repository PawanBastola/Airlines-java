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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class update_delete_customerdetails {

	update_delete_customerdetails(String cuid) {

		Connect connect = new Connect();

		JFrame frame = new JFrame("update ticket");
		frame.setSize(300, 450);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0,0,300,450);
		panel1.setLayout(null);
		frame.add(panel1);

		//

		

		JLabel cname = new JLabel("customer name:");
		cname.setBounds(10, 5, 100, 20);
		panel1.add(cname);

		JTextField namefield = new JTextField();
		namefield.setBounds(110, 5, 70, 20);
		panel1.add(namefield);

		// for father name
		JLabel citizenship = new JLabel("Citizenship no.:");
		citizenship.setBounds(10, 35, 100, 20);
		panel1.add(citizenship);

		JTextField citizenfield = new JTextField();
		citizenfield.setBounds(110, 35, 70, 20);
		panel1.add(citizenfield);

		// for gender selection
		JLabel gender = new JLabel("gender:");
		gender.setBounds(10, 65, 70, 20);
		panel1.add(gender);

		JRadioButton male = new JRadioButton("male");
		male.setBounds(110, 65, 70, 20);
		panel1.add(male);

		JRadioButton female = new JRadioButton("female");
		female.setBounds(200, 65, 70, 20);
		panel1.add(female);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(male);
		group1.add(female);

		// for date of birth
//		JLabel year1 = new JLabel("D-O-B:");
//		year1.setBounds(10, 95, 40, 20);
//		panel1.add(year1);
//
//		JComboBox<Integer> cmbBox = new JComboBox<Integer>();
//		for (int k1 = 2000; k1 <= 2080; k1++) {
//			cmbBox.addItem(k1);
//		}
//		cmbBox.setBounds(110, 95, 60, 20);
//		panel1.add(cmbBox);
//
//		JComboBox<Integer> cmb1Box = new JComboBox<Integer>();
//		for (int k1 = 1; k1 <= 12; k1++) {
//			cmb1Box.addItem(k1);
//		}
//		cmb1Box.setBounds(175, 95, 40, 20);
//		panel1.add(cmb1Box);
//
//		JComboBox<Integer> cmb2 = new JComboBox<Integer>();
//		for (int k1 = 1; k1 <= 30; k1++) {
//			cmb2.addItem(k1);
//		}
//		cmb2.setBounds(220, 95, 40, 20);
//		panel1.add(cmb2);

//
		// for phone number
		JLabel phone = new JLabel("phone:");
		phone.setBounds(10, 125, 60, 20);
		panel1.add(phone);

		JTextField phonefield = new JTextField();
		phonefield.setBounds(110, 125, 60, 20);
		panel1.add(phonefield);

		// for nationality
		JLabel nationality = new JLabel("nationality:");
		nationality.setBounds(10, 155, 70, 20);
		panel1.add(nationality);

		String[] snationality = { "Nationality", "Nepal", "India", "Australia", "America", "New Zealand", "Canada",
				"Germany" };
		JComboBox<String> nationselect = new JComboBox<String>(snationality);
		nationselect.setBounds(110, 155, 105, 20);
		panel1.add(nationselect);

		// for address
		JLabel address = new JLabel("address:");
		address.setBounds(10, 185, 70, 20);
		panel1.add(address);

		JTextField addressfield = new JTextField();
		addressfield.setBounds(110, 185, 70, 20);
		panel1.add(addressfield);

		// date of journey

		JLabel dateofjourney = new JLabel("date:");
		dateofjourney.setBounds(10, 215, 40, 20);
		panel1.add(dateofjourney);

		JComboBox<Integer> cmb1Box2 = new JComboBox<Integer>();
		for (int k1 = 2000; k1 <= 2080; k1++) {
			cmb1Box2.addItem(k1);
		}
		cmb1Box2.setBounds(110, 215, 60, 20);
		panel1.add(cmb1Box2);

		JComboBox<Integer> cmb2Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 12; k1++) {
			cmb2Box.addItem(k1);
		}
		cmb2Box.setBounds(175, 215, 40, 20);
		panel1.add(cmb2Box);

		JComboBox<Integer> cmb3Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 30; k1++) {
			cmb3Box.addItem(k1);
		}
		cmb3Box.setBounds(220, 215, 40, 20);
		panel1.add(cmb3Box);
// 
		// for flight id
		JLabel flightid = new JLabel("flight id:");
		flightid.setBounds(10, 245, 80, 20);
		panel1.add(flightid);

		JTextField flightidfield = new JTextField();
		flightidfield.setBounds(110, 245, 80, 20);
		panel1.add(flightidfield);

		// for seat number
		JLabel seatno = new JLabel("seat no.:");
		seatno.setBounds(10, 275, 80, 20);
		panel1.add(seatno);

		JTextField seatnofield = new JTextField();
		seatnofield.setBounds(110, 275, 50, 20);
		panel1.add(seatnofield);

		

		JButton update1 = new JButton("Update");
		update1.setBounds(110, 335, 80, 20);
		panel1.add(update1);

		try {
			String sqlsearchname = "SELECT * FROM `customerdetails` where `customer_id`='" + cuid + "'";
			ResultSet rs = connect.display(sqlsearchname);
			while (rs.next()) {
				
				
				namefield.setText(rs.getString(2).toString());
				citizenfield.setText(rs.getString(3).toString());
				// gender
				if (rs.getString(4).equals("male")) {
					male.setSelected(true);
				} else
					female.setSelected(true);
				// gender

//				String dateofbirthtobeset = rs.getString(6).toString();
//				int yr = Integer.parseInt(dateofbirthtobeset.substring(0, 4));
//				cmbBox.setSelectedItem(yr);
//
//				int mth = Integer.parseInt(dateofbirthtobeset.substring(5, 7));
//				cmb1Box.setSelectedItem(mth);
//
//				int dy = Integer.parseInt(dateofbirthtobeset.substring(8, 10));
//				cmb2.setSelectedItem(dy);

				phonefield.setText(rs.getString(5).toString());

				// nation
				String nationstring = rs.getString(6).toString();
				nationselect.setSelectedItem(nationstring);
				// nation
				addressfield.setText(rs.getString(7).toString());

				// date of journey
			}} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
                        try{
                        String sqlsearchname1 = "SELECT * FROM `ticketdetails` where `cid`='" + cuid + "'";
			ResultSet ps = connect.display(sqlsearchname1);
			while (ps.next()) {
			
                        
                        String dateofjourneytobeset = ps.getString(5).toString();

				int jyear = Integer.parseInt(dateofjourneytobeset.substring(0, 4));
				cmb1Box2.setSelectedItem(jyear);

				int jmonth = Integer.parseInt(dateofjourneytobeset.substring(5, 7));
				cmb2Box.setSelectedItem(jmonth);

				int jday = Integer.parseInt(dateofjourneytobeset.substring(8, 10));
				cmb3Box.setSelectedItem(jday);

				// date of journey
				flightidfield.setText(ps.getString(3).toString());
				seatnofield.setText(ps.getString(4).toString());
                        }
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null,e);
                        }
		
		
		
		update1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String updatenamefield = namefield.getText().toString();
				int updatecitizenfield =Integer.parseInt(citizenfield.getText().toString());
				//gender
				String updategender = null;

				if (male.isSelected()) {
					updategender = "male";
				}
				if (female.isSelected()) {
					updategender = "female";
				}		//end of gender  
				//date of birth
//				String updateyear = String.valueOf(cmbBox.getSelectedItem());
//				String updatemonth = String.valueOf(cmb1Box.getSelectedItem());
//				String updateday = String.valueOf(cmb2.getSelectedItem()); // concated date of birth String
//				String updatedob = updateyear + "/" + updatemonth + "/" + updateday;
//				//end date of birth
				
				//phonefield
				int updatephonefield = Integer.parseInt(phonefield.getText().toString());
				
				//nationality
				String updatenationality = nationselect.getSelectedItem().toString();	
				
				//address
				String updateaddressfield = addressfield.getText().toString();	
				
				//date of journey
				String updatejyear = String.valueOf(cmb1Box2.getSelectedItem());
				String updatejmonth = String.valueOf(cmb2Box.getSelectedItem());
				String updatejday = String.valueOf(cmb3Box.getSelectedItem());
				String updatejourneydate = updatejyear + "/" + updatejmonth + "/" + updatejday;
				//end date of journey
				
				//flight id
				int updateflightidfield = Integer.parseInt(flightidfield.getText());
				
				//seatno
				 int sseatnofield = Integer.parseInt(seatnofield.getText());
				
				 
				 
				
				String sqlupdate = "UPDATE `ticketdetails` SET `seatno`='"
						+ sseatnofield + "',`flightid`='" + updateflightidfield + "',`dateofjourney`='"
						+ updatejourneydate + "' WHERE `cid`='" + cuid + "' ";
                                connect.insert(sqlupdate);
				
                                String sqlupdate1 = "UPDATE `customerdetails` SET `address`='" + updateaddressfield + "',`nationality`='"
						+ updatenationality + "',`phone`='" + updatephonefield + "',`gender`='" + updategender + "',`name`='" + updatenamefield + "', `citizenshipno`='"
						+ updatecitizenfield + "' WHERE `customer_id`='" + cuid + "' ";
				
                                
                                connect.append(sqlupdate1, "updated");
                                frame.dispose();
                                new View_Booking();
                                
                                
                                			}

		});


	}

}
