package mayor_de_4_numeros;

import java.util.Scanner;

public class Mayor_de_4_numeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, num4, mayor;
	
        System.out.println("\tMayor de 4 numeros");
	
        System.out.println("Digita el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digita el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Digita el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Digita el cuarto numero: ");
        num4 = entrada.nextInt();
       
        
	if(num1>num2 && num1>num3 && num1>num4){
                System.out.println("El numero mayor es: " + num1); 
	}
	else if(num2>num1 && num2>num3 && num2>num4){
		System.out.println("El numero mayor es: " + num2);
	}
		else if(num3>num1 && num3>num2 && num3>num4){
		System.out.println("El numero mayor es: " + num3);
	}
	else {
		System.out.println("El numero mayor es: " + num4);
	}
        
        
    }
    
}
