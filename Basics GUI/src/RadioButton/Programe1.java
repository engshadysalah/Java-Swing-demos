/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioButton;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author rm
 */
public class Programe1 extends JFrame {

    public Programe1() {

        try {

            Radibutton();

        } catch (Exception exp) {

            System.out.print(exp);

        }

    }
  JRadioButton b1;
    public void Radibutton() {

          b1 = new JRadioButton("ذكر");
        add(b1);

        JRadioButton b2 = new JRadioButton("انثى");
        add(b2);

        JRadioButton b3 = new JRadioButton("Egypt");
        add(b3);

        JRadioButton b4 = new JRadioButton("KSA");
        add(b4);

        JRadioButton b5 = new JRadioButton("Arebia");
        add(b5);

        JRadioButton b6 = new JRadioButton("Erak");
        add(b6);

        ButtonGroup g1 = new ButtonGroup();
        g1.add(b1);
        g1.add(b2);

        ButtonGroup g2 = new ButtonGroup();
        g2.add(b3);
        g2.add(b4);
        g2.add(b5);
        g2.add(b6);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        setLayout(null);

        b1.setBounds(50, 50, 50, 30);
        b1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
           
                if(b1.isSelected()){
                
                    JOptionPane.showMessageDialog(null,"b1 is selected");
                    
                }
            }
        });

        b2.setBounds(120, 50, 50, 30);

        b3.setBounds(10, 80, 80, 30);
        b4.setBounds(120, 80, 80, 30);
        b5.setBounds(200, 80, 80, 30);
        b6.setBounds(280, 80, 80, 30);

        
    }
}
