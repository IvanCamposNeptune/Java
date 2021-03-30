package longitud_cadena;

import java.util.Scanner;

public class Longitud_Cadena {

    public static void main(String[] args) {
       
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    char[] palabra = word.toCharArray();
    
    int longitud = word.length();
    
    for(int i=0; i<longitud; i++){
      System.out.println(palabra[i]);
    }
    
        System.out.println("La longitud de la cadena es: " + longitud);
        
        
    }
    
}
