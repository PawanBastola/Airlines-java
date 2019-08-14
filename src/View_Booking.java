import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class View_Booking {

	Connect connect = new Connect();

	View_Booking() {
		JFrame frame = new JFrame("View details");
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel search = new JLabel("Search");
		search.setBounds(20, 10, 100, 30);
		frame.add(search);

		JTextField searchfield = new JTextField();
		searchfield.setBounds(120, 10, 100, 30);
		frame.add(searchfield);

		DefaultTableModel autotablerow = new DefaultTableModel();
		String[] viewcolumn = { "Ticketno", "CID", "C.Name", "Citizen", "Gender", "D.O.B", "Phone", "Nationality",
				"Address", "Date", "Flight Id", "Seat No", "Class" };

		JTable viewtable = new JTable();
		autotablerow.setColumnIdentifiers(viewcolumn);
		viewtable.setModel(autotablerow);

		viewtable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane viewsp = new JScrollPane(viewtable);
		viewsp.setBounds(20, 50, 750, 300);
		frame.add(viewsp);

		try {
			String sql = "SELECT * FROM customerdetails";
			ResultSet rs = connect.display(sql);
			while (rs.next()) {
				autotablerow.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13) });
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		JButton update = new JButton("Update");
		update.setBounds(240, 360, 130, 40);
		frame.add(update);

		searchfield.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ef) {
				String sql;
				if (searchfield.getText().length() != 0) {
					sql = "SELECT * FROM `customerdetails` WHERE `customer_id` LIKE '"
							+ Integer.parseInt(searchfield.getText().toString()) + "%'|| `phone` LIKE'"
							+ Integer.parseInt(searchfield.getText().toString()) + "%'";
				} else {
					sql = "SELECT * FROM `customerdetails`";
				}

				try {
					ResultSet rs = connect.display(sql);
					viewsp.repaint();
					autotablerow.getDataVector().removeAllElements();

					while (rs.next()) {
						autotablerow.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
								rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
								rs.getString(13) });
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		update.addActionListener(new ActionListener() {
			String tno;

			public void actionPerformed(ActionEvent ae) {
				int[] row = viewtable.getSelectedRows();
				for (int i = 0; i < row.length; i++) {
					tno = (String) viewtable.getValueAt(row[i], 0);

				}
				new update_delete_customerdetails(tno);
			}
		});

		JButton cancel = new JButton("Cancel booking");
		cancel.setBounds(400, 360, 130, 40);
		frame.add(cancel);

		cancel.addActionListener(new ActionListener() {
			String tno;

			public void actionPerformed(ActionEvent ae) {
				int[] row = viewtable.getSelectedRows();
				for (int i = 0; i < row.length; i++) {
					tno = (String) viewtable.getValueAt(row[i], 0);

					String sqldel = "DELETE FROM `customerdetails` where `ticketno`='" + tno + "'";
					connect.append(sqldel, "cancel");
				}
			}
		});

	}

}
