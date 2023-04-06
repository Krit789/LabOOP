
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jarukrit
 */
public class CalculatorTwoGUI {

    private final JFrame frame;
    private final JPanel keysPanel;
    private final JTextField displayField;
    private final JButton zeroButton, oneButton, twoButton, threeButton, fourButton,
            fiveButton, sixButton, sevenButton, eightButton, nineButton, clearButton,
            equalButton, divideButton, multiplyButton, minusButton, plusButton;
    private double buffer = 0, result;
    private int action = -1;

    public CalculatorTwoGUI() {
        frame = new JFrame("My Calculator");
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        frame.add(displayField, BorderLayout.NORTH);

        keysPanel = new JPanel();
        keysPanel.setLayout(new GridLayout(4, 4));

        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        equalButton = new JButton("=");
        divideButton = new JButton("/");
        multiplyButton = new JButton("x");
        minusButton = new JButton("-");
        plusButton = new JButton("+");
        clearButton = new JButton("c");

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

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
