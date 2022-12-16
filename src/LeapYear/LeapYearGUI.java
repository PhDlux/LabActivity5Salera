package LeapYear;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.swing.*;

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
}
