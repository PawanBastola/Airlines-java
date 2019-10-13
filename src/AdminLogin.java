
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin {
TxtCompare up=new TxtCompare();
    AdminLogin() {

        Connect connect = new Connect();

        JFrame frame = new JFrame("Login");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        ImageIcon image1 = new ImageIcon(new ImageIcon("img/loginpage.jpg").getImage()
                .getScaledInstance(500, 300, Image.SCALE_DEFAULT));
        JLabel imagebackground = new JLabel(image1);
        imagebackground.setLayout(null);
        imagebackground.setBounds(0, 0, 500, 300);
        frame.add(imagebackground);

        JButton backbtn = new JButton("back");
        backbtn.setBounds(5, 10, 80, 40);
        imagebackground.add(backbtn);

        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MainWindow();
            }
        });
        JLabel lgnusername = new JLabel("USERNAME:");
        lgnusername.setFont(new Font("Moonspace", Font.BOLD, 15));
        lgnusername.setForeground(Color.WHITE);
        lgnusername.setBounds(20, 80, 100, 50);
        imagebackground.add(lgnusername);

        JTextField userfield = new JTextField();
        userfield.setBounds(130, 88, 150, 30);
        imagebackground.add(userfield);

        JLabel lgnpassword = new JLabel("PASSWORD:");
        lgnpassword.setFont(new Font("Moonspace", Font.BOLD, 15));
        lgnpassword.setForeground(Color.WHITE);
        lgnpassword.setBounds(20, 120, 100, 50);
        imagebackground.add(lgnpassword);

        JPasswordField pwdfield = new JPasswordField();
        pwdfield.setBounds(130, 128, 150, 30);
        imagebackground.add(pwdfield);

        JCheckBox box = new JCheckBox("Keep me logged in");
        box.setBounds(20, 230, 150, 30);
        box.setSelected(true);
        imagebackground.add(box);

        JButton lgnbtn = new JButton("Login");
        lgnbtn.setBounds(280, 170, 110, 35);
        imagebackground.add(lgnbtn);

        
        
        ////
//        TxtCompare up = new TxtCompare();
//        if(!up.compare(name,"Aas")) {
//			   JOptionPane.showMessageDialog(null, "Invalid Name");
//		   }
//		   else if(up.compare(name,"Aas")) {
//			   if(!up.compare(fname,"Aas")){
//				   JOptionPane.showMessageDialog(null, "Invalid Name");
//				   
//			   }else if(up.compare(fname,"Aas")) {
//				   if(!up.compare(address,"Aas")) {
//					   JOptionPane.showMessageDialog(null, "Invalid Name");
//					   
//				   }else if(up.compare(address,"Aas")) {
//					   if(!up.compare(phone,"N")) {
//						   JOptionPane.showMessageDialog(null, "Invalid PhoneNumber");
//						   
//					   }else if(up.compare(phone,"N")) {
//						   
//						   if(!up.compare(cno,"N"))  {
//							   JOptionPane.showMessageDialog(null, "Invalid Citizenship No.");
//							   
//						   }else if(up.compare(cno,"N")) {
//							   
//							   if(!up.compare(lno,"N")) {
//								   JOptionPane.showMessageDialog(null, "Invalid License");
//								   
//							   }else if(up.compare(lno,"Aas")) {
//								   
//								     if(!up.compare(email, "E")) {
//									   JOptionPane.showMessageDialog(null, "Invalid Email");
//									   
//								   }else if(up.compare(email, "E")) {
//									   
//									   if(!up.compare(age,"N")) {
//										   JOptionPane.showMessageDialog(null, "Invalid Email");
//									   }else if(up.compare(age,"N")) {  
//									   
//										 JOptionPane.showMessageDialog(null, "Invalid Age");
//									try {
//										String sql ="INSERT INTO customer(`Cid`, `name`, `fathername`, `address`, `phone`, `csno`, `lno`, `email`, `age`, `gender`) VALUES (null,'"+name+"','"+fname+"','"+address+"','"+phone+"','"+cno+"','"+lno+"','"+email+"','"+age+"','"+gen+"')";
//											up.st.execute(sql);
//											JOptionPane.showMessageDialog(null,"Done");
//											     clear(txt);
//											    clear(txt1);
//											    clear(txt2);
//											    clear(txt3);
//											    clear(txt4);
//											    clear(txt5);
//											    clear(txt6);
//											    clear(txt7);
//											
//											
//											
//											
//										}catch (SQLException e) {
//										e.printStackTrace();
//										}up.updatecustomer(viewtable, autotablerow, up.st,"Cid");
//								   
//								   
//									      }
//									   }         
//				      	           }
//			  		            }
//				              }
//					       } 
//			            }
//			         }
//		         
//	}
//});

        
        
        ///
        lgnbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // connecting and getting usertype from database
                

                    String uname = userfield.getText().toString();
                    String pwd = String.valueOf(pwdfield.getPassword());
if(!up.compare(uname,"Aas")){
    JOptionPane.showMessageDialog(null,"Invalid username");
}else if(up.compare(uname,"Aas")){
    
                  try{
                    String sql = "SELECT * FROM `adminanduser`";

                    ResultSet rs = connect.display(sql);
                    while (rs.next()) {
                        String username = rs.getString(1);
                        String password = rs.getString(2);
                        String usertype = rs.getString(3);

                        if (uname.equals(username) && pwd.equals(password)) {
                            frame.dispose();
                            new AdminInterface(usertype);
                        }
                        

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

}      

}
});
    }
}
    


