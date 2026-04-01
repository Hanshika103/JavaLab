import javax.swing.*;          // For Swing components
import java.awt.event.*;       // For event handling

public class JListExample {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("JList Example");

        // Array of items to display in JList
        String items[] = {"Java", "Python", "C++", "JavaScript", "HTML"};

        // Create JList with items
        JList<String> list = new JList<>(items);

        // Set position and size (x, y, width, height)
        list.setBounds(30, 30, 120, 100);

        // Allow only single item selection
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add JList inside JScrollPane for scrolling
        JScrollPane sp = new JScrollPane(list);
        sp.setBounds(30, 30, 120, 100);

        // Create Button
        JButton btn = new JButton("Show Selected");
        btn.setBounds(30, 150, 150, 30);

        // Create Label to display result
        JLabel label = new JLabel("Selected Item:");
        label.setBounds(30, 200, 250, 30);

        // Add action listener to button
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Get selected item from JList
                String selected = list.getSelectedValue();

                // Check if any item is selected
                if (selected != null) {
                    label.setText("Selected: " + selected);
                } else {
                    label.setText("Please select an item!");
                }
            }
        });

        // Add all components to frame
        frame.add(sp);
        frame.add(btn);
        frame.add(label);

        // Frame settings
        frame.setSize(300, 300);                  // Set frame size
        frame.setLayout(null);                    // Use absolute layout
        frame.setVisible(true);                   // Make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
    }
}
