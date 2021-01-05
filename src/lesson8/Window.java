package lesson8;

import javax.swing.*;

public class Window extends JFrame {
    public Window () {
        setTitle("Calculator");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        add(new Panel());
        setVisible(true);
    }
}
