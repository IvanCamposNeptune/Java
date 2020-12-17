package calificacion_a_letra;

import java.util.Scanner;

public class Calificacion_a_letra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tCalificación numerica a letra");
	
	double cal;
        String letra="";
	
	System.out.println("Ingresa tu calificación (Separe el decimal con coma): ");
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
        
        
        switch(letra){
		
		case "A":
		          System.out.println("Excelente desempeño");	
		break;
		
		case "B":
			  System.out.println("Desempeño satisfactorio");
		break;
		
		case "C":
			  System.out.println("Desempeño promedio");
		break;
		
		case "D":
			  System.out.println("Bajo desempeño");
		break;
		
		case "E":
			  System.out.println("Mal desempeño");
		break;
			
		default: 
		          System.out.println("No ingreso una letra valida");
		
		
	}
        
        
        
        
        
    }
    
}
