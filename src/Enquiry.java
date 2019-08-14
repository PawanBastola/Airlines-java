import javax.swing.*;
public class Enquiry {
	Enquiry(){
		JFrame frame1 = new JFrame("Ticket Enquiry");
		frame1.setResizable(false);
		frame1.setSize(550, 400);
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		
		JLabel lb=new JLabel("Cus.ID");
		lb.setBounds(10,10,80,30);
		frame1.add(lb);
		JTextField text=new JTextField();
		text.setBounds(120,10,120,30);
		frame1.add(text);
		
		JButton btn=new JButton("Search");
		btn.setBounds(350 ,10,100,30);
		frame1.add(btn);
		
		JLabel lb1=new JLabel("Ticket No");
		lb1.setBounds(10,50,80,30);
		frame1.add(lb1);
		JTextField text1=new JTextField();
		text1.setBounds(120,50,120,30);
		frame1.add(text1);
		
		JLabel lb2=new JLabel("Flight ID");
		lb2.setBounds(10,90,80,30);
		frame1.add(lb2);
		JTextField text2=new JTextField();
		text2.setBounds(120,90,120,30);
		frame1.add(text2);
		
		JLabel lb3=new JLabel("Flight Name");
		lb3.setBounds(10,130,80,30);
		frame1.add(lb3);
		JTextField text3=new JTextField();
		text3.setBounds(120,130,120,30);
		frame1.add(text3);
		
		JLabel lb4=new JLabel("Seat No");
		lb4.setBounds(10,170,80,30);
		frame1.add(lb4);
		JTextField text4=new JTextField();
		text4.setBounds(120,170,120,30);
		frame1.add(text4);
		
		JLabel lb5=new JLabel("Fare");
		lb5.setBounds(10,210,80,30);
		frame1.add(lb5);
		JTextField text5=new JTextField();
		text5.setBounds(120,210,120,30);
		frame1.add(text5);
		
		JLabel lb6=new JLabel("Date Of Journey");
		lb6.setBounds(10,250,100,30);
		frame1.add(lb6);
		
		JComboBox<Integer>cmb=new JComboBox<Integer>();
		for(int k1=2076;k1<=2080;k1++) {
			cmb.addItem(k1);
		}
		cmb.setBounds(120, 255, 60, 20);
	    frame1.add(cmb);
	    
	    
		JComboBox<Integer>cmb1=new JComboBox<Integer>();
		for(int k1=1;k1<=12;k1++) {
			cmb1.addItem(k1);
		}
		cmb1.setBounds(185, 255, 40, 20);
	    frame1.add(cmb1);
	    
	    
		JComboBox<Integer>cmb2=new JComboBox<Integer>();
		for(int k1=1;k1<=31;k1++) {
			cmb2.addItem(k1);
		}
		cmb2.setBounds(230, 255, 40, 20);
	    frame1.add(cmb2);
	    
		
		}
	
	
	public static void main(String[]args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Enquiry();
			}
		});
	}

}
