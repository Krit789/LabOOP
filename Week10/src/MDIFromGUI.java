
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jarukrit
 */
public class MDIFromGUI {

    private final JFrame frame;
    private JInternalFrame subWindow;
    private final JDesktopPane desktop;
    private final JMenuBar menuBar;
    private final JMenu fileMenu, editMenu, viewMenu, newSubMenu;
    private final JMenuItem openFileMenu, saveFileMenu, exitFileMenu;
    private final JMenuItem windowNewMenu, messageNewMenu;
    private int count = 0;

    public MDIFromGUI() {
        frame = new JFrame("SubMenuItem Demo");
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");

        newSubMenu = new JMenu("New");
        windowNewMenu = new JMenuItem("Window");
        windowNewMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spawnWindow(200, 400);
            }
        });
        messageNewMenu = new JMenuItem("Message");
        newSubMenu.add(windowNewMenu);
        newSubMenu.add(new JSeparator());
        newSubMenu.add(messageNewMenu);
        fileMenu.add(newSubMenu);

        openFileMenu = new JMenuItem("Open");
        saveFileMenu = new JMenuItem("Save");
        exitFileMenu = new JMenuItem("Exit");
        exitFileMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(openFileMenu);
        fileMenu.add(new JSeparator());
        fileMenu.add(saveFileMenu);
        fileMenu.add(new JSeparator());
        fileMenu.add(exitFileMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        frame.setJMenuBar(menuBar);

        desktop = new JDesktopPane();
        desktop.setBackground(Color.black);
        frame.add(desktop, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1280, 720);
        spawnWindow(100, 100);
        spawnWindow(400, 300);
        spawnWindow(750, 250);

    }

    private void spawnWindow(int x, int y) {
        subWindow = new JInternalFrame("Application " + count++, true, true, true, true);
        subWindow.setLocation(x, y);
        subWindow.setSize(320, 240);
        subWindow.setVisible(true);
        desktop.add(subWindow);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        new MDIFromGUI();
    }
}
