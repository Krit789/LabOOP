
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
        plusButton.setFont(new Font("Angsana New", Font.BOLD, 18));

        minusButton = new JButton("ลบ");
        minusButton.setFont(new Font("Angsana New", Font.BOLD, 18));

        multiplyButton = new JButton("คูณ");
        multiplyButton.setFont(new Font("Angsana New", Font.BOLD, 18));
        divideButton = new JButton("หาร");
        divideButton.setFont(new Font("Angsana New", Font.BOLD, 18));
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
