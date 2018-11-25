/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtendsJframe;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rm
 */
public class JframeClass extends JFrame {

    public JframeClass() {

        JLabel l1 = new JLabel("Welcome to GuI");
        add(l1);
        setLayout(new FlowLayout());

        JLabel l2 = new JLabel("Iam orecal");
        add(l2);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

}
