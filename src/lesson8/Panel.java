package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private final Font font = new Font("SanSerif", Font.BOLD,20);
    private final Font font2 = new Font("SanSerif", Font.PLAIN,20);
    private JTextField output;
    public Panel() {
        Components();
        setLayout(new BorderLayout());
        add(initTop(),BorderLayout.NORTH);
        add(initNext(),BorderLayout.CENTER);
    }

    private void Components () {
        output = new JTextField();
    }

    private JPanel initNext () {
        JPanel nex = new JPanel();
        JButton[] next = new JButton [20];
        nex.setLayout(new GridLayout(7,3));
        ActionListener listener = new Listener(output);
        for (int i = 1; i < 10; i++) {
            next[i] = new JButton("" + i);
            next[i].setFont(font);
            next[i].addActionListener(listener);
            nex.add(next[i]);
        }
        next[11] = new JButton("=");
        next[11].addActionListener(new Operations(output));
        next[11].setFont(font);
        nex.add(next[11]);

        next[0] = new JButton("0");
        next[0].setFont(font);
        next[0].addActionListener(listener);
        nex.add(next[0]);

        next[12] = new JButton("C");
        next[12].addActionListener(e -> output.setText(""));
        next[12].setFont(font);
        nex.add(next[12]);

        next[13] = new JButton("+");
        next[13].setFont(font);
        next[13].addActionListener(listener);
        nex.add(next[13]);

        next[14] = new JButton("-");
        next[14].setFont(font);
        next[14].addActionListener(listener);
        nex.add(next[14]);

        next[15] = new JButton("*");
        next[15].setFont(font);
        next[15].addActionListener(listener);
        nex.add(next[15]);

        next[16] = new JButton("/");
        next[16].setFont(font);
        next[16].addActionListener(listener);
        nex.add(next[16]);

        next[17] = new JButton(".");
        next[17].setFont(font);
        next[17].addActionListener(listener);
        nex.add(next[17]);

        next[18] = new JButton("√");
        next[18].addActionListener(e -> {
            String value = output.getText();
            String[] operator = value.split("√");
            double result = Double.parseDouble((operator[0]));
            output.setText(String.valueOf(Math.sqrt(result)));
        });
        next[18].setFont(font);
        next[18].addActionListener(listener);
        nex.add(next[18]);

        next[19] = new JButton("^");
        next[19].setFont(font);
        next[19].addActionListener(listener);
        nex.add(next[19]);

        return nex;
    }

    private JPanel initTop () {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        output = new JTextField();
        output.setEditable(false);
        output.setPreferredSize(new Dimension(0,60));
        output.setFont(font2);
        top.add(output,BorderLayout.CENTER);
        return top;
    }
}
