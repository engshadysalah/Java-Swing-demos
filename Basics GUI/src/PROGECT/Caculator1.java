/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGECT;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class Caculator1 extends JFrame {

    public Caculator1() {

        try {

            method_Menubar();
            Method_2();
        } catch (Exception exp) {

            System.out.println("The Error Is and Please Call The Admainestrator :  " + exp);
        }

    }

    private JPanel p;
    private JLabel l;

    private void method_Menubar() {

        p = new JPanel();
        add(p);

        JMenuBar mb = new JMenuBar();
        p.add(mb);

        JMenu m1 = new JMenu("View");
        mb.add(m1);

        JMenu m2 = new JMenu("Edit");
        mb.add(m2);

        JMenu m3 = new JMenu("Help");
        mb.add(m3);

        JMenuItem mv1 = new JRadioButtonMenuItem("Standerd                                Alt+1");
        m1.add(mv1);

        JMenuItem mv2 = new JRadioButtonMenuItem("Scientific                              Alt+2");
        m1.add(mv2);

        JMenuItem mv3 = new JRadioButtonMenuItem("Programmer                         Alt+3");
        m1.add(mv3);

        JMenuItem mv4 = new JRadioButtonMenuItem("Statistics                               Alt+4");
        m1.add(mv4);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(mv1);
        bg1.add(mv2);
        bg1.add(mv3);
        bg1.add(mv4);

        /////////////////////////////////////////////
        JMenuItem mv5 = new JCheckBoxMenuItem("History                                  Ctrl+H");
        m1.add(mv5);

        JMenuItem mv6 = new JCheckBoxMenuItem("Digit grouping                     ");
        m1.add(mv6);

        /////////////////////////////////////////////  
        JMenuItem mv7 = new JRadioButtonMenuItem("Basic                                   Ctrl+F4");
        m1.add(mv7);

        JMenuItem mv8 = new JRadioButtonMenuItem("Unit conversion                 Ctrl+U");
        m1.add(mv8);

        JMenuItem mv9 = new JRadioButtonMenuItem("Date calculation                Ctrl+E");
        m1.add(mv9);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(mv7);
        bg2.add(mv8);
        bg2.add(mv9);

        /////////////////////////////////////////////////////
        JMenuItem mv10 = new JMenu("Worksheet                   ");
        m1.add(mv10);

        JMenuItem mv12 = new JRadioButtonMenuItem("Mortage");
        mv10.add(mv12);

        JMenuItem mv13 = new JRadioButtonMenuItem("Vehicle lease");
        mv10.add(mv13);

        JMenuItem mv14 = new JRadioButtonMenuItem("Full economy (mpy)");
        mv10.add(mv14);

        JMenuItem mv15 = new JRadioButtonMenuItem("Full economy (L/100km)");
        mv10.add(mv15);

        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(mv12);
        bg3.add(mv13);
        bg3.add(mv14);
        bg3.add(mv15);

        /////////////////////////////////////////////////////
        JMenuItem me1 = new JMenuItem("Copy                  Ctrl+C");
        m2.add(me1);

        JMenuItem me2 = new JMenuItem("Paste                  Ctrl+V");
        m2.add(me2);

        JMenuItem me3 = new JMenu("History");
        m2.add(me3);

        JMenuItem me11 = new JMenuItem("Copy history");
        me3.add(me11);

        JMenuItem me12 = new JMenuItem("Edit                                        F2");
        me3.add(me12);

        JMenuItem me13 = new JMenuItem("Cancel edit                         Esc");
        me3.add(me13);

        JMenuItem me14 = new JMenuItem("Clear                      Ctrl+Shift+D");
        me3.add(me14);

        JMenuItem mh1 = new JMenuItem("View Help                         F1");
        m3.add(mh1);

        JMenuItem mh2 = new JMenuItem("About Calculator");
        m3.add(mh2);

        this.setVisible(true);
        this.setTitle("Calculator");
        this.setSize(315, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 315, 313);
        p.setLayout(null);
        p.setBackground(Color.pink);

        mb.setBounds(0, 0, 315, 17);

    }

    private JButton b25;
    private JButton b12;
    private JButton b11;

    public void Method_2() {

        Inner_Class inn = new Inner_Class();

        l = new JLabel("");
        p.add(l);

        JButton b1 = new JButton("MC");
        p.add(b1);

        JButton b2 = new JButton("MR");
        p.add(b2);

        JButton b3 = new JButton("MS");
        p.add(b3);

        JButton b4 = new JButton("M+");
        p.add(b4);

        JButton b5 = new JButton("M-");
        p.add(b5);

        JButton b6 = new JButton("<=");
        p.add(b6);

        JButton b7 = new JButton("CE");
        p.add(b7);

        JButton b8 = new JButton("C");
        p.add(b8);

        JButton b9 = new JButton("+_");
        p.add(b9);

        JButton b10 = new JButton("v");
        p.add(b10);

        b11 = new JButton("7");
        p.add(b11);

        b12 = new JButton("8");
        p.add(b12);

        JButton b13 = new JButton("9");
        p.add(b13);

        JButton b14 = new JButton("/");
        p.add(b14);

        JButton b15 = new JButton("%");
        p.add(b15);

        JButton b16 = new JButton("4");
        p.add(b16);

        JButton b17 = new JButton("5");
        p.add(b17);

        JButton b18 = new JButton("6");
        p.add(b18);

        JButton b19 = new JButton("*");
        p.add(b19);

        JButton b20 = new JButton("1/x");
        p.add(b20);

        final JButton b21 = new JButton("1");
        p.add(b21);

        final JButton b22 = new JButton("2");
        p.add(b22);

        final JButton b23 = new JButton("3");
        p.add(b23);

        JButton b24 = new JButton("-");
        p.add(b24);

        b25 = new JButton("=");
        p.add(b25);

        final JButton b26 = new JButton("0");
        p.add(b26);

        final JButton b27 = new JButton(".");
        p.add(b27);

        final JButton b28 = new JButton("+");
        p.add(b28);

        l.setBounds(10, 30, 290, 45);
        l.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        l.setOpaque(true);

        b1.setBounds(10, 80, 52, 27);
        b2.setBounds(70, 80, 52, 27);
        b3.setBounds(130, 80, 52, 27);
        b4.setBounds(190, 80, 52, 27);
        b5.setBounds(250, 80, 52, 27);

        b6.setBounds(10, 110, 52, 27);
        b7.setBounds(70, 110, 52, 27);
        b8.setBounds(130, 110, 52, 27);
        b9.setBounds(190, 110, 52, 27);
        b10.setBounds(250, 110, 52, 27);

        b11.setBounds(10, 140, 52, 27);
        b11.addActionListener(inn);

        b12.setBounds(70, 140, 52, 27);
        b12.addActionListener(inn);

        b13.setBounds(130, 140, 52, 27);
        b14.setBounds(190, 140, 52, 27);
        b15.setBounds(250, 140, 52, 27);

        b16.setBounds(10, 170, 52, 27);

        b17.setBounds(70, 170, 52, 27);

        b18.setBounds(130, 170, 52, 27);

        b19.setBounds(190, 170, 52, 27);
        b20.setBounds(250, 170, 52, 27);

        b21.setBounds(10, 200, 52, 27);

        b22.setBounds(70, 200, 52, 27);

        b23.setBounds(130, 200, 52, 27);

        b24.setBounds(190, 200, 52, 27);

        b25.setBounds(250, 200, 52, (27 + 30));
        b25.addActionListener(inn);

        b26.setBounds(10, 230, (52 + 52 + 10), 27);

        b28.setBounds(190, 230, 52, 27);

    }

    private int num1;
    private int num2;
    private int sum;

    private class Inner_Class implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b11) {

                l.setText(" 7");

                num1 = Integer.parseInt(l.getText());

            } else if (e.getSource() == b12) {

                l.setText(" 8");

                num2 = Integer.parseInt(l.getText());

            } else if (e.getSource() == b25) {

                sum = num1 + num2;

                l.setText(sum + " ");

            }

        }

    }

}
