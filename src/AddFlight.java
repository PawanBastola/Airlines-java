
import javax.swing.*;

public class AddFlight {
	public AddFlight() {
		JFrame frame=new JFrame("Add Flight");
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		//new
		JLabel flightid = new JLabel("Flight Id");
		flightid.setBounds(5,10,80,30);
		frame.add(flightid);
		
		JTextField tflightid = new JTextField();
		tflightid.setBounds(90,15,80,20);
		frame.add(tflightid);
		
		//new
				JLabel from = new JLabel("From");
				from.setBounds(5,40,80,30);
				frame.add(from);
				
				JTextField tfrom = new JTextField();
				tfrom.setBounds(90,45,80,20);
				frame.add(tfrom);
				
				//new
				JLabel to = new JLabel("To");
				to.setBounds(5,70,80,30);
				frame.add(to);
				
				JTextField tto = new JTextField();
				tto.setBounds(90,75,80,20);
				frame.add(tto);
				
				//new
				JLabel arrival = new JLabel("Arrival");
				arrival.setBounds(5,100,80,30);
				frame.add(arrival);
				
				JTextField tarrival = new JTextField();
				tarrival.setBounds(90,105,80,20);
				frame.add(tarrival);
		
				//new
				JLabel departure= new JLabel("Departure");
				departure.setBounds(5,130,80,30);
				frame.add(departure);
				
				JTextField tdeparture = new JTextField();
				tdeparture.setBounds(90,135,80,20);
				frame.add(tdeparture);

				//new
				JLabel aprice= new JLabel("Adult price");
				aprice.setBounds(5,160,80,30);
				frame.add(aprice);
				
				JTextField taprice = new JTextField();
				taprice.setBounds(90,165,80,20);
				frame.add(taprice);
				
				//new
				JLabel cprice= new JLabel("Child price");
				cprice.setBounds(5,190,80,30);
				frame.add(cprice);
				
				JTextField tcprice = new JTextField();
				tcprice.setBounds(90,195,80,20);
				frame.add(tcprice);
				
				//new buttons
				
				JButton addflights = new JButton("add");
				addflights.setBounds(150,225,60,20);
				frame.add(addflights);
				JButton reset = new JButton("reset");
				reset.setBounds(220,225,70,20);
				frame.add(reset);
	}

}



