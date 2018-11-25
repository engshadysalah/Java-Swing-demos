/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JListItem;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author rm
 */
///programe 1
public class List_Class extends JFrame {

    public List_Class() {

        method();

    }

    private JList lis;
    private String color_name[] = {"Red", "Green", "plue", "Black", "White", "Yello"};
    private JLabel l;
    private JPanel p;
    private Color coler[] = {Color.red, Color.GREEN, Color.BLUE, Color.BLACK, Color.WHITE, Color.yellow};

    private void method() {

        p = new JPanel();
        add(p);

        lis = new JList(color_name);
        p.add(lis);

        l = new JLabel();
        p.add(l);

        JScrollPane sp = new JScrollPane();
        sp.getViewport().add(lis, null);
        p.add(sp);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 400);
        p.setLayout(null);
        p.setBackground(Color.red);

        lis.setBounds(20, 20, 100, 90);
        lis.setBackground(Color.cyan);
        // lis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lis.setSelectionMode(0);
        lis.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {

                int index = lis.getSelectedIndex();
                p.setBackground(coler[index]);

                l.setText(color_name[index]);

            }
        });
        sp.setBounds(20, 20, 100, 90);

        l.setBounds(140, 50, 140, 140);
        l.setBackground(new Color(122, 183, 237));
        l.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        l.setOpaque(true);

    }

}
