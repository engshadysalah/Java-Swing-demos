/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FristJavaGui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rm
 */
public class programe1 extends JFrame {

    public programe1() {

        JFrame f = new JFrame();

        JPanel p = new JPanel();
        f.add(p);

        JLabel limage = new JLabel();
        p.add(limage);

        f.setVisible(true);
        f.setTitle("frist program");
        f.setSize(400, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 400);
        // p.setBackground(Color.red);
        //p.setLayout(null);

        Icon img = new ImageIcon(getClass().getResource("Untitled.png"));

        limage.setIcon(img);
    }

    public static void main(String[] args) {

        new programe1();

    }
}
