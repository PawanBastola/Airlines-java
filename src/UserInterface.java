    import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;



public class UserInterface {
	UserInterface(){
		
	
	
			JFrame frame=new JFrame("UserInterface");
			frame.setSize(600, 500);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			
			JMenuBar mb=new JMenuBar();
			mb.setBounds(0,0,1200,50);
			frame.add(mb);
			mb.setBackground(Color.gray);
			
			JMenu menu1=new JMenu("Book Flight     ");
			mb.add(menu1);
			JMenuItem item1a=new JMenuItem("New Booking");
			menu1.add(item1a);
			JMenuItem item3a=new JMenuItem("Cancel Booking");
			menu1.add(item3a);
			mb.add(menu1);
			item1a.addActionListener(new ActionListener() {
				   
		    public void actionPerformed(ActionEvent ae)
			{
			 
			new New_Booking();
			frame.dispose();
			 
				  }
			});
			
			
			
			
			
			JMenu menu2 = new JMenu("View Booking     ");
			JMenuItem item2a = new JMenuItem("Traverse Details");
			
			menu2.add(item2a);
			mb.add(menu2);
			
			
			item3a.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					new CancelBooking();
				}
			});
			item2a.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					new View_Details();
				}
			});
			
			
			JMenu menu5=new JMenu("Flight Details     ");
			JMenuItem item5a=new JMenuItem("View Flight");
			item5a.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					new ViewFlight();
					frame.dispose();
				}
			});
	
			
			menu5.add(item5a);
			mb.add(menu5);
			
		
				
			
			JMenuItem menu4 = new JMenuItem("Log Out");
			
			
			mb.add(menu4);
			menu4.setBackground(Color.gray);
			menu4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					new Airline();
					frame.dispose();
					
				}
			});
	}
			
			
					
			
		




			
		
		public static void main(String[]args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new AdminInterface();
				}
			
			
		});
		}
	}




			





