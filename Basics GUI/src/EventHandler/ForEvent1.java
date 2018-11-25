/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandler;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */

//number 1

public class ForEvent1 extends JFrame implements ActionListener{
    
    public  JButton b;
    public  JTextField f1;
    
    public ForEvent1(){
    
        
        setLayout(null);
        
        
         b=new JButton("log in");
        add(b);
        
        
       JLabel l1=new JLabel();
        add(l1);
        
         f1=new JTextField();
        add(f1);
        
        
       
        
        
        this.setVisible(true);
        this.setTitle("event");
        this.setSize(300, 250);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
    
        
        b.setText("Print");
        b.setBounds(10, 50, 100, 30);
        b.setBackground(Color.red);
        b.setFont(new Font("Arial",Font.TYPE1_FONT,10));
        b.setForeground(Color.black);
        b.addActionListener(this);
        
         
        
        l1.setBounds(10, 90, 100, 30);
        l1.setText("Enter your Name");
       
        f1.setBounds(10, 140, 100, 30);
       
        
       
      
     
       
       
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        String myname;
        
        //e.getSource() : to معرفة مصدر الحدث
        if(e.getSource()==b){
        
            myname=f1.getText();
            
            JOptionPane.showMessageDialog(null, myname);
        
        }
        
    }
    
}
