/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_de_datos_no_primitivos;

/**
 *
 * @author Ivan
 */
public class Tipos_de_datos_no_primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TIPOS DE DATOS NO PRIMITIVOS
        
        //Integer, Para almacenar null se necesitan tipos de datos no primitivos
        Integer numero = null;
        System.out.println("El numero es: " + numero);
        
        //Y se pueden usar metodos con este tipo de datos.
        //numero.intValue() por ejemplo
        
        //String, para almacenar cadenas de caracteres
        String palabra = "Hola mundo";  //A diferencia del char, este guarda muchos caracteres y necesita comillas dobles
        System.out.println(palabra);
        
        
    }
    
}
