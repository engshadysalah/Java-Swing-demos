/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */

//number 2
public class RadioButtonExample extends JFrame implements ActionListener{
    
      private JRadioButton r1;
      private JRadioButton r2;
      private JRadioButton r3;
      private JRadioButton r4;
      private JRadioButton r5;
      private JPanel p;
      
    public RadioButtonExample(){
    
       
         p=new JPanel();
        add(p);
        
        r1=new JRadioButton("Red"); 
          p.add(r1);
          
         r2=new JRadioButton("Green"); 
          p.add(r2);
          
          r3=new JRadioButton("Blue"); 
          p.add(r3);
          
       r4=new JRadioButton("Yello"); 
         p. add(r4);
          
         r5=new JRadioButton("Black"); 
         p. add(r5);
          
           ButtonGroup g=new ButtonGroup();
          g.add(r1);
          g.add(r2);
          g.add(r3);
          g.add(r4);
          g.add(r5);
         
          
          
          
          
        this.setVisible(true);
        this.setTitle("event");
        this.setSize(300, 250);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
      
    
         p.setBounds(0, 0, 300, 250);
         p. setLayout(null);
         
         
        r1.setBounds(10, 10, 60, 60);
        r1.addActionListener(this);
        
        r2.setBounds(10, 50, 60, 60);
        r2.addActionListener(this);
        
        r3.setBounds(10, 90, 60, 60);
        r3.addActionListener(this);
        r4.setBounds(10, 130, 60, 60);
        r4.addActionListener(this);
        
        r5.setBounds(10, 170, 60, 60);
        r5.addActionListener(this);
          
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
     if(e.getSource()==r1){
        
         p.setBackground(Color.red);
     }
     else if(e.getSource()==r2){
        
         p.setBackground(Color.green);
     }
     
     else if(e.getSource()==r3){
        
         p.setBackground(Color.BLUE);
     }
     
     else if(e.getSource()==r4){
        
         p.setBackground(Color.YELLOW);
     }
     
     else if(e.getSource()==r5){
        
         p.setBackground(Color.black);
     }
     
     
    }

    
    
}
