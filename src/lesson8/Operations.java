package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {
    private final JTextField textField;

    public Operations (JTextField textField) {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String value = textField.getText();
        String[] operator;
        if (value.contains("+")) {
            operator = value.split("\\+");
            double result = Double.parseDouble(operator[0]) + Double.parseDouble(operator[1]);
            textField.setText(String.valueOf(result));

        } else if (value.contains("-")) {
            operator = value.split("-");
            double result = Double.parseDouble(operator[0]) - Double.parseDouble(operator[1]);
            textField.setText(String.valueOf(String.format("%.2f",result)));

        } else if (value.contains("*")) {
            operator = value.split("\\*");
            double result = Double.parseDouble(operator[0]) * Double.parseDouble(operator[1]);
            textField.setText(String.valueOf(result));

        } else if (value.contains("/")) {
            operator = value.split("/");
            double result = Double.parseDouble(operator[0]) / Double.parseDouble(operator[1]);
            textField.setText(String.valueOf(result));

        } else if (value.contains("^")) {
            operator = value.split("\\^");
            double result = Math.pow(Double.parseDouble(operator[0]), Double.parseDouble(operator[1]));
            textField.setText(String.valueOf(result));
        }

    }
}
