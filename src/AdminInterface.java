
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminInterface {

    AdminInterface(String usertype) {
        JFrame frame = new JFrame("AdminInterface : " + usertype);

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        ImageIcon image1 = new ImageIcon(new ImageIcon("img/dashboard.jpg").getImage()
                .getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
        JLabel imagebackground = new JLabel(image1);
        imagebackground.setLayout(null);
        imagebackground.setSize(screenSize.width, screenSize.height);
        frame.add(imagebackground);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, screenSize.width, 50);
        mb.setBackground(Color.GRAY);
        imagebackground.add(mb);

        JMenu menu1 = new JMenu("Book Flight     ");
        mb.add(menu1);
        JMenuItem item1a = new JMenuItem("New Booking");
        menu1.add(item1a);
//		JMenuItem item3a=new JMenuItem("Ticket Enquiry");
//		menu1.add(item3a);
        mb.add(menu1);
        item1a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new New_Booking();

            }
        });

//		item3a.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				new Enquiry();
//			}
//		});
        JMenu menu2 = new JMenu("View Booking     ");
        JMenuItem item4a = new JMenuItem("Traverse Details");

        menu2.add(item4a);
        mb.add(menu2);

        item4a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new View_Booking();
            }

        });

        JMenu menu3 = new JMenu("Manage Account     ");
        JMenuItem addsignup = new JMenuItem("Add User");
        // now adding actionlistener to the signup button on menuitem signup

        addsignup.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                new Adduser();

            }

        });
        if (usertype.equals("admin")) {
            mb.add(menu3);

        }
        JMenu menu4 = new JMenu("Flight Details     ");
        mb.add(menu4);
        JMenuItem item = new JMenuItem("Add Flight");

        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                new flight();
            }
        });
        if (usertype.equals("admin")) {
            menu4.add(item);
        }

        JMenuItem item1 = new JMenuItem("View Flight");
        menu4.add(item1);

        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                new View_Details(usertype);
            }
        });

        JMenuItem view = new JMenuItem("View User");
        menu3.add(addsignup);
        menu3.add(view);

        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new ViewUser();
            }
        });

        JMenu planemenu = new JMenu("Plane");
        mb.add(planemenu);
        JMenuItem addplane = new JMenuItem("Add Plane");
        if (usertype.equals("admin")) {
            planemenu.add(addplane);
        }
        addplane.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                new plane();
            }
        });

        JMenuItem viewplane = new JMenuItem("View Plane");
        planemenu.add(viewplane);
        viewplane.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                new view_plane(usertype);
            }
        });

        JMenuItem menu5 = new JMenuItem("Log Out");

        mb.add(menu5);
        menu5.setBackground(Color.GRAY);

        menu5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MainWindow();

            }

        });

    }

}
