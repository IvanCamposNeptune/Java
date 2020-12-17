
package Fracciones;
import Clases_y_Objetos.Fraccion; //Paquete que se importa . Clase que se importa

public class Fracciones 
{
    
    public static void main (String [] args)
    {
        
        System.out.println("\t Proyecto Fracciones");
        
        Fraccion A = new Fraccion();
        Fraccion B = new Fraccion();
        
        //Enviando datos
        A.setNumerador(3);
        A.setDenominador(2);
        
        B.setNumerador(2);
        B.setDenominador(3);
        
        
        //Mostrando datos
        System.out.print("Fraccion 1:  "); A.mostrar();
        System.out.print("Fraccion 2:  "); B.mostrar();
        
        Fraccion.sumar(A,B); //Metodo sumar de la clase fraccion que recibe argumentos del tipo de la clase.
        
    }    
    
}
