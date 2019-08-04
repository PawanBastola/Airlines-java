import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewFlight {
	
	public ViewFlight() {
            
            Connect conn= new Connect();
		
		JFrame frame=new JFrame("View Flight");
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
                DefaultTableModel dtm = new DefaultTableModel();
                
                
		String[] view = {"flight id","from","to", "arrival","departure","price(adult)","price(child)"};
		dtm.setColumnIdentifiers(view);
		JTable viewflighttable = new JTable();
                viewflighttable.setModel(dtm);
		JScrollPane scrollflight = new JScrollPane(viewflighttable);
		scrollflight.setBounds(20,10,550,300);
		frame.add(scrollflight);
                
                try{
                    
                    String sql = "SELECT * FROM addflight";
                    ResultSet rs= conn.display(sql);
                     while(rs.next()){
                     dtm.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)}
                             
                         );
                     }               
                }catch(Exception e){
	}

}
        public static void main(String[] args) {
        new ViewFlight();
    }
}