import javax.swing.*;
import java.awt.event.*;

/*
 * CHECKBOX FRAME
 * This class demonstrates:
 * - JCheckBox
 * - Total selection
 * - JOptionPane popup
 */

public class CheckboxFrame {

    JFrame frame;
    JCheckBox c1, c2, c3;
    JButton button;

    public CheckboxFrame() {

        frame = new JFrame("Checkbox Example");
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Checkboxes
        c1 = new JCheckBox("Java");
        c1.setBounds(50, 50, 100, 30);

        c2 = new JCheckBox("Python");
        c2.setBounds(50, 90, 100, 30);

        c3 = new JCheckBox("C++");
        c3.setBounds(50, 130, 100, 30);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

        // Button
        button = new JButton("Submit");
        button.setBounds(50, 180, 100, 30);
        frame.add(button);

        // Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String msg = "Selected: ";

                if (c1.isSelected()) msg += "Java ";
                if (c2.isSelected()) msg += "Python ";
                if (c3.isSelected()) msg += "C++ ";

                // Popup Message
                JOptionPane.showMessageDialog(frame, msg);
            }
        });

        frame.setVisible(true);
    }
}
