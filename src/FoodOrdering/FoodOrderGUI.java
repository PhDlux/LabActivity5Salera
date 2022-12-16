package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700,700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });

    }

    void order() {
        int sum = 0;
        double result = 0;
        if(cPizza.isSelected()) {
            sum+=100;
        }
        if(cBurger.isSelected()) {
            sum+=80;
        }
        if(cFries.isSelected()) {
            sum+=65;
        }
        if(cSoftDrinks.isSelected()) {
            sum+=55;
        }
        if(cTea.isSelected()) {
            sum+=50;
        }
        if(cSundae.isSelected()) {
            sum+=40;
        }

        if(rb5.isSelected()) {
            result = sum - (sum * 0.05);
        } else if(rb10.isSelected()) {
            result = sum - (sum * 0.10);
        } else if(rb15.isSelected()) {
            result = sum - (sum * 0.15);
        } else {
            result = sum;
        }

        JOptionPane.showMessageDialog(pnlMain, String.format("The total price is Php %.2f", result));
    }
}
