
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
        String[] viewcolumn = {"Ticketno", "CID", "C.Name", "Citizen", "Gender", "Phone", "Nationality",
            "Address", "Date", "Flight Id", "Seat No",};

        JTable viewtable = new JTable();
        autotablerow.setColumnIdentifiers(viewcolumn);
        viewtable.setModel(autotablerow);

        viewtable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane viewsp = new JScrollPane(viewtable);
        viewsp.setBounds(20, 50, 750, 300);
        frame.add(viewsp);

        try {
            String sql = "Select ticketdetails.tno,customerdetails.customer_id,customerdetails.name,customerdetails.citizenshipno,customerdetails.gender,customerdetails.phone,customerdetails.nationality,customerdetails.address,ticketdetails.dateofjourney,ticketdetails.flightid,ticketdetails.seatno FROM customerdetails INNER join ticketdetails on customerdetails.customer_id=ticketdetails.cid";
            ResultSet rs = connect.display(sql);
            while (rs.next()) {
                autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11)});
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
                    sql = "Select ticketdetails.tno,customerdetails.customer_id,customerdetails.name,customerdetails.citizenshipno,customerdetails.gender,customerdetails.phone,customerdetails.nationality,customerdetails.address,ticketdetails.dateofjourney,ticketdetails.flightid,ticketdetails.seatno FROM customerdetails INNER join ticketdetails on customerdetails.customer_id=ticketdetails.cid WHERE `customer_id` LIKE '"
                            + Integer.parseInt(searchfield.getText().toString()) + "%'|| `phone` LIKE'"
                            + Integer.parseInt(searchfield.getText().toString()) + "%'";
                } else {
                    sql = "Select ticketdetails.tno,customerdetails.customer_id,customerdetails.name,customerdetails.citizenshipno,customerdetails.gender,customerdetails.phone,customerdetails.nationality,customerdetails.address,ticketdetails.dateofjourney,ticketdetails.flightid,ticketdetails.seatno FROM customerdetails INNER join ticketdetails on customerdetails.customer_id=ticketdetails.cid";
                }

                try {
                    ResultSet rs = connect.display(sql);
                    viewsp.repaint();
                    autotablerow.getDataVector().removeAllElements();

                    while (rs.next()) {
                        autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),
                            rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                            rs.getString(9), rs.getString(10), rs.getString(11)});
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        update.addActionListener(new ActionListener() {
            String cuid;

            public void actionPerformed(ActionEvent ae) {
                int[] row = viewtable.getSelectedRows();
                for (int i = 0; i < row.length; i++) {
                    cuid = (String) viewtable.getValueAt(row[i], 1);

                }
                new update_delete_customerdetails(cuid);
                frame.dispose();

            }
        });

        JButton cancel = new JButton("Cancel booking");
        cancel.setBounds(400, 360, 130, 40);
        frame.add(cancel);

        cancel.addActionListener(new ActionListener() {
            String ciddel;

            public void actionPerformed(ActionEvent ae) {
                int[] row = viewtable.getSelectedRows();
                for (int i = 0; i < row.length; i++) {
                    ciddel = (String) viewtable.getValueAt(row[i], 1);

                    String customersqldel = "DELETE FROM `customerdetails` where `customer_id`='" + ciddel + "'";
                    String ticketdel = "DELETE FROM `customerdetails` where `cid`='" + ciddel + "'";

                    connect.delete(customersqldel);

                    connect.appendwithmessage(customersqldel, "ticket cancelled");
                    viewtable.repaint();
                    autotablerow.getDataVector().removeAllElements();
                    String stringsql2 = "Select ticketdetails.tno,customerdetails.customer_id,customerdetails.name,customerdetails.citizenshipno,customerdetails.gender,customerdetails.phone,customerdetails.nationality,customerdetails.address,ticketdetails.dateofjourney,ticketdetails.flightid,ticketdetails.seatno FROM customerdetails INNER join ticketdetails on customerdetails.customer_id=ticketdetails.cid";
                    try {
                        ResultSet rs = connect.display(stringsql2);
                        viewsp.repaint();
                        autotablerow.getDataVector().removeAllElements();

                        while (rs.next()) {
                            autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                                rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)});
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

    }

}
