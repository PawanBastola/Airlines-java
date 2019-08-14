import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Seat_Plan {
	Seat_Plan() {
		JFrame frame1 = new JFrame("SeatPlan");
		frame1.setResizable(false);
		frame1.setSize(800, 750);
		frame1.setVisible(true);
		frame1.setLayout(null);

		ImageIcon imgge11 = new ImageIcon(new ImageIcon("C:/users/killer/Desktop/map.png").getImage()
				.getScaledInstance(800, 630, Image.SCALE_DEFAULT));

		JLabel panel1 = new JLabel(imgge11);
		panel1.setBounds(0, 0, 800, 630);
		panel1.setLayout(null);
		frame1.add(panel1);

		JButton btn2 = new JButton("1");
		btn2.setBounds(250, 120, 50, 20);

		panel1.add(btn2);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btn2.setBackground(Color.red);

			}

		});

		panel1.add(btn2);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btn2.setBackground(Color.white);
			}

		});

		JButton btn3 = new JButton("2");
		btn3.setBounds(300, 120, 50, 20);
		panel1.add(btn3);

		JButton btn4 = new JButton("3");
		btn4.setBounds(250, 150, 50, 20);
		panel1.add(btn4);

		JButton btn5 = new JButton("4");
		btn5.setBounds(300, 150, 50, 20);
		panel1.add(btn5);

		JButton btn6 = new JButton("5");
		btn6.setBounds(250, 180, 50, 20);
		panel1.add(btn6);

		JButton btn7 = new JButton("6");
		btn7.setBounds(300, 180, 50, 20);
		panel1.add(btn7);

		JButton btn8 = new JButton("7");
		btn8.setBounds(250, 210, 50, 20);
		panel1.add(btn8);

		JButton btn9 = new JButton("8");
		btn9.setBounds(300, 210, 50, 20);
		panel1.add(btn9);

		JButton btn10 = new JButton("9");
		btn10.setBounds(250, 240, 50, 20);
		panel1.add(btn10);

		JButton btn11 = new JButton("10");
		btn11.setBounds(300, 240, 50, 20);
		panel1.add(btn11);

		JButton btn12 = new JButton("11");
		btn12.setBounds(250, 270, 50, 20);
		panel1.add(btn12);

		JButton btn13 = new JButton("12");
		btn13.setBounds(300, 270, 50, 20);
		panel1.add(btn13);

		JButton btn14 = new JButton("13");
		btn14.setBounds(250, 300, 50, 20);
		panel1.add(btn14);

		JButton btn15 = new JButton("14");
		btn15.setBounds(300, 300, 50, 20);
		panel1.add(btn15);

		JButton btn16 = new JButton("15");
		btn16.setBounds(250, 330, 50, 20);
		panel1.add(btn16);

		JButton btn17 = new JButton("16");
		btn17.setBounds(300, 330, 50, 20);
		panel1.add(btn17);

		JButton btn18 = new JButton("17");
		btn18.setBounds(250, 360, 50, 20);
		panel1.add(btn18);

		JButton btn19 = new JButton("18");
		btn19.setBounds(300, 360, 50, 20);
		panel1.add(btn19);

		JButton btn20 = new JButton("19");
		btn20.setBounds(250, 390, 50, 20);
		panel1.add(btn20);

		JButton btn21 = new JButton("20");
		btn21.setBounds(300, 390, 50, 20);
		panel1.add(btn21);

		JButton btn22 = new JButton("21");
		btn22.setBounds(250, 420, 50, 20);
		panel1.add(btn22);

		JButton btn23 = new JButton("22");
		btn23.setBounds(300, 420, 50, 20);
		panel1.add(btn23);

		JButton btn24 = new JButton("23");
		btn24.setBounds(250, 450, 50, 20);
		panel1.add(btn24);

		JButton btn25 = new JButton("24");
		btn25.setBounds(300, 450, 50, 20);
		panel1.add(btn25);

		JButton btn26 = new JButton("25");
		btn26.setBounds(250, 480, 50, 20);
		panel1.add(btn26);

		JButton btn27 = new JButton("26");
		btn27.setBounds(300, 480, 50, 20);
		panel1.add(btn27);

		JButton btn28 = new JButton("27");
		btn28.setBounds(450, 120, 50, 20);
		panel1.add(btn28);

		JButton btn29 = new JButton("28");
		btn29.setBounds(500, 120, 50, 20);
		panel1.add(btn29);

		JButton btn30 = new JButton("29");
		btn30.setBounds(450, 150, 50, 20);
		panel1.add(btn30);

		JButton btn31 = new JButton("30");
		btn31.setBounds(500, 150, 50, 20);
		panel1.add(btn31);

		JButton btn32 = new JButton("31");
		btn32.setBounds(450, 180, 50, 20);
		panel1.add(btn32);

		JButton btn33 = new JButton("32");
		btn33.setBounds(500, 180, 50, 20);
		panel1.add(btn33);

		JButton btn34 = new JButton("33");
		btn34.setBounds(450, 210, 50, 20);
		panel1.add(btn34);

		JButton btn35 = new JButton("34");
		btn35.setBounds(500, 210, 50, 20);
		panel1.add(btn35);

		JButton btn36 = new JButton("35");
		btn36.setBounds(450, 240, 50, 20);
		panel1.add(btn36);

		JButton btn37 = new JButton("36");
		btn37.setBounds(500, 240, 50, 20);
		panel1.add(btn37);

		JButton btn38 = new JButton("37");
		btn38.setBounds(450, 270, 50, 20);
		panel1.add(btn38);

		JButton btn39 = new JButton("38");
		btn39.setBounds(500, 270, 50, 20);
		panel1.add(btn39);

		JButton btn40 = new JButton("39");
		btn40.setBounds(450, 300, 50, 20);
		panel1.add(btn40);

		JButton btn41 = new JButton("40");
		btn41.setBounds(500, 300, 50, 20);
		panel1.add(btn41);

		JButton btn42 = new JButton("41");
		btn42.setBounds(450, 330, 50, 20);
		panel1.add(btn42);

		JButton btn43 = new JButton("42");
		btn43.setBounds(500, 330, 50, 20);
		panel1.add(btn43);

		JButton btn44 = new JButton("43");
		btn44.setBounds(450, 360, 50, 20);
		panel1.add(btn44);

		JButton btn45 = new JButton("44");
		btn45.setBounds(500, 360, 50, 20);
		panel1.add(btn45);

		JButton btn46 = new JButton("45");
		btn46.setBounds(450, 390, 50, 20);
		panel1.add(btn46);

		JButton btn47 = new JButton("46");
		btn47.setBounds(500, 390, 50, 20);
		panel1.add(btn47);

		JButton btn48 = new JButton("47");
		btn48.setBounds(450, 420, 50, 20);
		panel1.add(btn48);

		JButton btn49 = new JButton("48");
		btn49.setBounds(500, 420, 50, 20);
		panel1.add(btn49);

		JButton btn50 = new JButton("49");
		btn50.setBounds(450, 450, 50, 20);
		panel1.add(btn50);

		JButton btn51 = new JButton("50");
		btn51.setBounds(500, 450, 50, 20);
		panel1.add(btn51);

		JButton btn52 = new JButton("51");
		btn52.setBounds(450, 480, 50, 20);
		panel1.add(btn52);

		JButton btn53 = new JButton("52");
		btn53.setBounds(500, 480, 50, 20);
		panel1.add(btn53);

		JLabel lbl = new JLabel("Ticket No");
		lbl.setBounds(0, 640, 80, 30);
		frame1.add(lbl);

		JTextField txt = new JTextField();
		txt.setBounds(60, 640, 80, 30);
		frame1.add(txt);

		JLabel lbl1 = new JLabel("Customer ID");
		lbl1.setBounds(140, 640, 100, 30);
		frame1.add(lbl1);

		JTextField txt1 = new JTextField();
		txt1.setBounds(220, 640, 80, 30);
		frame1.add(txt1);

		JLabel lbl2 = new JLabel("Customer Name");
		lbl2.setBounds(300, 640, 100, 30);
		frame1.add(lbl2);

		JTextField txt2 = new JTextField();
		txt2.setBounds(400, 640, 80, 30);
		frame1.add(txt2);

		JLabel lbl3 = new JLabel("Price");
		lbl3.setBounds(490, 640, 100, 30);
		frame1.add(lbl3);

		JTextField txt3 = new JTextField();
		txt3.setBounds(530, 640, 80, 30);
		frame1.add(txt3);

		JLabel lbl4 = new JLabel("Total Cost");
		lbl4.setBounds(620, 640, 100, 30);
		frame1.add(lbl4);

		JTextField txt4 = new JTextField();
		txt4.setBounds(680, 640, 80, 30);
		frame1.add(txt4);

		JButton btn = new JButton("Book");
		btn.setBounds(20, 550, 100, 50);
		panel1.add(btn);

		JButton btn1 = new JButton("Book & Print");
		btn1.setBounds(670, 550, 120, 50);
		panel1.add(btn1);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Seat_Plan();
			}

		});
	}
}
