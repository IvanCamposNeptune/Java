package random_limitado;

import java.util.Random;
import java.util.Scanner;

public class Random_Limitado {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);//Variable de lectura
        Random rnd = new Random();//variablñe de aleatorio
        
        int aleatorio = rnd.nextInt(51) , nop=3 , x;//Numero entre 0 y 50 , oportunidades iniciado en 3 , variable
        
        System.out.println(aleatorio);//Comprobacion
        
        System.out.println("\tAdivina el numero aleatorio entre 0 y 50");
        
        while(nop>0){
            System.out.println("\nDame un numero: ");
            x = entrada.nextInt();
            
            if(x == aleatorio){
                System.out.println("You are the best el mejor el mero mero caguamero");
                break;
            }
            else if(x>aleatorio){
                System.out.println("El numero es menor");
            }
            else if(x<aleatorio){
                System.out.println("El numero es mayor");
            }
            
            nop--;
            System.out.println("Te quedan " + nop + " oportunidades...");
            
            if(nop==0){
                System.out.println("\tGame over");
            }
            
        }
        
        
    }
    
}
