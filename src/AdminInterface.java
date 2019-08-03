import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AdminInterface {
	AdminInterface(){
		JFrame frame=new JFrame("AdminInterface");
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		ImageIcon image1 =new ImageIcon(new ImageIcon("C:/users/killer/Desktop/dashboard.jpg").getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT));
		JLabel imagebackground = new JLabel(image1);
		imagebackground.setLayout(null);
		imagebackground.setBounds(0,0,800,500);
		frame.add(imagebackground);
		
		
		JMenuBar mb=new JMenuBar();
		mb.setBounds(0,0,1200,50);
		mb.setBackground(Color.GRAY);
		imagebackground.add(mb);
	
		
		JMenu menu1=new JMenu("Book Flight     ");
		mb.add(menu1);
		JMenuItem item1a=new JMenuItem("New Booking");
		menu1.add(item1a);
		JMenuItem item2a=new JMenuItem("Cancel Booking");
		menu1.add(item2a);
		mb.add(menu1);
		item1a.addActionListener(new ActionListener() {
			   
	    public void actionPerformed(ActionEvent ae)
		{
		 
		new New_Booking();
		frame.dispose();
		 
			  }
		});
		
		item2a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new CancelBooking();
			}
		});
		
		
		
		
		
		JMenu menu2 = new JMenu("View Booking     ");
		JMenuItem item3a = new JMenuItem("Traverse Details");
		
		menu2.add(item3a);
		mb.add(menu2);
		
		
		item3a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new View_Details();
			}
		});
	
			
		
		JMenu menu3 = new JMenu("Manage Account     ");
		JMenuItem signup = new JMenuItem("Sign Up");
		//now adding actionlistener to the signup button on menuitem signup
		
		  signup.addActionListener(new ActionListener() {
			   
			  public void actionPerformed(ActionEvent ae)
			  {
		 
		 new SignUpForUser(); 
		 

		
		 }
		  
		  });
		  
		  
		  JMenu menu4=new JMenu("Flight Details     ");
		  mb.add(menu4);
		  JMenuItem item=new JMenuItem("Add Flight");
				  menu4.add(item);
				  
				  item.addActionListener(new ActionListener() {
					   
					  public void actionPerformed(ActionEvent ae)
					  {
						  new AddFlight();
					  }
				  });
				  
				  
		  JMenuItem item1=new JMenuItem("View Flight");
		  menu4.add(item1);
		  
		  item1.addActionListener(new ActionListener() {
			   
			  public void actionPerformed(ActionEvent ae)
			  {
		        new ViewFlight();
			  }
		  });
		
		JMenuItem update = new JMenuItem("Update");
		JMenuItem delete = new JMenuItem("Delete");
		JMenuItem view= new JMenuItem("View");
		menu3.add(signup);
		menu3.add(update);
		menu3.add(delete);
		menu3.add(view);
		mb.add(menu3);
		
		JMenuItem menu5 = new JMenuItem("Log Out");
		
		mb.add(menu5);
		menu5.setBackground(Color.GRAY);
		
		menu5.addActionListener(new ActionListener() {
			   
			  public void actionPerformed(ActionEvent ae)
			  {
			 frame.dispose();
		 
		     new Airline(); 

			  }
		  
		  });
			
	}
}





		


