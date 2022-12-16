package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });

        tfNumber2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    compute();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    void compute() {
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        if(cbOperations.getSelectedItem() == "+") {
            lblResult.setText(String.format("%.1f", num1+num2));
        } else if(cbOperations.getSelectedItem() == "-") {
            lblResult.setText(String.format("%.1f", num1-num2));
        } else if(cbOperations.getSelectedItem() == "*") {
            lblResult.setText(String.format("%.1f", num1*num2));
        } else {
            lblResult.setText(String.format("%.1f", num1/num2));
        }
    }
}
