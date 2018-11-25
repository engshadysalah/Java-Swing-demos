/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogInScreenGUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class Formes extends JFrame{
    
    public Formes(){
    
        setLayout(null);
        
        
        JButton b1=new JButton("log in");
        add(b1);
        
        JButton b2=new JButton("Cancel");
        add(b2);
        
        JButton b3=new JButton("");
        add(b3);
        
        
        JLabel l1=new JLabel();
        add(l1);
        
        JLabel l2=new JLabel();
        add(l2);
        
        JTextField f1=new JTextField();
        add(f1);
        
         JPasswordField f2=new JPasswordField();
         add(f2);
        
       
        
        
        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(300, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
    
        
        b1.setText("Log in");
        b1.setBounds(10, 70, 80, 20);
        b1.setBackground(Color.red);
        b1.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        b1.setForeground(Color.black);
   
        
        
        b2.setBounds(100, 70, 80, 20);
        b2.setBackground(Color.red);
        b2.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        b2.setForeground(Color.black);
        
        
        b3.setText("Help");
        b3.setBounds(190, 70, 80, 20);
        b3.setBackground(Color.red);
        b3.setFont(new Font("Arial", Font.BOLD, 12));
        b3.setForeground(Color.black);
        
        
        l1.setBounds(10, 10, 80, 20);
        l1.setText("user name");
        
        l2.setBounds(10, 40, 80, 20);
        l2.setText("password");
       
       f1.setBounds(100, 10, 120, 20);
        
       
       f2.setBounds(100, 40, 120, 20);
    
    
       
       
       
       
    }
}
