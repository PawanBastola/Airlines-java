
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class viewandupdate {
viewandupdate(){ 
    JFrame frame=new JFrame("View and update flight");
		frame.setSize(1000, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
                JLabel search = new JLabel("search");
                search.setBounds(5, 5, 60, 20);
                frame.add(search);
                
                JTextField searchfield= new JTextField();
                searchfield.setBounds(75,5,60,20);
                frame.add(searchfield);
                
                
                JLabel fid = new JLabel("fid");
                fid.setBounds(5, 30, 60, 20);
                frame.add(fid);
                
                JTextField cidfield= new JTextField();
                cidfield.setBounds(75,30,60,20);
                frame.add(cidfield);
                
                JLabel from = new JLabel("from");
                from.setBounds(5, 60, 60, 20);
                frame.add(from);
                
                JTextField namefield= new JTextField();
                namefield.setBounds(75,60,60,20);
                frame.add(namefield);
                
                
                JLabel to = new JLabel("To");
                to.setBounds(5, 90, 60, 20);
                frame.add(to);
                
                JTextField tofield= new JTextField();
                tofield.setBounds(75,90,60,20);
                frame.add(tofield);
                
                 JLabel arrival = new JLabel("Arrival");
                arrival.setBounds(5, 120, 60, 20);
                frame.add(arrival);
                
                JTextField arrivalfield= new JTextField();
                arrivalfield.setBounds(75,120,60,20);
                frame.add(arrivalfield);
                
                
                 JLabel Depature = new JLabel("Depature");
                Depature.setBounds(5, 150, 60, 20);
                frame.add(Depature);
                
                JTextField Depaturefield= new JTextField();
                Depaturefield.setBounds(75,150,60,20);
                frame.add(Depaturefield);
                
                JLabel adult = new JLabel("Price(adult)");
                adult.setBounds(5, 180, 60, 20);
                frame.add(adult);
                
                JTextField adultfield= new JTextField();
                adultfield.setBounds(75,180,60,20);
                frame.add(adultfield);
             
                
                JLabel child = new JLabel("Price(child)");
                child.setBounds(5, 210, 60, 20);
                frame.add(child);
                
                JTextField childfield= new JTextField();
                childfield.setBounds(75,210,60,20);
                frame.add(childfield);
             
                
                
                JButton update = new JButton("UPDATE");
	        update.setBounds(150,455,120,40);
		frame.add(update);
		JButton delete = new JButton("DELETE");
		delete.setBounds(320,455,120,40);
		frame.add(delete);
                 JButton reset = new JButton("RESET");
	        reset.setBounds(490,455,120,40);
		frame.add(reset);
                
                
                 JButton seat = new JButton("CHANGE SEAT");
	        seat.setBounds(800,455,160,40);
		frame.add(seat);
		
		String[] view = {"flight id","from","to", "arrival","departure","price(adult)","price(child)"};
		String[][] data = {{"45","bhadrapur","pokhara","6:00 am","10:00 am","8000","4500"},{"45","bhadrapur","pokhara","6:00 am","10:00 am","8000","4500"}};
		JTable viewflighttable = new JTable(data,view);
		JScrollPane scrollflight = new JScrollPane(viewflighttable);
		scrollflight.setBounds(440,10,550,200);
		frame.add(scrollflight);
}
    
 public static void main(String [] args){
     SwingUtilities.invokeLater(new Runnable() {
		public void run() {
	  new viewandupdate();
}
});
   
 }   
    
}
