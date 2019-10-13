import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;



import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class New_Booking {
    TxtCompare up = new TxtCompare();
    
    
    static Connection conn;
                Statement st;
                void getConnection(){
                    try{
                    Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/reproject","root", "");
                    st=conn.createStatement();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
                }
                New_Booking() {
		Connect connect = new Connect();

		JFrame frame1 = new JFrame("New Booking");
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		frame1.setLayout(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame1.setSize(screenSize.width, screenSize.height);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);

                
                
                
		JButton back = new JButton("back");
		back.setBounds(0, 0, 65, 30);
		frame1.add(back);

		back.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				frame1.dispose();

			}

		});

		JPanel panel1 = new JPanel();
		frame1.setVisible(true);

		panel1.setBounds(10, 30, screenSize.width, screenSize.height);
		panel1.setLayout(null);
		frame1.add(panel1);

		JLabel lbl = new JLabel("From :");
		lbl.setBounds(0, 25, 60, 30);
		panel1.add(lbl);

		JComboBox<String> locationfrom = new JComboBox<String>();
		locationfrom.setBounds(60, 25, 120, 30);
		panel1.add(locationfrom);
		try {

			String sqllocationinput = "SELECT * FROM location";
			ResultSet rs = connect.display(sqllocationinput);
			while (rs.next()) {
				locationfrom.addItem(rs.getString(1));

			}

		} catch (Exception abc) {
			JOptionPane.showMessageDialog(null, abc);
		}

		JLabel lbl1 = new JLabel("To :");
		lbl1.setBounds(190, 25, 30, 30);
		panel1.add(lbl1);
		
			// copy
			JComboBox<String> locationto = new JComboBox<String>();
			locationto.setBounds(230, 25, 120, 30);
			panel1.add(locationto);
			try {
			String sqllocationinput = "SELECT * FROM location";
			ResultSet rs = connect.display(sqllocationinput);
			while (rs.next()) {
				locationto.addItem(rs.getString(1));

			}

		} catch (Exception abc) {
			JOptionPane.showMessageDialog(null, abc);
		}
			// no of seat jlable and jtextfield to be passed through constructor to newpractice();
			//label
		/*
		 * JLabel noofseat = new JLabel("no of seat");
		 * noofseat.setBounds(350,25,150,20); panel1.add(noofseat);
		 * 
		 * 
		 * //textfield JTextField noofseatfield = new JTextField(1);
		 * noofseatfield.setBounds(510,25,40,20); panel1.add(noofseatfield);
		 * 
		 * //practice book buttom
		 * 
		 * JButton addinfo = new JButton("addinfo"); addinfo.setBounds(560,25,70,20);
		 * panel1.add(addinfo);
		 * 
		 * addinfo.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent ae) { int totalseat
		 * =Integer.parseInt(noofseatfield.getText().toString()); new
		 * newpractice(totalseat); } });
		 * 
		 */
		// sql code

		DefaultTableModel autotablerow = new DefaultTableModel();
		String[] viewcolumn = { "flightid", "from", "to", "arrival", "departure", "price",
				"seatno" };

		JTable viewtable = new JTable();
		autotablerow.setColumnIdentifiers(viewcolumn);
		viewtable.setModel(autotablerow);

		viewtable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane viewsp = new JScrollPane(viewtable);

		panel1.add(viewsp);

		
		/*
		 * try { String sql = "SELECT * FROM flightdetailsz"; ResultSet rs =
		 * connect.display(sql); while (rs.next()) { autotablerow.addRow(new String[] {
		 * rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
		 * rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) }); }
		 * 
		 * } catch (Exception e) { JOptionPane.showMessageDialog(null, e); }
		 */
 
		viewsp.setBounds(5, 70, 800, 400);
		panel1.add(viewsp);

		//

		//

		////
		////
		////
		/////
		//////////
		/////////////
try {
	String sqllocation1 = "SELECT * FROM `flightdetails`";

	
	ResultSet rs = connect.display(sqllocation1);
	viewsp.repaint();
	autotablerow.getDataVector().removeAllElements();

	while (rs.next()) {
		autotablerow.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3),
				rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7) });
	
} }catch (Exception e) {
	JOptionPane.showMessageDialog(null, e);
}

//////////////////////////////////////////////////////////////////////////////////
		locationfrom.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				try {
				String sqllocation;
				if (ie.getStateChange() == ItemEvent.SELECTED) {
                                    
                                    String from =locationfrom.getSelectedItem().toString();
                                    
					sqllocation = "SELECT * FROM `flightdetails` WHERE `from2`='"+ from + "'";
				
				
					ResultSet rs = connect.display(sqllocation);
					viewsp.repaint();
					autotablerow.getDataVector().removeAllElements();

					while (rs.next()) {
						autotablerow.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7) });

					}
				}} catch (Exception ee) {
					ee.printStackTrace();
				}
			}

		}

		);




/////////////////////////////////////////////////////////////////////////////////






		locationto.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				try {
				String sqllocation;
				if (ie.getStateChange() == ItemEvent.SELECTED) {
                                    
                                    String from =locationfrom.getSelectedItem().toString();
                                    String to = locationto.getSelectedItem().toString();
					sqllocation = "SELECT * FROM `flightdetails` WHERE `from2`='"+ from + "' AND `to2`='"+to+"'";
				
				
					ResultSet rs = connect.display(sqllocation);
					viewsp.repaint();
					autotablerow.getDataVector().removeAllElements();

					while (rs.next()) {
						autotablerow.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7) });

					}
				}} catch (Exception ee) {
					ee.printStackTrace();
				}
			}

		}

		);
		
		
		
		 
		//

		////
		////
		////
		/////
		//////////
		/////////////

		// information of customer is recorded in this panel ---> (panel2)
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.GRAY);
		panel2.setLayout(null);
		panel2.setBounds(850, 25, 475, 600);
		panel1.add(panel2);

		// for ticket no.
//		JLabel tnum = new JLabel("ticket no.:");
//		tnum.setBounds(0, 0, 60, 20);
//		panel2.add(tnum);
//
//		JTextField tfield = new JTextField();
//		tfield.setBounds(100, 2, 40, 20);
//		panel2.add(tfield);

		// for custumer id

//		JLabel cid = new JLabel("customer id:");
//		cid.setBounds(0, 25, 75, 20);
//		panel2.add(cid);
//
//		JTextField cidfield = new JTextField();
//		cidfield.setBounds(100, 25, 70, 20);
//		panel2.add(cidfield);

		// for customer name
		JLabel cname = new JLabel("customer name:");
		cname.setBounds(0, 50, 100, 20);
		panel2.add(cname);

		JTextField namefield = new JTextField();
		namefield.setBounds(100, 50, 70, 20);
		panel2.add(namefield);

		// for father name
		JLabel citizenship = new JLabel("Citizenship no.:");
		citizenship.setBounds(0, 75, 100, 20);
		panel2.add(citizenship);

		JTextField citizenfield = new JTextField();
		citizenfield.setBounds(100, 75, 70, 20);
		panel2.add(citizenfield);

		// for gender selection
		JLabel gender = new JLabel("gender:");
		gender.setBounds(0, 100, 70, 20);
		panel2.add(gender);

		JRadioButton male = new JRadioButton("male");
		male.setBounds(100, 100, 70, 20);
		panel2.add(male);

		JRadioButton female = new JRadioButton("female");
		female.setBounds(165, 100, 70, 20);
		panel2.add(female);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(male);
		group1.add(female);

//		// for date of birth
//		JLabel year1 = new JLabel("D-O-B:");
//		year1.setBounds(0, 125, 40, 20);
//		panel2.add(year1);
//
//		JComboBox<Integer> cmbBox = new JComboBox<Integer>();
//		for (int k1 = 2000; k1 <= 2080; k1++) {
//			cmbBox.addItem(k1);
//		}
//		cmbBox.setBounds(100, 125, 60, 20);
//		panel2.add(cmbBox);
//
//		JComboBox<Integer> cmb1Box = new JComboBox<Integer>();
//		for (int k1 = 1; k1 <= 12; k1++) {
//			cmb1Box.addItem(k1);
//		}
//		cmb1Box.setBounds(165, 125, 40, 20);
//		panel2.add(cmb1Box);
//
//		JComboBox<Integer> cmb2 = new JComboBox<Integer>();
//		for (int k1 = 1; k1 <= 30; k1++) {
//			cmb2.addItem(k1);
//		}
//		cmb2.setBounds(205, 125, 40, 20);
//		panel2.add(cmb2);

		// for phone number
		JLabel phone = new JLabel("phone:");
		phone.setBounds(0, 150, 60, 20);
		panel2.add(phone);

		JTextField phonefield = new JTextField();
		phonefield.setBounds(100, 150, 60, 20);
		panel2.add(phonefield);

		// for nationality
		JLabel nationality = new JLabel("nationality:");
		nationality.setBounds(0, 175, 70, 20);
		panel2.add(nationality);

		String[] snationality = { "Nationality", "Nepal", "India", "Australia", "America", "New Zealand", "Canada",
				"Germany" };
		JComboBox<String> nationselect = new JComboBox<String>(snationality);
		nationselect.setBounds(100, 175, 105, 20);
		panel2.add(nationselect);

		// for address
		JLabel address = new JLabel("address:");
		address.setBounds(0, 200, 70, 20);
		panel2.add(address);

		JTextField addressfield = new JTextField();
		addressfield.setBounds(100, 200, 70, 20);
		panel2.add(addressfield);

		// date of journey

		JLabel dateofjourney = new JLabel("date:");
		dateofjourney.setBounds(0, 230, 40, 20);
		panel2.add(dateofjourney);

		JComboBox<Integer> cmb1Box2 = new JComboBox<Integer>();
		for (int k1 = 2000; k1 <= 2080; k1++) {
			cmb1Box2.addItem(k1);
		}
		cmb1Box2.setBounds(100, 230, 55, 20);
		panel2.add(cmb1Box2);

		JComboBox<Integer> cmb2Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 12; k1++) {
			cmb2Box.addItem(k1);
		}
		cmb2Box.setBounds(160, 230, 40, 20);
		panel2.add(cmb2Box);

		JComboBox<Integer> cmb3Box = new JComboBox<Integer>();
		for (int k1 = 1; k1 <= 30; k1++) {
			cmb3Box.addItem(k1);
		}
		cmb3Box.setBounds(210, 230, 40, 20);
		panel2.add(cmb3Box);

		// for flight id
		JLabel flightid = new JLabel("flight id:");
		flightid.setBounds(0, 260, 80, 20);
		panel2.add(flightid);

		JTextField flightidfield = new JTextField();
		flightidfield.setBounds(100, 260, 80, 20);
		panel2.add(flightidfield);

		// for seat number
		JLabel seatno = new JLabel("seat no.:");
		seatno.setBounds(0, 290, 80, 20);
		panel2.add(seatno);

		JTextField seatnofield = new JTextField();
		seatnofield.setBounds(100, 290, 50, 20);
		panel2.add(seatnofield);

		
		//flight details inserting place auto generation wala
		
		/*
		 * JLabel pfrom = new JLabel("From"); pfrom.setBounds(200, 2, 40, 20);
		 * panel2.add(pfrom);
		 * 
		 * //txtfield JTextField txtfrom = new JTextField(); txtfrom.setBounds(300, 2,
		 * 70, 20); panel2.add(txtfrom);
		 * 
		 * 
		 * 
		 * JLabel pto = new JLabel("To"); pto.setBounds(200, 25, 40, 20);
		 * panel2.add(pto);
		 * 
		 * //txtfield JTextField txtto = new JTextField(); txtto.setBounds(300, 25, 70,
		 * 20); panel2.add(txtto);
		 * 
		 * 
		 * JLabel pdeparture= new JLabel("Departure"); pdeparture.setBounds(200, 50, 60,
		 * 20); panel2.add(pdeparture);
		 * 
		 * //txtfield JTextField txtdeparture = new JTextField();
		 * txtdeparture.setBounds(300, 50, 70, 20); panel2.add(txtdeparture);
		 * 
		 * 
		 * JLabel parrival = new JLabel("Arrival"); parrival.setBounds(200, 75, 70, 20);
		 * panel2.add(parrival);
		 * 
		 * //txtfield JTextField txtarrival= new JTextField(); txtarrival.setBounds(300,
		 * 75, 70, 20); panel2.add(txtarrival);
		 */

		
		// for book button
		JButton book = new JButton("BOOK");
		book.setBounds(140, 350, 80, 20);
		panel2.add(book);

		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
					// getting all field value to string to insert in sql
//					int sticketno = Integer.parseInt(tfield.getText().toString());
//					int scustomerid = Integer.parseInt(cidfield.getText().toString());
                			String sname = namefield.getText().toString();
                                        
                                        String citizenstring= citizenfield.getText().toString();
					int scitizenshipno = Integer.parseInt(citizenstring);
					String sgender = null;
					if (male.isSelected()) {
						sgender = "male";
					}
					if (female.isSelected()) {
						sgender = "female";
					}

//					String sdateyear = cmbBox.getSelectedItem().toString();
//					String sdatemonth = cmb1Box.getSelectedItem().toString();
//					String sdateday = cmb2.getSelectedItem().toString();

					// combining the date of birth to be inserted
//					String sdateofbirth = sdateyear + "/" + sdatemonth + "/" + sdateday;
                                        String stringphone = phonefield.getText().toString();
					int sphone = Integer.parseInt(stringphone);

					String strnationality = nationselect.getSelectedItem().toString();

					String saddress = addressfield.getText().toString();

					String sdateofjourneyyear = cmb1Box2.getSelectedItem().toString();
					String sdateofjourneymonth = cmb2Box.getSelectedItem().toString();
					String sdateofjourneyday = cmb3Box.getSelectedItem().toString();
					// combining the date of birth to be inserted
					String sdateofjourney = sdateofjourneyyear + "/" + sdateofjourneymonth + "/" + sdateofjourneyday;

                                        String stringflightid =flightidfield.getText().toString();
					int sflightid = Integer.parseInt(stringflightid);
                                        
                                        
                                        String stringseatno = seatnofield.getText().toString();
					int sseatno = Integer.parseInt(stringseatno);
				

                                        
                                        
                                      if(!up.compare(sname,"Aas")) {
			   JOptionPane.showMessageDialog(null, "Invalid Name");
		   }
		   else if(up.compare(sname,"Aas")) {
			   if(!up.compare(citizenstring,"N")){
				   JOptionPane.showMessageDialog(null, "Invalid citizenshipno");
				   
			   }else if(up.compare(citizenstring,"N")) {
				   if(!up.compare(stringphone,"N")) {
					   JOptionPane.showMessageDialog(null, "Invalid phone format");
					   
				   }else if(up.compare(stringphone,"N")) {
					   if(!up.compare(saddress,"Aas")) {
						   JOptionPane.showMessageDialog(null, "Invalid address");
						   
					   }else if(up.compare(saddress,"Aas")) {
						   
						   if(!up.compare(stringflightid,"N"))  {
							   JOptionPane.showMessageDialog(null, "Invalid flightid.");
							   
						   }else if(up.compare(stringflightid,"N")) {
							   
							   if(!up.compare(stringseatno,"N")) {
								   JOptionPane.showMessageDialog(null, "Invalid seatno.");
								   
							   }else if(up.compare(stringseatno,"N")) {
								   
								     
                                                               
                                                             String sqlcusinsert = "INSERT INTO `customerdetails`(`name`,`citizenshipno`,`gender`,`phone`,`nationality`,`address`) values('"+sname + "','" + scitizenshipno + "','" + sgender + "','" + sphone + "','" + strnationality + "','" + saddress + "')";
					try{
                                                             connect.insert(sqlcusinsert);

                                        
                                        //dateofjourney    
                                        //flightid
                                        //seatno   + sdateofjourney + "','" + sflightid + "','" + sseatno + "'
                                        
                                        //sticketno
                                        String sqlquery= "SELECT max(customer_id) from `customerdetails`";                            
                                        ResultSet rs=connect.display(sqlquery);
                                        while(rs.next()){
                                            int max =rs.getInt(1);                                   
                                        
                                        
                                   
                                        String sqlticketinsert="INSERT INTO `ticketdetails`(`cid`,`flightid`,`seatno`,`dateofjourney`)"
                                                + " values('"+max+"','"+sflightid+"','"+sseatno+"','"+sdateofjourney+"')";
                                        connect.append(sqlticketinsert,"bo0ked");
                                        
                                       }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}  
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
                                                               
									   }         
				      	           }
			  		            }
				              }
					       } 
			            }
			         }
		         
	});
               


                                        
                                        
                                        
                                        
                                        //////
                                        
                                        
					// got value from textfield, combobox , radiobutton.

					// writing the query of sql in a string to pass in : function
					// connect.append(sql, insert)
					

			
	


		JButton chooseflight = new JButton("choose flight");
		chooseflight.setBounds(300,500,150,30);
		panel1.add(chooseflight);

		chooseflight.addActionListener(new ActionListener() {
			
            String id;
			public void actionPerformed(ActionEvent ae) {
				int[] row = viewtable.getSelectedRows();
				for (int i = 0; i < row.length; i++) {
					id = (String) viewtable.getValueAt(row[i], 0);
					
					flightidfield.setText(id);
				}
				
			}
		});
                
                
               
                JButton print = new JButton("Print");
                print.setBounds(240, 350, 80, 20);
		panel2.add(print);
                
                
                
//                print.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
////                try {
////                   
////                    InputStream in = new FileInputStream(new File("C:\\Users\\killer\\OneDrive\\githubproject\\airlines\\src\\ticket.jrxml"));
////                    JasperDesign jd = JRXmlLoader.load(in);
////                    JasperReport jr = JasperCompileManager.compileReport(jd);
////                    HashMap param = new HashMap();
////
////                    
////                        String s = tfield.getText();
////                        
////                            param.put("tickno",2);
////                            System.out.println(s);
////                            
////                            
////                    JasperPrint j = JasperFillManager.fillReport(jr, param, conn);
////                    JasperViewer.viewReport(j, false);
////                    
////
////                    
////                } catch (Exception e) {
////                    JOptionPane.showMessageDialog(null,e);
////                }
//try {
//       InputStream in = new FileInputStream(new File("C:\\Users\\killer\\OneDrive\\githubproject\\airlines\\src\\ticket.jrxml"));
//       JasperDesign jd=JRXmlLoader.load(in);   
//       JasperReport jr=JasperCompileManager.compileReport(jd);
//       HashMap param=new HashMap();
//       int tno=Integer.parseInt(tfield.getText());
//       param.put("tno",tno);
//       JasperPrint j=JasperFillManager.fillReport(jr,param,conn);
//       JasperViewer.viewReport(j, false);
//     } catch (Exception ex) {
//         JOptionPane.showMessageDialog(null, ex); 
//       }
//            }
//
//        });
//		
//
	}
	
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new New_Booking();
			}
		});
	}

}
