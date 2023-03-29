
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jarukrit
 */
public class CalculatorTwoGUI {

    private JFrame frame;
    private JPanel keysPanel;
    private JTextField displayField;
    private JButton zeroButton, oneButton, twoButton, threeButton, fourButton,
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
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "0");
            }
        });
        oneButton = new JButton("1");
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "1");
            }
        });
        twoButton = new JButton("2");
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "2");
            }
        });
        threeButton = new JButton("3");
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "3");
            }
        });
        fourButton = new JButton("4");
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "4");
            }
        });
        fiveButton = new JButton("5");
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "5");
            }
        });
        sixButton = new JButton("6");
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "6");
            }
        });
        sevenButton = new JButton("7");
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "7");
            }
        });
        eightButton = new JButton("8");
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "8");
            }
        });
        nineButton = new JButton("9");
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(displayField.getText() + "9");
            }
        });
        equalButton = new JButton("=");
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == -1) {
                    buffer = Double.parseDouble(displayField.getText());
                } else {
                    processCurrent(displayField.getText(), action);
                }
                action = -1;
                displayField.setText(buffer + "");

            }
        });
        divideButton = new JButton("/");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == -1) {
                    buffer = Double.parseDouble(displayField.getText());
                } else {
                    processCurrent(displayField.getText(), action);

                }
                action = 4;
                displayField.setText("");
            }
        });
        multiplyButton = new JButton("x");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == -1) {
                    buffer = Double.parseDouble(displayField.getText());
                } else {
                    processCurrent(displayField.getText(), action);

                }
                action = 3;
                displayField.setText("");
            }
        });
        minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == -1) {
                    buffer = Double.parseDouble(displayField.getText());
                } else {
                    processCurrent(displayField.getText(), action);

                }
                action = 2;
                displayField.setText("");
            }
        });
        plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == -1) {
                    buffer = Double.parseDouble(displayField.getText());
                } else {
                    processCurrent(displayField.getText(), action);

                }
                action = 1;
                displayField.setText("");
            }
        });
        clearButton = new JButton("c");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer = 0;
                result = 0;
                action = -1;
                displayField.setText("");
            }
        });

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

    private void processCurrent(String number, int action) {
        try {
            switch (action) {
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
            System.out.println("processCurrent had a unexpected exception");
        }
    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
