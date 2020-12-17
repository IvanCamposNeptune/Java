/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
import java.awt.Graphics;//Clase Graphics
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;


/**
 *
 * @author Usuario
 */
public class Proyecto2 extends MouseAdapter{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyectito ventana = new Proyectito();//Objeto tipo jframe
        ventana.setTitle("Proyecto 2");
        ventana.setVisible(true);
    }
    
    public static void HacerCirculo(Graphics g, int x,int y,int x1, int y1)
    {
        g.setColor (Color.red);
        g.fillOval(x, y, x1, y1);
    }
    
        public static void HacerCuadrado(Graphics g, int x,int y,int x1, int y1)
    {
        g.setColor (Color.blue);
        g.fillRect(x, y, x1, y1);

    }
        
       public static void BorrarCirculo(Graphics g, int x,int y,int x1, int y1)
       {
        g.setColor (Color.red);
        g.fillOval(x, y, x1, y1);
        g.clearRect(x, y, x1, y1);
       }
       
       public static void BorrarCuadrado(Graphics g, int x,int y,int x1, int y1)
       {
        g.setColor (Color.blue);
        g.fillRect(x, y, x1, y1);
        g.clearRect(x, y, x1, y1);
       }
      
       

             
       

    
}
