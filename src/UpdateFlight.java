
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class UpdateFlight {
	public UpdateFlight(String id) {
		Connect connect = new Connect();

		JFrame frame = new JFrame("Update Flight");
		frame.setSize(300, 350);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		// new
		JLabel from = new JLabel("From");
		from.setBounds(5, 40, 80, 30);
		frame.add(from);

		JTextField tfrom = new JTextField();
		tfrom.setBounds(90, 45, 80, 20);
		frame.add(tfrom);

		// new
		JLabel to = new JLabel("To");
		to.setBounds(5, 70, 80, 30);
		frame.add(to);

		JTextField tto = new JTextField();
		tto.setBounds(90, 75, 80, 20);
		frame.add(tto);

		// new
		JLabel arrival = new JLabel("Arrival");
		arrival.setBounds(5, 100, 80, 30);
		frame.add(arrival);

		JTextField tarrival = new JTextField();
		tarrival.setBounds(90, 105, 80, 20);
		frame.add(tarrival);

		// new
		JLabel departure = new JLabel("Departure");
		departure.setBounds(5, 130, 80, 30);
		frame.add(departure);

		JTextField tdeparture = new JTextField();
		tdeparture.setBounds(90, 135, 80, 20);
		frame.add(tdeparture);

		// new
		JLabel aprice = new JLabel("Adult price");
		aprice.setBounds(5, 160, 80, 30);
		frame.add(aprice);

		JTextField taprice = new JTextField();
		taprice.setBounds(90, 165, 80, 20);
		frame.add(taprice);

		// new
		JLabel cprice = new JLabel("Child price");
		cprice.setBounds(5, 190, 80, 30);
		frame.add(cprice);

		JTextField tcprice = new JTextField();
		tcprice.setBounds(90, 195, 80, 20);
		frame.add(tcprice);

		JLabel seat = new JLabel("Seats");
		seat.setBounds(5, 220, 80, 30);
		frame.add(seat);

		JTextField seatfield = new JTextField();
		seatfield.setBounds(90, 225, 80, 20);
		frame.add(seatfield);

		// new buttons\

		JButton updateflights = new JButton("Update");
		updateflights.setBounds(200, 270, 80, 20);
		frame.add(updateflights);

		try {
			String sqlsearchfid = "SELECT * from `flightdetails` where `flightid`='" + id + "'";
			ResultSet rs = connect.display(sqlsearchfid);
			while (rs.next()) {

				tfrom.setText(rs.getString(2).toString());
				tto.setText(rs.getString(3).toString());
				tarrival.setText(rs.getString(4).toString());
				tdeparture.setText(rs.getString(5).toString());
				taprice.setText(rs.getString(6).toString());
				tcprice.setText(rs.getString(7).toString());
				seatfield.setText(rs.getString(8).toString());

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		updateflights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String updatefrom = tfrom.getText().toString();
				String updateto = tto.getText().toString();
				String updatearrival = tarrival.getText().toString();
				String updatedeparture = tdeparture.getText().toString();
				int updateaprice = Integer.parseInt(taprice.getText().toString());
				int updatecprice = Integer.parseInt(tcprice.getText().toString());
				String updateseat = seatfield.getText().toString();

				String sqlupdate = "UPDATE `flightdetails` SET `from2`='" + updatefrom + "',`to2`='" + updateto
						+ "',`arrival`='" + updatearrival + "',`departure`='" + updatedeparture + "',`adultprice`='"
						+ updateaprice + "',`childprice`='" + updatecprice + "',`seatno`='" + updateseat
						+ "' WHERE `flightid`='" + id + "' ";
				connect.append(sqlupdate, "updated");
			}

		});

	}
}
