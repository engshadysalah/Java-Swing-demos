/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author rm
 */
public class Paint_Class extends JPanel implements ActionListener, KeyListener {

    private Timer tim = new Timer(2, this);

    private JButton choss = new JButton();

    int x = 0;
    int y = 0;
    int xend = 2;
    int yend = 2;

    int v = 250;
    int h = 250;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        tim.start();
        // g.setColor(Color.red);
        Color c = new Color(180, 70, 90);
        g.setColor(c);
        g.draw3DRect(20, 50, 200, 150, true);
        g.fill3DRect(20, 250, 200, 150, true);
        g.fillOval(300, 50, 50, 80);
        g.drawOval(390, 50, 50, 50);

        Color cc = new Color(90, 70, 90);
        g.setColor(cc);
        g.fillRoundRect(300, 150, 80, 180, 20, 80);

        //draw moving ball
        g.setColor(Color.red);
        g.fillOval(x, y, 80, 80);

        //draw lights
        for (int index = 0; index < 1500; index += 10) {

            g.drawLine(0, 0, index, getHeight());

        }
        //another lights
        g.setColor(Color.DARK_GRAY);
        for (int index = 0; index < 1500; index += 10) {

            g.drawLine(getWidth(), 0, index, getHeight());

        }

        //draw sun light
        g.setColor(new Color(225, 205, 60));
        g.fillOval(-25, -25, 80, 80);

        //draw moving shap
        g.setColor(Color.yellow);
        g.fill3DRect(v, h, 80, 120, true);

    }

    public Paint_Class() {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);

        jpInit();

    }

    private void jpInit() {

        this.add(choss, null);

        choss.setText("Choss y Color");

        choss.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                actiomethod(e);

            }
        });

    }

    private void actiomethod(ActionEvent e) {

        JColorChooser ch = new JColorChooser();

        Color co = ch.showDialog(null, "choss color", Color.WHITE);

        this.setBackground(co);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x < 0 || x >= this.getWidth() - 60) {

            xend = -xend;

        }
        if (y < 0 || y >= this.getHeight()) {

            yend = -yend;

        }

        x = x + xend;
        y = y + yend;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keycod = e.getKeyCode();

        switch (keycod) {

            case KeyEvent.VK_UP:
                key_up();
                break;

            case KeyEvent.VK_DOWN:
                key_down();
                break;

            case KeyEvent.VK_RIGHT:
                key_right();
                break;

            case KeyEvent.VK_LEFT:
                key_left();
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void key_up() {

        h = h - 5;
    }

    private void key_down() {

        h = h + 5;
    }

    private void key_right() {

        v = v + 5;
    }

    private void key_left() {

        v = v - 5;
    }

}
