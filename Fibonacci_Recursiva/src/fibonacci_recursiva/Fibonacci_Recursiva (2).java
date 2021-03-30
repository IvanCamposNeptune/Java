package fibonacci_recursiva;
import java.util.Scanner;


public class Fibonacci_Recursiva {
    
    
    public static int fibonacci(int n)
    {
	
	if(n<2){// Caso Base
		return n;
	}
	else{// Caso General
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
    }

    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);

    int nElementos;
	
	do{
		System.out.print("Digite el numero de elementos: ");
		nElementos = entrada.nextInt();	
	}while(nElementos<=0);
	
    System.out.println("\tSerie Fibonacci: ");
	for(int i=0; i<nElementos; i++){
    System.out.print(fibonacci(i) + " , ");
	}
        
    }
    
}
