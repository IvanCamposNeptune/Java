/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author Usuario
 */
public class Cuestionario {
    
      String color="";
  
  public void getColor(String radio){

      color=radio;
      
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Preguntas ventana = new Preguntas();
        ventana.setTitle("Encuesta");
        ventana.setVisible(true);
    }
    

    
}
