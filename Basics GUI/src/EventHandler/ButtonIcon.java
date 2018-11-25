/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */
//number 3
public class ButtonIcon extends JFrame {

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JPanel p;
    private JTextField f1;
    private JTextField f2;

    public ButtonIcon() {

        InnerClass in = new InnerClass();

        p = new JPanel();
        add(p);

        b1 = new JButton("OPen");
        p.add(b1);

        b2 = new JButton("Go");
        p.add(b2);

        b3 = new JButton("Clear");
        p.add(b3);

        ImageIcon img1 = new ImageIcon(getClass().getResource("281037026.jpg"));

        Icon img2 = new ImageIcon(getClass().getResource("301013214.jpg"));

        Icon img3 = new ImageIcon(getClass().getResource("321028232.jpg"));

        Icon img4 = new ImageIcon(getClass().getResource("461017540.jpg"));

        f1 = new JTextField();
        p.add(f1);

        f2 = new JTextField();
        p.add(f2);

        this.setVisible(true);
        this.setTitle("event");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 300, 250);
        p.setLayout(null);
        p.setBackground(Color.yellow);

        b1.setBounds(50, 100, 100, 50);
        b1.setIcon(img1);
        b1.setRolloverIcon(img2);
        b1.addActionListener(in);

        b2.setBounds(250, 100, 100, 50);
        b2.setIcon(img3);
        b2.setRolloverIcon(img4);
        b2.addActionListener(in);

        b3.setBounds(250, 20, 100, 50);
        b3.addActionListener(in);

        f1.setBounds(50, 200, 100, 50);
        f1.addActionListener(in);

        f2.setBounds(250, 200, 100, 50);

    }

    //InnerClass :هو كلاس مساعد للكلاس الريسي
    private class InnerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {

                f2.setText(f1.getText());
                p.setBackground(Color.blue);
                JOptionPane.showMessageDialog(null, "the result " + f1.getText());

            } else if (e.getSource() == b2) {

                f1.setText(f2.getText());
                p.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "the result " + f1.getText());

            } else if (e.getSource() == f1) {

                f2.setText(f1.getText());
                p.setBackground(Color.black);

            } else if (e.getSource() == b3) {

                f1.setText("");
                f2.setText("");
                JOptionPane.showMessageDialog(null, "Clear Successful");

            }

        }

    }

}
