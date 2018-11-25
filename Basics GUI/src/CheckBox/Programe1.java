/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBox;

import java.awt.Rectangle;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author rm
 */
// programe 1
public class Programe1 extends JFrame {

    public Programe1() {

        try {
            Setitem();

        } catch (Exception xp) {

            System.out.print(xp.getMessage());

        }
    }

    private void Setitem() {

        setLayout(null);

        JCheckBox b1 = new JCheckBox("a");
        add(b1);
        JCheckBox b2 = new JCheckBox("CheckBox : 1");
        add(b2);
        JCheckBox b3 = new JCheckBox("CheckBox : 2");
        add(b3);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        b2.setBounds(10, 100, 100, 50);
        b3.setBounds(new Rectangle(10, 180, 100, 50));

    }

}
