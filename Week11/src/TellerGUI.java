
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Jarukrit
 */
public class TellerGUI implements ActionListener {

    private final JFrame frame;
    private final JPanel subPanel1, subPanel2, subPanel3, subPanel4;
    private final JLabel balanceLabel, amountLabel;
    private final JTextField balanceField, amountField;
    private final JButton depositButton, withdrawButton, exitButton;
    private final Account account = new Account(6000, "");

    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(4, 1));

        subPanel1 = new JPanel();
        subPanel1.setLayout(new GridLayout(1, 2));
        balanceLabel = new JLabel("Balance");
        balanceLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        balanceField = new JTextField(removeTrailingZeros(account.getBalance()));
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
        depositButton.addActionListener(this);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(depositButton)) {
            if (account.deposit(Double.parseDouble(amountField.getText()))) {
                balanceField.setText(removeTrailingZeros(account.getBalance()));
                amountField.setText("");
            }

        } else if (e.getSource().equals(withdrawButton)) {
            if (account.withdraw(Double.parseDouble(amountField.getText()))) {
                balanceField.setText(removeTrailingZeros(account.getBalance()));
                amountField.setText("");
            }
        } else if (e.getSource().equals(exitButton)) {
            System.exit(0);
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
        new TellerGUI();
    }
}
