/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JListItem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author rm
 */
public class Programe2 extends JFrame {

    public Programe2() {

        method();

    }

    private JList lis1;
    private String Country_name[] = {"Egypt", "USA", "Yaman", "lebia ", "jordon", "Erak", "Oman", "Suria", "Lebanon"};
    private JLabel l;
    private JPanel p;

    private JButton b;

    private JList lis2;

    private void method() {

        p = new JPanel();
        add(p);

        lis1 = new JList(Country_name);
        p.add(lis1);

        lis2 = new JList();
        p.add(lis2);

        b = new JButton();

        l = new JLabel();
        p.add(l);

        JScrollPane sp = new JScrollPane();
        sp.getViewport().add(lis1, null);
        p.add(sp, null);

        JScrollPane sp2 = new JScrollPane();
        sp2.getViewport().add(lis2, null);
        p.add(sp2);

        b = new JButton();
        p.add(b);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 400, 400);
        p.setLayout(null);
        p.setBackground(Color.red);

        lis1.setBounds(20, 20, 100, 150);
        lis1.setBackground(Color.cyan);
        // lis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // lis1.setSelectionMode(0);
        lis1.setVisibleRowCount(4);
        lis1.setFixedCellWidth(100);
        lis1.setFixedCellHeight(25);

        sp.setBounds(20, 20, 100, 150);

        lis2.setBounds(250, 20, 100, 150);
        lis2.setBackground(Color.gray);
        lis2.setVisibleRowCount(4);
        lis2.setFixedCellWidth(100);
        lis2.setFixedCellHeight(25);
        lis2.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {

                l.setText(lis2.getSelectedValue().toString());
            }
        });

        sp2.setBounds(250, 20, 100, 150);

        l.setBounds(140, 200, 140, 140);
        l.setBackground(new Color(122, 183, 237));
        l.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        l.setOpaque(true);
        l.setToolTipText("Selected Country");

        b.setBounds(130, 40, 100, 50);
        b.setText("copy>>");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                lis2.setListData(lis1.getSelectedValues());

            }
        });
    }

}
