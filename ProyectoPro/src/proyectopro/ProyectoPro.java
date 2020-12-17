/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopro;

/**
 *
 * @author Usuario
 */
public class ProyectoPro extends ProyectitoPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectitoPro ventana = new ProyectitoPro();//Objeto tipo jframe
        ventana.setTitle("Proyecto 2");
        ventana.setVisible(true);
        JL1.setVisible(false);
        JL2.setVisible(false);
    }
    
}
