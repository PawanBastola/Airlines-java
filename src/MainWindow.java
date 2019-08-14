import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow {

	MainWindow() {

		JFrame frame1 = new JFrame("Airlines Project");
		frame1.setResizable(false);
		frame1.setSize(1200, 700);
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);

		ImageIcon imgge11 = new ImageIcon(new ImageIcon("img/dashboard.jpg").getImage()
				.getScaledInstance(1200, 700, Image.SCALE_DEFAULT));

		JLabel panel1 = new JLabel(imgge11);
		panel1.setBounds(0, 0, 1200, 700);
		panel1.setLayout(null);
		frame1.add(panel1);

		JLabel lbl1 = new JLabel("AIRLINES TICKETING SYSTEM");
		lbl1.setBounds(140, -10, 1100, 100);
		lbl1.setLayout(null);
		lbl1.setFont(new Font("Moonspace", Font.BOLD, 62));
		lbl1.setForeground(Color.RED);
		panel1.add(lbl1);

		JButton getstarted = new JButton("Get Started");
		getstarted.setBounds(550, 580, 120, 70);
		panel1.add(getstarted);
		getstarted.setBackground(Color.GRAY);
		getstarted.setForeground(Color.WHITE);
		getstarted.setFont(new Font("Moonspace", Font.BOLD, 15));

		getstarted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				new AdminLogin();
				frame1.dispose();

			}

		});

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new MainWindow();
			}
		});
	}
}
