
/**
 *
 * @author Jarukrit
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.border.EmptyBorder;

public class StudentView extends WindowAdapter implements ActionListener {

    private Student student;
    private final JFrame frame;
    private final JPanel panel, buttonPanel;
    private final JLabel idLabel, nameLabel, moneyLabel;
    private final JTextField idField, nameField, moneyField;
    private final JButton depositButton, withdrawButton;

    public StudentView() {
        frame = new JFrame();
        panel = new JPanel();
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        student = readDat(new File("StudentM.dat"));
        panel.setLayout(new GridLayout(3, 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        idLabel = new JLabel("ID :");
        nameLabel = new JLabel("Name :");
        moneyLabel = new JLabel("Money :");

        idField = new JTextField(String.valueOf(student.getID()));
        nameField = new JTextField(String.valueOf(student.getName()));
        moneyField = new JTextField(String.valueOf(student.getMoney()));
        moneyField.setEditable(false);

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);
        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(moneyLabel);
        panel.add(moneyField);
        panel.setBorder(new EmptyBorder(0,5,0,5));
        
        frame.add(panel, BorderLayout.CENTER);
        
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.addWindowListener(this);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(depositButton)) {
            moneyField.setText((Integer.parseInt(moneyField.getText()) + 100) + "");
        } else if (e.getSource().equals(withdrawButton)) {
            moneyField.setText((Integer.parseInt(moneyField.getText()) - 100) + "");

        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        student.setID(Integer.parseInt(idField.getText()));
        student.setName(nameField.getText());
        student.setMoney(Integer.parseInt(moneyField.getText()));

        File data = new File("StudentM.dat");

        try (FileOutputStream fOut = new FileOutputStream("StudentM.dat")) {
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(student);
            oOut.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private Student readDat(File data) {
        if (!data.exists()) {
            return new Student();
        }
        try (FileInputStream fIn = new FileInputStream("StudentM.dat")) {
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            Student s = (Student) oIn.readObject();
            oIn.close();
            return s;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return new Student();

    }

    public static void main(String[] args) {
        new StudentView();
    }
}
