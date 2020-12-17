package desempeño_letra;

import java.util.Scanner;

public class Desempeño_letra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        char letra;
        
        System.out.println("\tDesempeño letra");
        
        System.out.println("Ingresa una letra: ");
        
        letra = entrada.next().charAt(0);
        
        switch(letra){
		
		case 'A': case 'a':
		          System.out.println("Excelente desempeño");	
		break;
		
		case 'B': case 'b':
			  System.out.println("Desempeño satisfactorio");
		break;
		
		case 'C': case 'c':
			  System.out.println("Desempeño promedio");
		break;
		
		case 'D': case 'd':
			  System.out.println("Bajo desempeño");
		break;
		
		case 'E': case 'e':
			  System.out.println("Mal desempeño");
		break;
			
		default: 
		          System.out.println("No ingreso una letra valida");
		
		
	}
        
    }
    
}
