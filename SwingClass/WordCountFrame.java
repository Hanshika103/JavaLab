import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

/*
 * WORD COUNT FRAME
 * This class calculates:
 * - Total characters
 * - Total words
 */

public class WordCountFrame {

    JFrame frame;
    JTextArea textarea;
    JButton button;
    JLabel label;

    public WordCountFrame() {

        frame = new JFrame("Word Count");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Area
        textarea = new JTextArea();
        textarea.setBounds(40, 40, 300, 150);
        textarea.setBackground(Color.gray);
        textarea.setForeground(Color.blue);
        frame.add(textarea);

        // Label
        label = new JLabel("");
        label.setBounds(40, 10, 300, 20);
        frame.add(label);

        // Button
        button = new JButton("Word Count");
        button.setBounds(120, 220, 150, 30);
        frame.add(button);

        // Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String text = textarea.getText();

                // Split words using space
                String words[] = text.trim().split("\\s+");

                int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

                label.setText("Chars: " + text.length() + " Words: " + wordCount);
            }
        });

        frame.setVisible(true);
    }
}
