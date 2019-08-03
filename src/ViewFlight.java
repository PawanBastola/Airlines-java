import javax.swing.*;

public class ViewFlight {
	
	public ViewFlight() {
		
		JFrame frame=new JFrame("View Flight");
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		String[] view = {"flight id","from","to", "arrival","departure","price(adult)","price(child)"};
		String[][] data = {{"45","bhadrapur","pokhara","6:00 am","10:00 am","8000","4500"},{"45","bhadrapur","pokhara","6:00 am","10:00 am","8000","4500"}};
		JTable viewflighttable = new JTable(data,view);
		JScrollPane scrollflight = new JScrollPane(viewflighttable);
		scrollflight.setBounds(20,10,550,300);
		frame.add(scrollflight);
	}

}



