package funciones;

import java.util.Scanner;

public class Funciones {

   static int elevado(int x){//Definicion
       x = x*x;
        return(x);   
   }
        
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero a elevar; ");
        int numero = entrada.nextInt();
        
        System.out.println(elevado(numero)); //llamada
       
    }
    
}
