
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ViewUser {

    Connect connect = new Connect();

    ViewUser() {
        JFrame frame = new JFrame("View User");
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.GRAY);
        jp.setBounds(0, 0, 800, 500);
        frame.add(jp);

        // adding the name in the panel.
        JLabel lbl = new JLabel("Search");
        lbl.setBounds(10, 10, 80, 30);
        jp.add(lbl);
        JTextField text = new JTextField();
        text.setBounds(120, 10, 100, 30);
        jp.add(text);

        ///
        DefaultTableModel autotablerow = new DefaultTableModel();
        String[] viewcolumn = {"empid", "First Name", "Last Name", "Gender", "Phone No", "Email", "D.O.B", "Address", "Username", "usertype"};

        JTable viewtable = new JTable();
        autotablerow.setColumnIdentifiers(viewcolumn);
        viewtable.setModel(autotablerow);

        viewtable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane viewsp = new JScrollPane(viewtable);
        viewsp.setBounds(20, 50, 750, 300);
        jp.add(viewsp);

        try {
            String sql = "Select employee.empid,employee.first_name,employee.last_name,employee.gender,employee.phone,employee.email,employee.date_of_birth,employee.address,adminanduser.userid,adminanduser.usertype FROM employee INNER join adminanduser on employee.empid=adminanduser.empide";
            ResultSet rs = connect.display(sql);
            while (rs.next()) {
                autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10)});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        ///
        text.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ef) {
                String sql;
                if (text.getText().length() != 0) {
                    sql = "Select employee.empid,employee.first_name,employee.last_name,employee.gender,employee.phone,employee.email,employee.date_of_birth,employee.address,adminanduser.userid,adminanduser.usertype FROM employee INNER join adminanduser on employee.empid=adminanduser.empide WHERE `empid` LIKE '"
                            + Integer.parseInt(text.getText()) + "%'|| `phone` LIKE'"
                            + Integer.parseInt(text.getText()) + "%'";
                } else {
                    sql = "Select employee.empid,employee.first_name,employee.last_name,employee.gender,employee.phone,employee.email,employee.date_of_birth,employee.address,adminanduser.userid,adminanduser.usertype FROM employee INNER join adminanduser on employee.empid=adminanduser.empide";
                }

                try {
                    ResultSet rs = connect.display(sql);
                    viewsp.repaint();
                    autotablerow.getDataVector().removeAllElements();

                    while (rs.next()) {
                        autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                            rs.getString(10)});
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton btn3 = new JButton("Delete");
        btn3.setBounds(250, 400, 100, 40);
        jp.add(btn3);

        ////////////////////////////////////////
        btn3.addActionListener(new ActionListener() {
            String employeeid;

            public void actionPerformed(ActionEvent ae) {
                int[] row = viewtable.getSelectedRows();
                for (int i = 0; i < row.length; i++) {
                    employeeid = (String) viewtable.getValueAt(row[i], 0);

                    String employeesqldel = "DELETE FROM `employee` where `empid`='" + employeeid + "'";
                    String adminandusersqldel = "DELETE FROM `adminanduser` where `empide`='" + employeeid + "'";

                    connect.delete(employeesqldel);

                    connect.appendwithmessage(adminandusersqldel, "details deleted successfully");
                    viewtable.repaint();
                    autotablerow.getDataVector().removeAllElements();
                    String stringsql2 = "Select employee.empid,employee.first_name,employee.last_name,employee.gender,employee.phone,employee.email,employee.date_of_birth,employee.address,adminanduser.userid,adminanduser.usertype FROM employee INNER join adminanduser on employee.empid=adminanduser.empide";
                    try {
                        ResultSet rs = connect.display(stringsql2);
                        viewsp.repaint();
                        autotablerow.getDataVector().removeAllElements();

                        while (rs.next()) {
                            autotablerow.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                                rs.getString(9), rs.getString(10)});
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        //////////////////////////////////////////
        JButton btn4 = new JButton("Update");
        btn4.setBounds(400, 400, 100, 40);
        jp.add(btn4);

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String employeeid = null;
                int[] row = viewtable.getSelectedRows();
                for (int i = 0; i < row.length; i++) {
                    employeeid = (String) viewtable.getValueAt(row[i], 0);

                }

                new ViewUser1(employeeid);
                frame.dispose();

            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ViewUser();
            }
        });
    }
}
