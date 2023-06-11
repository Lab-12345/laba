import java.awt.*;
import java.awt.event.*;

public class PushButtons {

    public static void main(String[] args) {
        // Create a frame.
        Frame frame = new Frame("PushButtons");

        // Create two buttons.
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        // Add the buttons to the frame.
        frame.add(button1);
        frame.add(button2);

        // Add a listener to the buttons.
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message when button 1 is clicked.
                System.out.println("Button 1 clicked!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message when button 2 is clicked.
                System.out.println("Button 2 clicked!");
            }
        });

        // Set the frame size and make it visible.
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
