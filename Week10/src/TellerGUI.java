
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Jarukrit
 */
public class TellerGUI {

    private JFrame frame;
    private JPanel subPanel1, subPanel2, subPanel3, subPanel4;
    private JLabel balanceLabel, amountLabel;
    private JTextField balanceField, amountField;
    private JButton depositButton, withdrawButton, exitButton;
    private int balance = 6000;

    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(4, 1));

        subPanel1 = new JPanel();
        subPanel1.setLayout(new GridLayout(1, 2));
        balanceLabel = new JLabel("Balance");
        balanceLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        balanceField = new JTextField(balance + "");
        balanceField.setEditable(false);
        subPanel1.add(balanceLabel);
        subPanel1.add(balanceField);

        subPanel2 = new JPanel();
        subPanel2.setLayout(new GridLayout(1, 2));
        amountLabel = new JLabel("Balance");
        amountLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        amountField = new JTextField();
        subPanel2.add(amountLabel);
        subPanel2.add(amountField);

        subPanel3 = new JPanel();
        subPanel3.setLayout(new FlowLayout());
        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    balance += Integer.parseInt(amountField.getText());
                    balanceField.setText(balance + "");
                    amountField.setText("");
                } catch (Exception ignored) {
                }

            }
        });
        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    balance -= Integer.parseInt(amountField.getText());
                    balanceField.setText(balance + "");
                    amountField.setText("");
                } catch (Exception ignored) {
                }

            }
        });
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        subPanel3.add(depositButton);
        subPanel3.add(withdrawButton);
        subPanel3.add(exitButton);

        subPanel4 = new JPanel();

        frame.add(subPanel1);
        frame.add(subPanel2);
        frame.add(subPanel3);
        frame.add(subPanel4);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
