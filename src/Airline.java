import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Airline {
	Airline(){
		JFrame frame  = new JFrame("Login Page");
		frame.setResizable(false);
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		ImageIcon image1 =new ImageIcon(new ImageIcon("C:/users/killer/Desktop/beforelogin.png").getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT));
		
		JLabel imgpane = new JLabel(image1);
		imgpane.setBounds(0,0,400,300);
		imgpane.setLayout(null);
		frame.add(imgpane);
		
		
		ImageIcon image2 =new ImageIcon(new ImageIcon("C:/users/killer/Desktop/adminlogo.png").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
		JLabel imgpane2 = new JLabel(image2);
		imgpane2.setBounds(30,10,100,100);
		imgpane2.setLayout(null);
		imgpane.add(imgpane2);
		
		JButton btn=new JButton("ADMIN");
		btn.setBounds(150,30,100,50);
		imgpane.add(btn);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new AdminLogin();
			}
		});

	

		ImageIcon image3 =new ImageIcon(new ImageIcon("C:/users/killer/Desktop/userlogo.png").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
		JLabel imgpane3 = new JLabel(image3);
		imgpane3.setBounds(30,160,100,100);
		imgpane3.setLayout(null);
		imgpane.add(imgpane3);
		
		JButton btn1=new JButton("USER");
		btn1.setBounds(150,180,100,50);
		imgpane.add(btn1);
		
		
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new UserLogin();
			}
		});
		
		
	}
			
	
}



