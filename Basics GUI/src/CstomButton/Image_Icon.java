/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CstomButton;
import FristJavaGui.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author rm
 */
public class Image_Icon extends JFrame{
    
    public Image_Icon(){
    
        setLayout(null);
        
       
        Icon ico1=new ImageIcon(getClass().getResource("Untitled.png"));
        ImageIcon ico2=new ImageIcon(getClass().getResource("Untitled.png"));
        
        
        JButton b1=new JButton(ico1);
        add(b1);
        
        JButton b2=new JButton(ico2);
        add(b2);
        
         
        JLabel l=new JLabel(ico1);
        add(l);
        
        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(500, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
    
        
        b1.setText("Add");
        b1.setBounds(10, 20, 300, 100);
        b1.setBackground(Color.red);
        b1.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        b1.setForeground(Color.black);
   
        
        
        b2.setBounds(100, 20, 80, 20);
        b2.setBackground(Color.red);
        b2.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        b2.setForeground(Color.black);
        
        
      
        
       // l.setBounds(10, 200, 100, 100);
      // l.setIcon(new ImageIcon("D:\\Faculty\\Java trining\\ask.png"));
       
       
       
       
       
       
    }
}
