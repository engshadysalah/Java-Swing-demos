/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGraoundImage;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rm
 */
public class Programe extends JPanel{
   
    
        
      
    
    //override
    @Override
   public void paintComponent(Graphics  g){
    
      ImageIcon img=new ImageIcon(getClass().getResource("Untitled.png"));
      img.paintIcon(this, g, 10, 10);
        
        
        
    }
    
   
    
}
