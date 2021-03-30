package funcion_pow;

import java.util.Scanner;

public class Funcion_Pow {
    
    //Elevacion de un numero
    public static int pow(int num, int elevado){       
        int acum = 1;       
        for(int i=0; i<elevado; i++){
            acum *= num;
        }     
        return(acum); 
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
   
        int numero, elevado;
        
        System.out.println("\tElevacion de un numero");
        
        System.out.println("Digita un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("Digita el exponencial: ");
        elevado = entrada.nextInt();
           
        //Llamada a la funcion
        System.out.println("El numero elevado es: " + pow(numero, elevado));
        
    }
    
}
