package calificacion_numero_a_letra;

import java.util.Scanner;

public class Calificacion_numero_a_letra {

    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tCalificación numerica a letra");
	
	double cal;
        String letra="";
	
	System.out.println("Ingresa tu calificación: ");
	cal = entrada.nextDouble();
        
	if(cal>8.7 && cal<=10){
                letra = "A";
		//System.out.println("A equivale a tu calificación");
	}
		else if(cal>7.7 && cal<=8.7){
                letra = "B";
		//System.out.println("B equivale a tu calificación");
	}
		else if(cal>5.9 && cal<=7.7){
                letra = "C";
		//System.out.println("C equivale a tu calificación");
	}
		else if(cal>4.0 && cal<=5.9){
                letra = "D";
		//System.out.println("D equivale a tu calificación");
	}
		else if(cal>0.0 && cal<=4.0){
                letra = "E";
		//System.out.println("E equivale a tu calificación");
	}
        
        
        System.out.println("Calificacion: " + cal);
        System.out.println("Letra: " + letra);
        
        System.out.print("Desempeño: ");
        
        
        switch(letra){
		
		case "A":
		          System.out.println("Excelente");	
		break;
		
		case "B":
			  System.out.println("Satisfactorio");
		break;
		
		case "C":
			  System.out.println("Promedio");
		break;
		
		case "D":
			  System.out.println("Bajo");
		break;
		
		case "E":
			  System.out.println("Malo");
		break;
			
		default: 
		          System.out.println("No ingreso una letra valida");
		
		
	} 
        
        
    }
    
}
