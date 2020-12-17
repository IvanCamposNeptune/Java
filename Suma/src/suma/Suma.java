package suma;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int [100][100];
        int sumas[] = new int [100];
        
        double fila, columna, suma2=0, elementos=0;
	
	System.out.println("\nCuantas filas desea?:");
        fila = entrada.nextDouble();
        
	System.out.println("\nCuantas columnas desea?:");
        columna = entrada.nextDouble();
	
	System.out.println("\n");
	
	//Llenar matriz
	for(int i=0; i<fila; i++){
           int suma=0;
		for(int j=0; j<columna; j++){
                System.out.println("Digite un numero para" + "[" + i + "]" + "[" + j + "]:");
                matriz[i][j] = entrada.nextInt();
		suma+=matriz[i][j];		
		}
                sumas[i] = suma;
	}
	
	System.out.println("\n");
	
	//Mostrar matriz
	System.out.println("\nMatriz");
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
		System.out.print(matriz[i][j] + " ");
		}
	System.out.println("\n");
	}
	
	
	
	
	//Suma de las filas de matriz
	for(int i=0; i<fila; i++){
            System.out.println("La suma de la fila " + (i+1) + " es: " + sumas[i]);
        }
        
        
    }
    
}
