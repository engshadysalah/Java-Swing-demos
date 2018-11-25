/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package createMenue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class Programe1 extends JFrame {

    public Programe1() {
        method();
    }

    public void method() {

        JPanel p = new JPanel();
        add(p);

        JMenuBar mb = new JMenuBar();
        p.add(mb);

        JMenu menu1 = new JMenu("Menue File");
        mb.add(menu1);

        JMenu menu2 = new JMenu("Menue Help");
        mb.add(menu2);

        JMenuItem mi = new JMenuItem("Add File");
        menu1.add(mi);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 300);
        p.setLayout(null);
        p.setBackground(Color.red);

        mb.setBounds(0, 0, 400, 20);

        menu1.setBounds(0, 0, 100, 20);

        menu2.setBounds(100, 0, 100, 20);
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                JOptionPane.showMessageDialog(null, "Help :) ");
            }
        });

        mi.setBounds(0, 0, 100, 20);

    }

}
