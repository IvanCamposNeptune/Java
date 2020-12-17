/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_de_datos;

/**
 *
 * @author Ivan
 */
public class Tipos_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES ENTERAS
        
        //byte, ocupa 8 bits su rango es de -128 hasta el 127
        byte entero;
        entero = 12;
        //Puede definirse enseguida "byte entero = 12" es lo mismo.
        System.out.println("Numero entero tipo byte=" + entero);

        //short, ocupa 16 bits su rango es de -32,768 hasta el 32,767
        short entero1 = 12456;
        System.out.println("Numero entero tipo short=" + entero1);
        
        //int, ocupa 32 bits su rango es de -2,147,483,648 hasta el 2,147,483,647
        int entero2 = 1245656;
        System.out.println("Numero entero tipo int=" + entero2);
        
        //long, ocupa 64 bits su rango es de -9,223,372,036,854,775,808 hasta el 9,223,372,036,854,775,807
        long entero3 = 124565640;
        System.out.println("Numero entero tipo long=" + entero3);
        
        //VARIABLE DE TIPO DECIMAL
        
        //float, ocupa 32 bits su rango es de 1.4e-045 a 3.4e+038
        float decimal = 3.45f;  //Cuando es flot se tieneque poner f despues del numero.
        System.out.println("Numero decimal tipo float=" + decimal);
        
        //double, ocupa 64 bits su rango es de 4.9e-324 a 1.8e+308
        double decimal1 = 3.4523421;  //No hay necesidad de indicar como el float.
        System.out.println("Numero decimal tipo double=" + decimal1);
        
        //VARIABLE DE TIPO CARACTER
        
        //char
        char caracter = 'a';  //Entre comilla simple
        System.out.println("Variable tipo caracter=" + caracter);
        
        
        //VARIABLE DE TIPO BOOLEANO
        
        //boolean
        boolean decision = true; //Solo puede ser true o false
        System.out.println("Variable tipo boolean=" + decision);
        
        
        
    }
    
}
