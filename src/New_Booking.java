import java.awt.event.*;


import javax.swing.*;
import java.awt.*;

public class New_Booking {
	New_Booking(){
		JFrame frame1 = new JFrame("New Booking");
		frame1.setResizable(false);
		frame1.setSize(550, 600);
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		
		
		JButton back = new JButton("back");
		back.setBounds(0,0,65,30);
		frame1.add(back);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10,30,550,300);
		panel1.setLayout(null);
		frame1.add(panel1);
		
		
		
		JRadioButton roundtrip = new JRadioButton("Round trip",true);
		roundtrip.setBounds(50,-5,100,30);
		panel1.add(roundtrip);
				
		JRadioButton oneway = new JRadioButton("One way");
		oneway.setBounds(160,-5,100,30);
		panel1.add(oneway);
		
		
		
		ButtonGroup tripgroup = new ButtonGroup();
		tripgroup.add(roundtrip);
		tripgroup.add(oneway);
				
		
		JLabel lbl=new JLabel("From :");
		lbl.setBounds(0,25,60,30);
		panel1.add(lbl);
		 
		String arr[]= {"Bhadrapur","Biratnagar"};
		JComboBox cmb=new JComboBox(arr);
		cmb.setBounds(60,25,120,30);
		panel1.add(cmb);
		
		JLabel lbl1=new JLabel("To :");
		lbl1.setBounds(0,65,60,30);
		panel1.add(lbl1);
		
		String arr1[]= {"Kathmandu","Pokhara"};
		JComboBox cmb1=new JComboBox(arr1);
		cmb1.setBounds(60,65,120,30);
		panel1.add(cmb1);
			
		
		JLabel lbl2 = new JLabel("Departure :");
		lbl2.setBounds(0, 105, 70, 30);
		panel1.add(lbl2);

		JTextField dd = new JTextField();
		dd.setBounds(75, 110, 100, 20);
		panel1.add(dd);

		JLabel lbl3 = new JLabel("Return :");
		lbl3.setBounds(200, 105, 60, 30);
		panel1.add(lbl3);

		JTextField dd2 = new JTextField();
		dd2.setBounds(250, 110, 100, 20);
		panel1.add(dd2);
		
		JLabel adult = new JLabel("Adult :");
		adult.setBounds(0,130,70,30);
		panel1.add(adult);
		
		JTextField adultfield = new JTextField();
		adultfield.setBounds(75, 135, 100, 20);
		panel1.add(adultfield);
				
		
		
		JLabel child = new JLabel("Child :");
		child.setBounds(200,130,70,30);
		panel1.add(child);
		
		JTextField childfield = new JTextField();
		childfield.setBounds(250, 135, 100, 20);
		panel1.add(childfield);
		
		String[] snationality = { "Nationality", "Nepal", "India", "Australia", "America", "New Zealand", "Canada", "Germany" };
		JComboBox nationselect = new JComboBox(snationality);
		nationselect.setBounds(370, 110, 100, 40);
		panel1.add(nationselect); 
		
		
		JButton findflight = new JButton("Find Flight");
		findflight.setBounds(370,160,100,30);
		panel1.add(findflight);
		
		
		//hiding the return label and textfield incomplete.
		/*
		 * if(roundtrip.isSelected()) { lbl3.setVisible(true); dd2.setVisible(true); }
		 * else if(oneway.isSelected()) { lbl3.setVisible(false); dd2.setVisible(false);
		 * 
		 * }
		 */
		
		
		
		
		 /* JTextField dd1=new JTextField(); dd1.setBounds(130,70,50,30);
		 * frame1.add(dd1); JTextField dd2=new JTextField();
		 * dd2.setBounds(200,70,50,30); frame1.add(dd2);
		 * 
		 * JLabel lbl3=new JLabel("DD"); lbl3.setBounds(75,100,30,30); frame1.add(lbl3);
		 * 
		 * JLabel lbl4=new JLabel("MM"); lbl4.setBounds(145,100,30,30);
		 * frame1.add(lbl4);
		 * 
		 * JLabel lbl5=new JLabel("YY"); lbl5.setBounds(215,100,30,30);
		 * frame1.add(lbl5);
		 * 
		 * 
		 * JButton btn=new JButton("Find Flight"); btn.setBounds(330,70,120,30);
		 * frame1.add(btn);
		 * 
		 * String[] viewcolumn =
		 * {"date","flight.id","from","to","arrival","departure","price"}; String[][]
		 * viewrow
		 * ={{"2018/05/26","1","Bhadrapur","Kathmandu","9:00am","2:00pm","8000"},{
		 * "2018/05/22","2","Bhadrapur","Pokhara","8:00am","1:00pm","9000"}};
		 * 
		 * JTable viewtable = new JTable(viewrow,viewcolumn); JScrollPane viewsp = new
		 * JScrollPane(viewtable); viewsp.setBounds(20,150,500,100); frame1.add(viewsp);
		 * 
		 * 
		 * JLabel lbl6=new JLabel("Flight ID"); lbl6.setBounds(10,300,150,30);
		 * frame1.add(lbl6);
		 * 
		 * JTextField dd3=new JTextField(); dd3.setBounds(60,300,70,30);
		 * frame1.add(dd3);
		 * 
		 * JLabel lbl9=new JLabel("Nationality:"); lbl9.setBounds(10,350,150,30);
		 * frame1.add(lbl9);
		 * 
		 * String[] sfilter=
		 * {"Select","Nepal","India","Australia","America","New Zealand","Canada",
		 * "Germany"}; JComboBox combofilter = new JComboBox(sfilter);
		 * combofilter.setBounds(80,350,100,30); frame1.add(combofilter);
		 * 
		 * 
		 * JLabel lbl7=new JLabel("Adult"); lbl7.setBounds(370,300,100,30);
		 * frame1.add(lbl7);
		 * 
		 * JTextField dd4=new JTextField(); dd4.setBounds(410,300,70,30);
		 * frame1.add(dd4);
		 * 
		 * JLabel lbl8=new JLabel("Child"); lbl8.setBounds(370,350,100,30);
		 * frame1.add(lbl8);
		 * 
		 * JTextField dd5=new JTextField(); dd5.setBounds(410,350,70,30);
		 * frame1.add(dd5);
		 */		
		JButton btn1=new JButton("Seat Available");
		btn1.setBounds(200,450,150,50);
		frame1.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
		
			  public void actionPerformed(ActionEvent ae) {
			  frame1.dispose();
			  new Seat_Plan();
			 

			
			  }
			  
			  });
		
			 
		}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
		
		new New_Booking();
	}
	});
	}		
		
	}



