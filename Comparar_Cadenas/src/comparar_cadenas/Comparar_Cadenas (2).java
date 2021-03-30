package comparar_cadenas;

import java.util.Scanner;

public class Comparar_Cadenas {
    
    /*
    devuelve <0, entonces la cadena que llama al método es primero lexicográficamente
    devuelve == 0 entonces las dos cadenas son lexicográficamente equivalentes
    devuelve> 0, entonces el parámetro pasado al método compareTo es lexicográficamente el primero.
    
    Compare con ‘a’ b es: -1
    Compare con ‘b’ a es: 1
    Compare con ‘b’ b es: 0
    
    */

    public static void main(String[] args) {
       
        Scanner nombre = new Scanner(System.in);
  	System.out.print("Escriba el nombre:");
  	String name = nombre.nextLine();

  	if(name.compareTo("Ivan") == 0){ //Compara si son iguales
  	  System.out.println("teacher");
  	}
  	else{
  	  System.out.println("student");
  	}
        
        
    }
    
}
