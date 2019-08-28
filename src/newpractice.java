
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class newpractice extends JFrame {

	newpractice(int totalseat) {
		JFrame frame1 = new JFrame("info");
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		frame1.setLayout(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame1.setSize(screenSize.width, screenSize.height);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);

		// for seat number
		/*
		 * JLabel seatno = new JLabel("seat no.:"); seatno.setBounds(0, 0, 80, 20);
		 * frame1.add(seatno);
		 * 
		 * JTextField seatnofield = new JTextField(totalseat); seatnofield.setBounds(90,
		 * 0, 50, 20); frame1.add(seatnofield);
		 */

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setLayout(new FlowLayout());
		panel1.setBounds(50, 200, 250, 400);
		panel1.setBackground(Color.GREEN);
		frame1.add(panel1);

		totalseat = totalseat + 1;

		int i = 1;
		JLabel name[] = new JLabel[totalseat];
		JTextField namefield[] = new JTextField[totalseat];
		JLabel type[] = new JLabel[totalseat];
		JComboBox<String> cmb[] = new JComboBox[totalseat];

		// not working

		try {
			for (i = 1; i <= totalseat; i++) {

				name[i] = new JLabel("NAME :" + i);
				panel1.add(name[i]);

				namefield[i] = new JTextField();
				namefield[i].setPreferredSize(new Dimension(75, 30));
				panel1.add(namefield[i]);

				type[i] = new JLabel("type :");
				panel1.add(type[i]);

				String typestr[] = { "adult", "child" };
				cmb[i] = new JComboBox<String>(typestr);
				panel1.add(cmb[i]);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String a = cmb[1].getSelectedItem().toString();
		String b = cmb[2].getSelectedItem().toString();
		String c = cmb[3].getSelectedItem().toString();

		JButton addinfo = new JButton("pawan");
		addinfo.setBounds(150, 0, 100, 20);
		frame1.add(addinfo);
		addinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				JOptionPane.showMessageDialog(null, a);
				JOptionPane.showMessageDialog(null, b);
				JOptionPane.showMessageDialog(null, c);
			}

		});

	}
}
