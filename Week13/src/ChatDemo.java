
/**
 *
 * @author Jarukrit
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ChatDemo extends WindowAdapter implements ActionListener {

    private final JFrame frame;
    private final JTextArea textArea;
    private final JTextField inputField;
    private final JButton submitButton, resetButton;
    private final JPanel buttonPanel, southPanel;
    private String myDat;

    public ChatDemo() {
        frame = new JFrame("ChatDemo");
        frame.setLayout(new BorderLayout());

        myDat = readDAT(new File("ChatDemo.dat"));

        textArea = new JTextArea(myDat);
        textArea.setColumns(45);
        textArea.setRows(20);
        textArea.setEditable(false);
        textArea.setFont(new Font("Angsana New", Font.PLAIN, 20));
        inputField = new JTextField();
        inputField.setColumns(45);
        inputField.setFont(new Font("Angsana New", Font.PLAIN, 20));

        southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 1));

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);

        southPanel.add(inputField);
        southPanel.add(buttonPanel);

        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);
        frame.add(textArea, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setMinimumSize(frame.getSize());

        frame.setVisible(true);
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submitButton)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            if (!textArea.getText().equals("")) {
                textArea.setText(textArea.getText() + "\n");
            }
            textArea.setText(String.format("%s%s : %s", textArea.getText(), dtf.format(LocalDateTime.now()), inputField.getText()));
            inputField.setText("");
        } else if (e.getSource().equals(resetButton)) {
            textArea.setText("");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        File data = new File("ChatDemo.dat");
        try {
            if (!data.exists()) {
                data.createNewFile();
            }

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        try (FileWriter f = new FileWriter(data);) {
            f.write(textArea.getText());
        } catch (IOException ioex) {
            System.out.println(ioex);

        }

    }

    public static String readDAT(File data) {
        if (!data.exists()) {
            return "";
        }

        try (FileReader r = new FileReader(data)) {
            String dataRead = new String("");
            int myChar;
            while ((myChar = r.read()) != -1) {
                dataRead = dataRead + (char) myChar;
            }
            return dataRead;

        } catch (IOException e) {
            System.out.println(e);
        }
        return "";
    }

    public static void main(String[] args) {
        new ChatDemo();
    }

}
