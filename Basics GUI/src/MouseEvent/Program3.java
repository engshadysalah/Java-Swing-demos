/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class Program3 extends JFrame {

    //Make Relation Between mouse and keybord keys
    public Program3() {

        method();
    }

    JLabel l;

    private void method() {

        JPanel p1 = new JPanel();
        add(p1);

        l = new JLabel();
        p1.add(l);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p1.setLayout(null);
        p1.setBackground(Color.red);
        p1.setBounds(0, 0, 400, 400);
        p1.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {

                methoood(e);

            }

        });

        l.setBounds(20, 105, 300, 130);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        l.setOpaque(true);
        l.setFont(new Font("Times New Roman", 1, 10));
        l.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));

    }

    void methoood(MouseEvent e) {

        if (e.isAltDown() && e.isShiftDown()) {

            l.setText("Alt + Shift");
        } else if (e.isAltDown() && e.isControlDown()) {

            l.setText("Alt + Control");
        } else if (e.isControlDown() && e.isShiftDown()) {

            l.setText("ctr + Shift");
        } else if (e.isAltDown()) {

            l.setText("Alt");
        } else if (e.isShiftDown()) {

            l.setText("shift");
        } else if (e.isControlDown()) {

            l.setText("control");
        } else {
            l.setText("No Keys Board Selected");
        }

    }

}
