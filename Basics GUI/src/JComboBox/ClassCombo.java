/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JComboBox;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class ClassCombo extends JFrame {

    public ClassCombo() {

        method();

    }

    private JComboBox cb;

    private JComboBox getData;

    private String photo_name[] = {"281037026.jpg", "301013214.jpg", "321028232.jpg", "461017540.jpg"};
    private JLabel l;
    private JTextField f;

    private void method() {

        JPanel p = new JPanel();
        add(p);

        cb = new JComboBox(photo_name);
        p.add(cb);

        l = new JLabel();
        p.add(l);

        f = new JTextField();
        p.add(f);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 400);
        p.setLayout(null);
        p.setBackground(Color.red);

        cb.setBounds(20, 20, 120, 50);
        cb.setBackground(Color.cyan);
        cb.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {

                String s = photo_name[cb.getSelectedIndex()];

                Icon img = new ImageIcon(getClass().getResource(s));

                l.setIcon(img);
                f.setText(s.substring(1, s.length() - 4));

            }
        });

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getData = (JComboBox) e.getSource();
                JOptionPane.showMessageDialog(null, getData.getSelectedItem());

                 //JOptionPane.showMessageDialog(null, cb.getSelectedItem());
            }
        });

        l.setBounds(160, 50, 140, 140);
        l.setBackground(new Color(122, 183, 237));
        l.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        l.setOpaque(true);

        f.setBounds(80, 200, 120, 40);
        f.setBackground(Color.green);

        
    }

}
