
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

    private final JFrame frame;
    private final JPanel subPanel1, subPanel2, subPanel3, subPanel4;
    private final JLabel balanceLabel, amountLabel;
    private final JTextField balanceField, amountField;
    private final JButton depositButton, withdrawButton, exitButton;
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
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");
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
