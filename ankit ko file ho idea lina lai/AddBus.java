




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class AddBus {
	public AddBus() {
		Connect connect=new Connect();
		
		JFrame frame=new JFrame("Add BUS");
		frame.setSize(300, 350);
		frame.setLayout(null);
		
		
		//new
		JLabel bname = new JLabel("Bus Name");
		bname.setBounds(5,10,80,30);
		frame.add(bname);
		
		JTextField bnametxt = new JTextField();
		bnametxt.setBounds(90,15,80,20);
		frame.add(bnametxt);
		
		//new
				JLabel from = new JLabel("From");
				from.setBounds(5,40,80,30);
				frame.add(from);
				
				JTextField fromtxt = new JTextField();
				fromtxt.setBounds(90,45,80,20);
				frame.add(fromtxt);
				
				//new
				JLabel to = new JLabel("TO");
				to.setBounds(5,70,80,30);
				frame.add(to);
				
				JTextField totxt = new JTextField();
				totxt.setBounds(90,75,80,20);
				frame.add(totxt);
				
				//new
				JLabel dep = new JLabel("Departure time");
				dep.setBounds(5,100,80,30);
				frame.add(dep);
				
				JTextField deptxt = new JTextField();
				deptxt.setBounds(90,105,80,20);
				frame.add(deptxt);
		
				//new
				JLabel type= new JLabel("Type");
				type.setBounds(5,130,80,30);
				frame.add(type);
				

				String arr[]= {"AC","NON AC"};
				JComboBox typetxt=new JComboBox(arr);
				typetxt.setBounds(90,135,80,20);
				frame.add(typetxt);
				
			
				//new
				JLabel distance= new JLabel("distance*km");
				distance.setBounds(5,160,80,30);
				frame.add(distance);
				
				JTextField distxt = new JTextField();
				distxt.setBounds(90,165,80,20);
				frame.add(distxt);
	
				
				
				//new
				JLabel rate= new JLabel("Rate(Rs.)");
				rate.setBounds(5,190,80,30);
				frame.add(rate);
				
				JTextField ratetxt = new JTextField();
				ratetxt.setBounds(90,195,80,20);
				frame.add(ratetxt);
				
				
				
				
				//new buttons
				
				JButton addflights = new JButton("add");
				addflights.setBounds(150,280,60,20);
				frame.add(addflights);
				
				JButton reset = new JButton("reset");
				reset.setBounds(220,280,70,20);
				frame.add(reset);
				
				addflights.addActionListener(new ActionListener() {
				      public void actionPerformed(ActionEvent ae) {
			             try {
			            	 int busId,rate,distance;
			            	 String Busname,from,to,type;
			            	 int depart;
			            	 Busname=bnametxt.getText().toString();
			            	 from=fromtxt.getText().toString();
			            	 to=totxt.getText().toString();
			            	 type=typetxt.getSelectedItem().toString();
			            	 
			            	 rate=Integer.parseInt(ratetxt.getText().toString());
			            	 distance=Integer.parseInt(distxt.getText().toString());
			            	 depart=Integer.parseInt(deptxt.getText().toString());
			            	 
			            	 
			            	 
			            	 String sql="INSERT INTO `addbus` (`Busid`, `Bus Name`, `from1`, `to1`, `Departure`, `Type`, `distance`, `Rate`) "
			            	 		+ "VALUES (NULL, '"+Busname+"', '"+from+"', '"+to+"', '"+depart+"', '"+type+"', '"+distance+"', '"+rate+"')";
			            	 connect.append(sql,"inserted");
			            	 
			             }catch(Exception e) {
			            	 
			             }
						
						   }	
					   });
	
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
	}

	
	
	public static void main(String[] args) {
		new AddBus();
	}
}





