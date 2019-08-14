import javax.swing.*;

public class New {
	New(){
		JFrame frame1 = new JFrame("Search");
		frame1.setResizable(false);
		frame1.setSize(700, 600);
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		
		
		JLabel lb=new JLabel("Customer ID");
		lb.setBounds(10,10,80,30);
		frame1.add(lb);
		JTextField text=new JTextField();
		text.setBounds(120,10,100,30);
		frame1.add(text);
		
		JLabel lb1=new JLabel("Customer Name");
		lb1.setBounds(10,50,95,30);
		frame1.add(lb1);
		JTextField text1=new JTextField();
		text1.setBounds(120,50,100,30);
		frame1.add(text1);
		
		JLabel lb2=new JLabel("Gender");
		lb2.setBounds(10,90,80,30);
		frame1.add(lb2);
		
	    JRadioButton btn=new JRadioButton("Male");
	    btn.setBounds(110,90,80,30);
	    frame1.add(btn);
	    JRadioButton btn1=new JRadioButton("Female");
	    btn1.setBounds(200,90,80,30);
	    frame1.add(btn1);
	    ButtonGroup bg=new ButtonGroup();
	    bg.add(btn);
	    bg.add(btn1);
	    
	    JLabel lb3=new JLabel("D.O.B");
	    lb3.setBounds(10,130,80,30);
	    frame1.add(lb3);
	    
	    JComboBox<Integer>cmb=new JComboBox<Integer>();
		for(int k1=2000;k1<=2080;k1++) {
			cmb.addItem(k1);
		}
		cmb.setBounds(120, 130, 60, 30);
	    frame1.add(cmb);
	    
	    
		JComboBox<Integer>cmb1=new JComboBox<Integer>();
		for(int k1=1;k1<=12;k1++) {
			cmb1.addItem(k1);
		}
		cmb1.setBounds(190, 130, 60, 30);
	    frame1.add(cmb1);
	    
	    
		JComboBox<Integer>cmb2=new JComboBox<Integer>();
		for(int k1=1;k1<=31;k1++) {
			cmb2.addItem(k1);
		}
		cmb2.setBounds(260, 130, 60, 30);
	    frame1.add(cmb2);
	    
	    JLabel lb4=new JLabel("Phone No");
	    lb4.setBounds(10,170,90,30);
	    frame1.add(lb4);
	    JTextField text2=new JTextField();
	    text2.setBounds(120,170,100,30);
	    frame1.add(text2);
	    
	    JLabel lb5=new JLabel("Address");
	    lb5.setBounds(10,210,80,30);
	    frame1.add(lb5);
	    JTextField text3=new JTextField();
	    text3.setBounds(120,210,100,30);
	    frame1.add(text3);
	    
	    String[] viewcolumn = {"Cus.Id","Cus.Name","Gender","D.O.B","Phone No","Address"};
		String[][] viewrow = {{"01","Nirajan","Male","2055.11.03","9815045930","BHP"}};
		JTable viewtable = new JTable(viewrow,viewcolumn);
		JScrollPane viewsp = new JScrollPane(viewtable);
		viewsp.setBounds(20,320,650,200);
		frame1.add(viewsp);
	    	
	    
	    
	    			
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
		
		new New();
	}
	});
	}
	

		
	}


