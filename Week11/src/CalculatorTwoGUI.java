
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jarukrit
 */
public class CalculatorTwoGUI implements ActionListener {

    private final JFrame frame;
    private final JPanel keysPanel;
    private final JTextField displayField;
    private final JButton zeroButton, oneButton, twoButton, threeButton, fourButton,
            fiveButton, sixButton, sevenButton, eightButton, nineButton, clearButton,
            equalButton, divideButton, multiplyButton, minusButton, plusButton;
    private double buffer = 0;
    private int action = -1;

    public CalculatorTwoGUI() {
        frame = new JFrame("My Calculator");
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        frame.add(displayField, BorderLayout.NORTH);

        keysPanel = new JPanel();
        keysPanel.setLayout(new GridLayout(4, 4));

        zeroButton = new JButton("0");
        zeroButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.addActionListener(this);

        sevenButton = new JButton("7");
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.addActionListener(this);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);

        multiplyButton = new JButton("x");
        multiplyButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.addActionListener(this);

        clearButton = new JButton("c");
        clearButton.addActionListener(this);

        keysPanel.add(sevenButton);
        keysPanel.add(eightButton);
        keysPanel.add(nineButton);
        keysPanel.add(plusButton);
        keysPanel.add(fourButton);
        keysPanel.add(fiveButton);
        keysPanel.add(sixButton);
        keysPanel.add(minusButton);
        keysPanel.add(oneButton);
        keysPanel.add(twoButton);
        keysPanel.add(threeButton);
        keysPanel.add(multiplyButton);
        keysPanel.add(zeroButton);
        keysPanel.add(clearButton);
        keysPanel.add(equalButton);
        keysPanel.add(divideButton);

        frame.add(keysPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(zeroButton)) {
            displayField.setText(displayField.getText() + "0");
        } else if (e.getSource().equals(oneButton)) {
            displayField.setText(displayField.getText() + "1");
        } else if (e.getSource().equals(twoButton)) {
            displayField.setText(displayField.getText() + "2");
        } else if (e.getSource().equals(threeButton)) {
            displayField.setText(displayField.getText() + "3");
        } else if (e.getSource().equals(fourButton)) {
            displayField.setText(displayField.getText() + "4");
        } else if (e.getSource().equals(fiveButton)) {
            displayField.setText(displayField.getText() + "5");
        } else if (e.getSource().equals(sixButton)) {
            displayField.setText(displayField.getText() + "6");
        } else if (e.getSource().equals(sevenButton)) {
            displayField.setText(displayField.getText() + "7");
        } else if (e.getSource().equals(eightButton)) {
            displayField.setText(displayField.getText() + "8");
        } else if (e.getSource().equals(nineButton)) {
            displayField.setText(displayField.getText() + "9");
        } else if (e.getSource().equals(zeroButton)) {
            displayField.setText(displayField.getText() + "0");
        } else if (e.getSource().equals(clearButton)) {
            buffer = 0;
            action = -1;
            displayField.setText("");
        } else if (e.getSource().equals(plusButton)) {
            processCurrent(displayField.getText(), action);
            action = 1;
        } else if (e.getSource().equals(minusButton)) {
            processCurrent(displayField.getText(), action);
            action = 2;
        } else if (e.getSource().equals(multiplyButton)) {
            processCurrent(displayField.getText(), action);
            action = 3;
        } else if (e.getSource().equals(divideButton)) {
            processCurrent(displayField.getText(), action);
            action = 4;
        } else if (e.getSource().equals(equalButton)) {
            processCurrent(displayField.getText(), action);
            action = -1;
            displayField.setText(removeTrailingZeros(buffer));
        }
    }

    private void processCurrent(String number, int action) {
        try {
            switch (action) {
                case -1:
                    buffer = Double.parseDouble(displayField.getText());
                    displayField.setText("");
                    break;
                case 1:
                    buffer += Double.parseDouble(number);
                    break;
                case 2:
                    buffer -= Double.parseDouble(number);
                    break;
                case 3:
                    buffer *= Double.parseDouble(number);
                    break;
                case 4:
                    buffer /= Double.parseDouble(number);
                    break;
            }

        } catch (Exception ignored) {
            displayField.setText("processCurrent had a unexpected exception");
            System.out.println("processCurrent had a unexpected exception");
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
        new CalculatorTwoGUI();
    }
}
