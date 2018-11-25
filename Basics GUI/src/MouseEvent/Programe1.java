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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author rm
 */
public class Programe1 extends JFrame {

    public Programe1() {

        method();
    }

    private JPanel p1;
    private JPanel p2;
    private JLabel l1;
    private JLabel l2;

    public void method() {

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

        p1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("u enter in frist panel");
            }

        });

        p2.setLayout(null);
        p2.setBackground(Color.yellow);
        p2.setBounds(0, 50, 400, 50);
        p2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("mouseExited");
            }

        });
        p2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("mouseEntered");
            }

        });

        p2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("mouseClicked  ");
            }

        });
        p2.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("you pressed");
            }

        });

        p2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("you realsed");
            }

        });

        p2.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {

                l1.setText("Mouse Postionat " + e.getX() + " : " + e.getY());

            }

        });
        p2.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {

                l1.setText("mouseDragged");

            }

        });

        p2.addMouseWheelListener(new MouseAdapter() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                l1.setText("u are Wheel");

                int notches = e.getWheelRotation();

                if (notches < 0) {
                    System.out.println("Mouse wheel moved UP ");

                } else {
                    System.out.println("Mouse wheel moved Down ");
                }
            }

        });

        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setBackground(Color.black);

        l1.setBounds(0, 0, 400, 50);

        l2.setBackground(Color.red);

        p2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                System.out.println("u ar typing");
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_DELETE) {

                    JOptionPane.showMessageDialog(null, "u pressed Deleted Key");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

}
