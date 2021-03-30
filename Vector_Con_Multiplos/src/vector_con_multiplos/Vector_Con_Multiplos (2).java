package vector_con_multiplos;

import java.util.Scanner;

public class Vector_Con_Multiplos {
    

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    int elementos, multiplo,itera=0,promedio,suma=0;
    
    System.out.println("¿Cuantos elementos quiere?: ");
    elementos = entrada.nextInt();
    
    int[] multiplos= new int[elementos]; //Vector que almacena multiplos
    
    System.out.println("¿De que numero desea los multiplos?: ");
    multiplo = entrada.nextInt();
    
    
      for(int i=1; i<=1000; i++){  
        
        if(i%multiplo==0){
            multiplos[itera] = i;
            itera++;
        }
        
        if(itera==elementos){
            break;
        }
        
    }
        
    
        
        System.out.println("Los multiplos de " + multiplo + " son: ");
    
    
    for(int i=0; i<elementos; i++){
        System.out.println(multiplos[i]);
        suma+=multiplos[i];
    }
    
    System.out.println("\nEl promedio de los elementos es: " + (suma/elementos));
        
    }
    
}
