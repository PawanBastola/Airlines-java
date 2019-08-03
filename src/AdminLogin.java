
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdminLogin {
	AdminLogin(){
		JFrame frame=new JFrame("AdminLogin");
		frame.setSize(500, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		ImageIcon image1 =new ImageIcon(new ImageIcon("C:/users/killer/Desktop/loginpage.jpg").getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT));
		JLabel imagebackground = new JLabel(image1);
		imagebackground.setLayout(null);
		imagebackground.setBounds(0,0,500,300);
		frame.add(imagebackground);
		
		JButton backbtn=new JButton("back");
		backbtn.setBounds(5,10,80,40);
		imagebackground.add(backbtn);
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new Airline();
			}
		});
		JLabel lgnusername = new JLabel("USERNAME:");
				lgnusername.setFont(new Font("Moonspace",Font.BOLD,15));
				lgnusername.setForeground(Color.WHITE);
				lgnusername.setBounds(20,80,100,50);
				imagebackground.add(lgnusername);
				
				JTextField userfield = new JTextField();
				userfield.setBounds(130,88,150,30);
				imagebackground.add(userfield);
				
				JLabel lgnpassword = new JLabel("PASSWORD:");
				lgnpassword.setFont(new Font("Moonspace",Font.BOLD,15));
				lgnpassword.setForeground(Color.WHITE);
				lgnpassword.setBounds(20,120,100,50);
				imagebackground.add(lgnpassword);
				

				JPasswordField pwdfield = new JPasswordField();
				pwdfield.setBounds(130,128,150,30);
				imagebackground.add(pwdfield);
				
				JCheckBox box=new JCheckBox("Keep me logged in");
				box.setBounds(20,230,150,30);
				box.setSelected(true);
				imagebackground.add(box);
				
				
				JButton lgnbtn = new JButton("Login");
				lgnbtn.setBounds(280,170,110,35);
				imagebackground.add(lgnbtn);
				
				lgnbtn.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae) {
					String uname = userfield.getText().toString();
					String pwd = pwdfield.getText().toString();
					
					if(uname.equals("admin") && pwd.equals("admin")) {
						frame.dispose();
						new AdminInterface();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Re-enter your username and password");
						userfield.setText(null);
						pwdfield.setText(null);
					}
					}
				 });
				
				
				
				
	}
}
		

		
	

