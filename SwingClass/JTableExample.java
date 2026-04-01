import javax.swing.*;
import java.awt.event.*;

public class JTableExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JTable Functional Example");

        // Column Names
        String columns[] = {"ID", "Name", "Course"};

        // Data
        String data[][] = {
            {"1", "Aman", "BCA"},
            {"2", "Riya", "BBA"},
            {"3", "Rahul", "MCA"},
            {"4", "Sneha", "MBA"}
        };

        // JTable
        JTable table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 30, 300, 120);

        // Button
        JButton btn = new JButton("Show Selected Row");
        btn.setBounds(30, 170, 180, 30);

        // Label
        JLabel label = new JLabel("Selected Row Data:");
        label.setBounds(30, 220, 300, 30);

        // Button Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();

                if (row != -1) {
                    String id = (String) table.getValueAt(row, 0);
                    String name = (String) table.getValueAt(row, 1);
                    String course = (String) table.getValueAt(row, 2);

                    label.setText("ID: " + id + ", Name: " + name + ", Course: " + course);
                } else {
                    label.setText("Please select a row first!");
                }
            }
        });

        // Add components
        frame.add(sp);
        frame.add(btn);
        frame.add(label);

        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}