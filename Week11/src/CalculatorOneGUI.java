
/**
 *
 * @author Jarukrit
 */
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorOneGUI implements ActionListener {

    private final JFrame frame;
    private final JPanel buttonPanel;
    private final JTextField operatorField1, operatorField2, resultField;
    private final JButton plusButton, minusButton, multiplyButton, divideButton;

    public CalculatorOneGUI() {
        frame = new JFrame("เครื่องคิดเลข");
        frame.setLayout(new GridLayout(4, 1));

        operatorField1 = new JTextField();
        frame.add(operatorField1);
        operatorField2 = new JTextField();
        frame.add(operatorField2);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        plusButton = new JButton("บวก");
        plusButton.setFont(new Font("Angsana New", Font.BOLD, 18));
        plusButton.addActionListener(this);

        minusButton = new JButton("ลบ");
        minusButton.setFont(new Font("Angsana New", Font.BOLD, 18));
        minusButton.addActionListener(this);

        multiplyButton = new JButton("คูณ");
        multiplyButton.setFont(new Font("Angsana New", Font.BOLD, 18));
        multiplyButton.addActionListener(this);
        divideButton = new JButton("หาร");
        divideButton.setFont(new Font("Angsana New", Font.BOLD, 18));

        divideButton.addActionListener(this);
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        frame.add(buttonPanel);
        resultField = new JTextField();
        frame.add(resultField);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double oper1 = Double.parseDouble(operatorField1.getText());
            double oper2 = Double.parseDouble(operatorField2.getText());
            if (e.getSource().equals(plusButton)) {
                resultField.setText(removeTrailingZeros(oper1 + oper2));
            } else if (e.getSource().equals(minusButton)) {
                resultField.setText(removeTrailingZeros(oper1 - oper2));
            } else if (e.getSource().equals(multiplyButton)) {
                resultField.setText(removeTrailingZeros(oper1 * oper2));
            } else if (e.getSource().equals(divideButton)) {
                resultField.setText(removeTrailingZeros(oper1 / oper2));
            }

        } catch (NumberFormatException ignored) {
            resultField.setText("ERROR");
        }
    }

    private String removeTrailingZeros(double d) {
        if (d % 1.0 != 0) {
            return String.format("%s", d);
        } else {
            return String.format("%.0f", d);
        }
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
