
/**
 *
 * @author Jarukrit
 */
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorOneGUI {

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
        plusButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 18));
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double oper1 = Double.parseDouble(operatorField1.getText());
                    double oper2 = Double.parseDouble(operatorField2.getText());
                    resultField.setText(String.valueOf(oper1 + oper2));

                } catch (Exception ignored) {
                    resultField.setText("ERROR");
                }

            }
        });

        minusButton = new JButton("ลบ");
        minusButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 18));

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double oper1 = Double.parseDouble(operatorField1.getText());
                    double oper2 = Double.parseDouble(operatorField2.getText());
                    resultField.setText(String.valueOf(oper1 - oper2));

                } catch (Exception ignored) {
                    resultField.setText("ERROR");
                }

            }
        });

        multiplyButton = new JButton("คูณ");
        multiplyButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 18));
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double oper1 = Double.parseDouble(operatorField1.getText());
                    double oper2 = Double.parseDouble(operatorField2.getText());
                    resultField.setText(String.valueOf(oper1 * oper2));

                } catch (Exception ignored) {
                    resultField.setText("ERROR");
                }

            }
        });
        divideButton = new JButton("หาร");
        divideButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 18));

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double oper1 = Double.parseDouble(operatorField1.getText());
                    double oper2 = Double.parseDouble(operatorField2.getText());
                    resultField.setText(String.valueOf(oper1 / oper2));

                } catch (Exception ignored) {
                    resultField.setText("ERROR");
                }

            }
        });
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

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
