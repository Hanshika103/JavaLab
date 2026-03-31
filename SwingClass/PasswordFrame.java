import javax.swing.*;
import java.awt.event.*;

/*
 * PASSWORD FRAME
 * This class demonstrates:
 * - JPasswordField
 * - Button click event
 */

public class PasswordFrame {

    JFrame frame;
    JPasswordField passwordField;
    JButton button;
    JLabel label;

    public PasswordFrame() {

        frame = new JFrame("Password Example");
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBounds(50, 30, 150, 30);
        frame.add(passwordField);

        // Button
        button = new JButton("Show Password");
        button.setBounds(50, 70, 150, 30);
        frame.add(button);

        // Label
        label = new JLabel();
        label.setBounds(50, 110, 200, 30);
        frame.add(label);

        // Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Convert char[] to String
                String pass = new String(passwordField.getPassword());
                label.setText("Password: " + pass);
            }
        });

        frame.setVisible(true);
    }
}
