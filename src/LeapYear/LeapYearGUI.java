package LeapYear;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLeapYear();
            }
        });

        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    isLeapYear();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    void isLeapYear() {
        int year = Integer.parseInt(tfYear.getText());
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                JOptionPane.showMessageDialog(pnlMain, "Leap year");
            } else {
                JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
            }
        } else if(year % 4 == 0) {
            JOptionPane.showMessageDialog(pnlMain, "Leap year");
        } else {
            JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
        }
    }
}
