import java.awt.Font;

		import javax.swing.*;




public class CancelBooking {
	CancelBooking(){
		            JFrame frame=new JFrame("View details");
					frame.setSize(800, 500);
					frame.setLayout(null);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					
						
						/*
						 * JLabel filter = new JLabel("Filter:-"); filter.setBounds(20,5,100,30);
						 * filter.setFont(new Font("Moonspace",Font.BOLD,20)); frame.add(filter);
						 */
						 
					String[] sfilter= {"ALL","Ticket no","Flight no.","Emp id","date"};
					JComboBox combofilter = new JComboBox(sfilter);
					combofilter.setBounds(20,50,100,30);
					frame.add(combofilter);
					
					
					JTextField ticketnotextfield = new JTextField();
					ticketnotextfield.setBounds(130,50,50,30);
					frame.add(ticketnotextfield);
					
					JButton searchbtn = new JButton("SEARCH");
					searchbtn.setBounds(200,50,100,30);
					frame.add(searchbtn);
					
					String[] viewcolumn = {"ticketno","emp.id","c.id","from","to","date","flightid","price","noofticket","total amt"};
					String[][] viewrow = {{"345","1","201","bhadera","jhapa","332323","34","400","234","4500"}};
					JTable viewtable = new JTable(viewrow,viewcolumn);
					JScrollPane viewsp = new JScrollPane(viewtable);
					viewsp.setBounds(20,100,750,200);
					frame.add(viewsp);
					
					JButton btn=new JButton("Cancel Ticket");
					btn.setBounds(300,350,150,30);
					frame.add(btn);
					
					
					
				}
				
			



	}


