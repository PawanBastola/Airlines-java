/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author killer
 */
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

public class UpdateFlight {

    void clear(JComponent objname) {
        objname.removeAll();
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public UpdateFlight(String flightid) {
        Connect connect = new Connect();
        JTextField tflightid = new JTextField();

        JFrame frame = new JFrame("Update Flight");
        frame.setSize(600, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JTable jt = new JTable();
        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // or a condition at your choice with row and column
            }
        };
        String cols[] = {"S.N", "Plane Id", "Plane Name", "Nos. of Seat"};
        model.setColumnIdentifiers(cols);
        jt.setModel(model);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(5, 5, 350, 310);
        frame.add(sp);

        String sql = "SELECT * FROM `pdet` Order BY `plane_name` ASC";
        ResultSet rs1 = connect.display(sql);
        int i = 1;
        try {
            while (rs1.next()) {
                model.addRow(new Object[]{i, rs1.getString(1), rs1.getString(2), rs1.getString(3)});
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        jt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
            // your valueChanged overridden method 

                    String id = table.getValueAt(row, 1).toString();
                    tflightid.setText(id);

                }
            }
        });

        JPanel jp = new JPanel();
        jp.setBounds(365, 5, 350, 320);
        jp.setLayout(null);
        frame.add(jp);

//new
        JLabel planeid = new JLabel("Plane Id");
        planeid.setBounds(5, 10, 100, 30);
        jp.add(planeid);

        /*
         * JButton btn=new JButton("Search"); btn.setBounds(200,15,80,20);
         * frame.add(btn);
         */
        tflightid.setBounds(90, 15, 80, 20);
        jp.add(tflightid);

        //new
        JLabel from = new JLabel("From");
        from.setBounds(5, 40, 80, 30);
        jp.add(from);

        //
        JComboBox<String> Cfrom = new JComboBox<String>();
        Cfrom.setBounds(90, 45, 100, 20);
        jp.add(Cfrom);
        try {
            String sqllocationinput = "SELECT * FROM location";
            ResultSet rs = connect.display(sqllocationinput);
            while (rs.next()) {
                Cfrom.addItem(rs.getString(1));

            }

        } catch (Exception abc) {
            JOptionPane.showMessageDialog(null, abc);
        }

        //
        JLabel to = new JLabel("To");
        to.setBounds(5, 70, 100, 30);
        jp.add(to);

        JComboBox<String> Cto = new JComboBox<String>();
        Cto.setBounds(90, 75, 100, 20);
        jp.add(Cto);
        try {
            String sqllocationinput = "SELECT * FROM location";
            ResultSet rs = connect.display(sqllocationinput);
            while (rs.next()) {
                Cto.addItem(rs.getString(1));

            }

        } catch (Exception abc) {
            JOptionPane.showMessageDialog(null, abc);
        }
                        //

				//new
        //date 
        JLabel datee = new JLabel("Date");
        datee.setBounds(5, 100, 100, 30);
        jp.add(datee);

        JXDatePicker dater = new JXDatePicker();
        dater.setBounds(90, 100, 100, 20);
        dater.setDate(Calendar.getInstance().getTime());
        dater.setFormats(sdf);
        jp.add(dater);

//new
        JLabel arrival = new JLabel("Arrival");
        arrival.setBounds(5, 150, 100, 30);
        jp.add(arrival);

        //new
        JLabel departure = new JLabel("Departure");
        departure.setBounds(5, 125, 100, 30);
        jp.add(departure);

        int m, h;
        JComboBox<Integer> hd = new JComboBox();
        JComboBox<Integer> md = new JComboBox();

        hd.setBounds(90, 125, 50, 20);
        md.setBounds(147, 125, 50, 20);
        jp.add(hd);
        jp.add(md);

        JComboBox<Integer> ha = new JComboBox();
        JComboBox<Integer> ma = new JComboBox();

        ha.setBounds(90, 150, 50, 20);
        ma.setBounds(147, 150, 50, 20);
        jp.add(ha);
        jp.add(ma);
        ;
        for (h = 0; h < 24; h++) {
            ha.addItem(h);
            hd.addItem(h);
        }
        for (m = 0; m < 60; m++) {
            ma.addItem(m);
            md.addItem(m);
        }

        //new
        JLabel aprice = new JLabel("Price");
        aprice.setBounds(5, 175, 100, 30);
        jp.add(aprice);

        JTextField taprice = new JTextField();
        taprice.setBounds(90, 175, 100, 20);
        jp.add(taprice);

				//new
//				JLabel seat=new JLabel("Seats");
//				seat.setBounds(5,190,80,30);
//				jp.add(seat);
//				
//				JTextField texts=new JTextField();
//				texts.setBounds(90,195,80,20);
//				jp.add(texts);		
				//new buttons\				
        JButton updateflights = new JButton("Update");
        updateflights.setBounds(60, 270, 80, 20);

        jp.add(updateflights);
        /*
         * JButton reset = new JButton("Update"); reset.setBounds(150,270,80,20);
         * frame.add(reset); JButton delete=new JButton("Delete");
         * delete.setBounds(240,270,80,20); frame.add(delete);
         */
        
        //set TExt हरु
         try {
			String sqlsearchfid = "SELECT * from `flight` where `fid`='" + flightid + "'";
			ResultSet rs = connect.display(sqlsearchfid);
			while (rs.next()) {
                            
				tflightid.setText(rs.getString(2).toString());
				Cfrom.setSelectedItem(rs.getString(3).toString());
				Cto.setSelectedItem(rs.getString(4).toString());
                                
                                //date picker set
                                
                                
                                
                                
                            //arrival and departure
                                String depdateandtime = rs.getString(5).toString();
                                String arrdateandtime = rs.getString(6).toString();
                                
                                String[] arr1 = depdateandtime.split(" ",2);
                                String[] hourdepar= arr1[1].split(":",3);
                             
                                
                                dater.setDate(sdf.parse(arr1[0]));
                                
                                
                                String[] arr2 = arrdateandtime.split(" ",2);
                               String[] hourarr= arr2[1].split(":",3);
                                hd.setSelectedItem(Integer.parseInt(hourdepar[0]));
                                md.setSelectedItem(Integer.parseInt(hourdepar[1]));
                                System.out.println(hd);
                                ha.setSelectedItem(Integer.parseInt(hourarr[0]));
                                ma.setSelectedItem(Integer.parseInt(hourarr[1]));
                              ///
                                taprice.setText(rs.getString(7));
                                
			}
                        
                        

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
        
        
        
        

        updateflights.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
							//string collection

                    String sflightid = tflightid.getText().toString();
                    String sfrom = Cfrom.getSelectedItem().toString();
                    String stto = Cto.getSelectedItem().toString();
                    String date = sdf.format(dater.getDate());
                    String starrival = date + " " + ha.getSelectedItem().toString() + ":" + ma.getSelectedItem().toString();

                    String stdeparture = date + " " + hd.getSelectedItem().toString() + ":" + md.getSelectedItem().toString();
                    int staprice = Integer.parseInt(taprice.getText().toString());

							//  int sseat= Integer.parseInt(texts.getText().toString());
                    String sqlins = "UPDATE `flight`SET `pid`='" + sflightid + "', `f`='" + sfrom + "', `t`='" + stto + "', `dep`='" + stdeparture + "', `arr`='" + starrival + "', `price`='" + staprice + "' WHERE fid ='"+flightid+"'";

                    //string collection ends here			
                    connect.append(sqlins, "Updated");
                    clear(tflightid);

                    clear(taprice);
                    frame.dispose();
                                                      //  clear(texts);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new flight();
            }
        });
    }
}
