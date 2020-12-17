package suma_de_pares_e_impares;

import java.util.Scanner;

public class Suma_de_pares_e_impares {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        //Suma de pares e impares hasta 10,000
        
        System.out.println("\tSuma de pares e impares hasta 10,000");
        
        int acumP=0, acumI=0;
        
        for(int pi=0; pi<=10000 ; pi++){
            
            if(pi%2==0){
            acumP = acumP + pi;
            }
            else{
            acumI+=pi;
            }
            
        }
        
        System.out.println("\nLa suma de los pares es: " + acumP);
        System.out.println("La suma de los impares es: " + acumI);
        
    }
    
}
