/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


/**
 *
 * @author Usuario
 */
public class Proyecto3 extends Proyectito3 implements MouseMotionListener 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyectito3 form=new Proyectito3();
        form.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
           
          
       }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
}
