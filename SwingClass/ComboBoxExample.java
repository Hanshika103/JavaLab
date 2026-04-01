import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");

        // Items for combo box
        String countries[] = {"India", "USA", "UK", "Canada", "Australia"};

        // Create JComboBox
        JComboBox<String> cb = new JComboBox<>(countries);
        cb.setBounds(100, 50, 150, 30);

        // Button to show selected item
        JButton btn = new JButton("Show");
        btn.setBounds(100, 100, 100, 30);

        // Label to display result
        JLabel label = new JLabel();
        label.setBounds(100, 150, 200, 30);

        // Action Listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) cb.getSelectedItem();
                label.setText("Selected: " + selected);
            }
        });

        // Add components
        frame.add(cb);
        frame.add(btn);
        frame.add(label);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
