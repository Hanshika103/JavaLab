import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");

        // Create radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        // Set positions
        male.setBounds(100, 50, 100, 30);
        female.setBounds(100, 80, 100, 30);
        other.setBounds(100, 110, 100, 30);

        // Group radio buttons (IMPORTANT)
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        // Button to show selected option
        JButton btn = new JButton("Submit");
        btn.setBounds(100, 150, 100, 30);

        // Label to display result
        JLabel label = new JLabel();
        label.setBounds(100, 200, 200, 30);

        // Action listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    label.setText("Selected: Male");
                } else if (female.isSelected()) {
                    label.setText("Selected: Female");
                } else if (other.isSelected()) {
                    label.setText("Selected: Other");
                } else {
                    label.setText("No option selected");
                }
            }
        });

        // Add components to frame
        frame.add(male);
        frame.add(female);
        frame.add(other);
        frame.add(btn);
        frame.add(label);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}