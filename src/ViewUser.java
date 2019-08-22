import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ViewUser {
	ViewUser(){
		JFrame frame=new JFrame("View User");
		frame.setSize(1200, 650);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 0, 1200, 650);
		frame.add(jp);

		// adding the name in the panel.
		
		JLabel lbl=new JLabel("Search");
		lbl.setBounds(10,10,80,30);
		jp.add(lbl);
		JTextField text=new JTextField();
		text.setBounds(120,10,100,30);
		jp.add(text);
		
		String[]arc= {"User ID","Username"};
		JComboBox<String> combo=new JComboBox<String> (arc);
		combo.setBounds(250,10,120,30);
		jp.add(combo);
		
		JButton btn2=new JButton("Search");
		btn2.setBounds(400,10,120,35);
		jp.add(btn2);
		
		String[] viewcolumn = {"First Name","Last Name","Address","Gender","Emp ID","Phone No","Email","D.O.B","Username","Password"};
		String[][] viewrow = {{"Nirajan","Basnet","Bdp","Male","002","9815045930","nirajanbasnet246@gmail.com","2055-11-03","nirey12","***"}};
		JTable viewtable = new JTable(viewrow,viewcolumn);
		JScrollPane viewsp = new JScrollPane(viewtable);
		viewsp.setBounds(20,100,1150,400);
		jp.add(viewsp);
		
		
		JButton btn3=new JButton("Delete");
		btn3.setBounds(450,550,100,40);
		jp.add(btn3);
		
		JButton btn4=new JButton("Update");
		btn4.setBounds(600,550,100,40);
		jp.add(btn4);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new ViewUser1();
			}
		});
		
		


	}

public static void main(String[]args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new ViewUser();
		}
	});
}
}
