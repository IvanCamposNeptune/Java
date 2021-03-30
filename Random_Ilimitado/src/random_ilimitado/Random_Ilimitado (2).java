package random_ilimitado;

import java.util.Random;
import java.util.Scanner;

public class Random_Ilimitado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);//Variable de lectura
        Random rnd = new Random();//variablñe de aleatorio
        
        int aleatorio = rnd.nextInt(51) , x;//Numero entre 0 y 50 , oportunidades iniciado en 3 , variable
        
        System.out.println(aleatorio);//Comprobacion
        
        System.out.println("\tAdivina el numero aleatorio entre 0 y 50");
        
        do{
            System.out.println("\nDame un numero: ");
            x = entrada.nextInt();
            
            if(x == aleatorio){
                System.out.println("You are the best el mejor el mero mero caguamero");
            }
            else if(x>aleatorio){
                System.out.println("El numero es menor");
            }
            else if(x<aleatorio){
                System.out.println("El numero es mayor");
            }
            
            
        }while(x!=aleatorio);
        
        
    }
    
}
