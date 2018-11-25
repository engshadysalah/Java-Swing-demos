/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBox;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rm
 */
// programe 2
public class programe2_Action extends JFrame {

    public programe2_Action() {

        try {

            method();

        } catch (Exception xp) {

            System.out.print("The Error is : " + xp);

        }

    }

    private JCheckBox b1;
    private JCheckBox b2;
    private JCheckBox b3;

    private JCheckBox b4;
    private JCheckBox b5;

    private JTextField f1;
    private JTextField f2;
    private JTextField f3;
    private JTextField f4;

    private void method() {

        Inner_Class inn = new Inner_Class();

        JPanel p = new JPanel();
        add(p);

        b1 = new JCheckBox("CheckBox : 1");
        p.add(b1);
        b2 = new JCheckBox("CheckBox : 2");
        p.add(b2);
        b3 = new JCheckBox("CheckBox : 3");
        p.add(b3);

        b4 = new JCheckBox("CheckBox : 3");
        p.add(b4);

        b5 = new JCheckBox("CheckBox : 3");
        p.add(b5);

        f1 = new JTextField();
        p.add(f1);

        f2 = new JTextField();
        p.add(f2);

        f3 = new JTextField();
        p.add(f3);

        f4 = new JTextField();
        p.add(f4);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 400);
        p.setLayout(null);
        p.setBackground(Color.red);

        b1.setBounds(10, 100, 100, 50);
        b1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (b1.isSelected()) {

                    f1.setText("Yes");
                } else {
                    f1.setText("No");
                }
            }
        });
        

        b2.setBounds(new Rectangle(10, 180, 100, 50));
        b2.addItemListener(inn);

        b3.setBounds(10, 250, 100, 50);
        b3.addItemListener(inn);

        b4.setBounds(250, 100, 100, 50);
        b4.addItemListener(inn);

        b5.setBounds(250, 180, 100, 50);
        b5.addItemListener(inn);

        f1.setBounds(120, 100, 100, 50);
        f2.setBounds(120, 180, 100, 50);
        f3.setBounds(120, 250, 100, 50);

        f4.setBounds(100, 320, 150, 50);
        f4.setBackground(Color.yellow);
        f4.setFont(new Font("Arial", Font.BOLD, 15));

    }

    //ItemListener : بيكون مع مربع الاختيارات
    private class Inner_Class implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {

//            if (b1.isSelected()) {
//
//                f1.setText("Yes");
//            } else {
//                f1.setText("No");
//            }

            /////////////////////////////////         
            if (b2.isSelected()) {

                f2.setText("Yes");
            } else {
                f2.setText("No");
            }

            ///////////////////////////////////            
            if (b3.isSelected()) {

                f3.setText("Yes");
            } else {
                f3.setText("No");
            }

            if (b4.isSelected() && b5.isSelected()) {

                f4.setFont(new Font("serif", Font.ITALIC + Font.BOLD, 30));
            } else if (b4.isSelected()) {

                f4.setFont(new Font("serif", Font.BOLD, 30));
            } else if (b5.isSelected()) {

                f4.setFont(new Font("serif", Font.ITALIC, 30));
            } else {
                f4.setFont(new Font("serif", Font.PLAIN, 30));
            }

        }

    }

}
