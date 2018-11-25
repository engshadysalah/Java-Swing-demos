/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author rm
 */
public class Programe11 extends JFrame {

    public Programe11() {

        method();
    }

    private JPanel p1;
    private JPanel p2;
    private JLabel l1;
    private JLabel l2;

    public void method() {

        inner in = new inner();

        p1 = new JPanel();
        this.add(p1);

        p2 = new JPanel();
        this.add(p2);

        l1 = new JLabel();
        p1.add(l1);

        l2 = new JLabel();
        p2.add(l2);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p1.setLayout(null);
        p1.setBackground(Color.red);
        p1.setBounds(0, 0, 400, 50);
        p1.addMouseListener(in);
        p1.addMouseMotionListener(in);
        p1.addMouseWheelListener(in);

        p2.setLayout(null);
        p2.setBackground(Color.yellow);
        p2.setBounds(0, 50, 400, 50);
        //p2.addMouseListener(in);
        // p2.addMouseMotionListener(in);
        // p2.addMouseWheelListener(in);

        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setBackground(Color.black);

        l1.setBounds(0, 0, 400, 50);

        l2.setBackground(Color.red);

    }

    public class inner implements MouseListener, MouseMotionListener, MouseWheelListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

            l1.setText("U mousePressed in the frist panel");
            p1.setBackground(Color.cyan);

        }

        @Override
        public void mouseReleased(MouseEvent e) {

            l1.setText("U mouseReleased in the frist panel");
            p1.setBackground(Color.black);

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

            l1.setText("Current Postion : " + e.getX() + " : " + e.getY());
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

    }

}
