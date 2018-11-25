/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGraoundImage;

import CreateGUIFromTooles.JFramee;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rm
 */
public class MainClass {

    public static void main(String[] args) {

        printimage();

    }

    public static void printimage() {

        JFrame f = new JFrame();

//        JPanel p = new JPanel() {
//
//            @Override
//            public void paintComponent(Graphics g) {
//
//                ImageIcon img = new ImageIcon(getClass().getResource("Untitled.png"));
//                img.paintIcon(this, g, 10, 10);
//
//            }
//        };
        Programe obj = new Programe();
      
        f.add(obj);

        f.setVisible(true);
        f.setTitle("iam new form");
        f.setSize(400, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

//        p.setBounds(0, 0, 400, 400);
//        p.setLayout(null);
    }

}
