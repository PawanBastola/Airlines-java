package login;
import java.awt.Dimension;
import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.SwingConstants;

import bus_details.AddBus;
import bus_details.viewandupdate;
import location.addlocation;
import location.locationview;
import ticket.Bookticket;


//import login.menubar;

public class activities {

	activities(String usertype ,String userText){
		//String user= userText;
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		JFrame index=new JFrame("Home :"+usertype+"  "+userText);
		index.setSize(screensize.width, screensize.height);
		index.setLocationRelativeTo(null);
		index.setLayout(null);
		
		
		
		
		
		JMenuBar mb=new JMenuBar();
		mb.setBounds(10,10,10000,70);
		
		JMenu me=new JMenu("ticket");
		JMenuItem mi=new JMenuItem("Book ticket");
		JMenuItem mi1=new JMenuItem("update ticket");
		 me.add(mi);
		 me.add(mi1);
		 mb.add(me);
		
		 JMenu me1=new JMenu("bus details");
		 JMenuItem mi7=new JMenuItem("Add Bus");
		 JMenuItem mi8=new JMenuItem("view route");
		 
		 me1.add(mi7);
		 me1.add(mi8);
		 mb.add(me1);
			
		 JMenu me6=new JMenu("Location ");
		 JMenuItem mi01=new JMenuItem("Add location");
		 JMenuItem mi02=new JMenuItem("view location");
		 
		 me6.add(mi01);
	     me6.add(mi02);
	     mb.add(me6);
			
		JMenu me4=new JMenu("view");
		JMenuItem mi2=new JMenuItem("Availabel Bus");
		JMenuItem mi3=new JMenuItem("Availabel route");
		JMenuItem mi4=new JMenuItem("fair charge");
		
		
		
		me4.add(mi2);
		me4.add(mi3);
		me4.add(mi4);
		
	//	if(usertype.equals("admin")) {
		//mb.add(me1);
	//	}
		
		JMenu me2=new JMenu("Help");
		JMenuItem jm=new JMenuItem("user manual");
		JMenuItem jm1=new JMenuItem("contact developer ");
	
	//	if(usertype.equals("user")) {
		me2.add(jm);
	//	}
		
		
		me2.add(jm1);
		
		mb.add(me2);
		JMenu me3=new JMenu("Search");
		mb.add(me3);
		JMenu me9=new JMenu("Log out");
		mb.add(me4);
		
		index.add(mb);
		
		
		 mi.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
	               new Bookticket();
				
				   }	
			   });
		
		 
		 
		
		mi7.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
	               new AddBus();
				
				   }	
			   });
		
		
		
		
		mi8.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
	               new viewandupdate();
				
				   }	
			   });
		
		
		 mi01.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
	               new addlocation();
				
				   }	
			   });
		 
		 mi02.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
	               new locationview();
				
				   }	
			   });
		
		
	/* JFrame jframe=new JFrame("HOME");
	 jframe.setSize(700, 700);
		jframe.setLocationRelativeTo(null);
		jframe.setLayout(null);
		
		jframe.setVisible(true);
		
		
		JMenuBar mb=new JMenuBar();
		mb.setBounds(10,10,1000,50);
		
		JMenu me=new JMenu("ticket");
		JMenuItem mi=new JMenuItem("Book ticket");
		JMenuItem mi1=new JMenuItem("update ticket");
		 me.add(mi);
		 me.add(mi1);
		 mb.add(me);
		
		JMenu me1=new JMenu("view");
		JMenuItem mi2=new JMenuItem("Availabel Bus");
		JMenuItem mi3=new JMenuItem("Availabel route");
		JMenuItem mi4=new JMenuItem("fair charge");
		me1.add(mi2);
		me1.add(mi3);
		me1.add(mi4);
		mb.add(me1);
		JMenu me2=new JMenu("Help");
		JMenuItem jm=new JMenuItem("user manual");
		JMenuItem jm1=new JMenuItem("contact developer ");
		me2.add(jm);
		me2.add(jm1);
		
		mb.add(me2);
		JMenu me3=new JMenu("Search");
		mb.add(me3);
		JMenu me4=new JMenu("Log out");
		mb.add(me4);
		
		jframe.add(mb);
		
		
		 mi.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
               new Bookticket();
			
			   }	
		   });
		 
		 
		
			 mi1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
                  new updateticket();
			     
				   }
			   });
			 

	}
	*/
index.setVisible(true);
	}

	
	}


