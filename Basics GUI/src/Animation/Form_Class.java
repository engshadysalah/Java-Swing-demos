/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animation;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author rm
 */
public class Form_Class extends JFrame{
    
    
    
     
    public Form_Class() {

        try {
            jbInit();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    void jbInit() throws Exception {

        

    }
    
    
    
    
    public static void main(String[]args){
    
    Form_Class frm=new Form_Class();
    
    Paint_Class p=new Paint_Class();
    
    
        p.setSize(frm.WIDTH, frm.HEIGHT);
        frm.add(p); 
        frm.setTitle("My Paint");
        frm.setSize(600,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
    
        
        
    }
    
   
    
}

    

