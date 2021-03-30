package promedio_diagonal_principal_matriz;

import java.util.Scanner;

public class Promedio_Diagonal_Principal_Matriz {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double matriz[][] = new double [100][100];
        double fila, columna, suma=0, suma2=0, elementos=0;
	
	System.out.println("\n¿Cuantas filas desea?:");
        fila = entrada.nextDouble();
        
	System.out.println("\n¿Cuantas columnas desea?:");
        columna = entrada.nextDouble();
	
	System.out.println("\n");
	
	//Llenar matriz
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
                System.out.println("Digite un numero para" + "[" + i + "]" + "[" + j + "]:");
                matriz[i][j] = entrada.nextDouble();
		suma+=matriz[i][j];
		if(i==j){
		suma2+=matriz[i][j];
                elementos++;
			}		
		}
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
	
	//Mostrar diagonal principal
	System.out.println("\nDiagonal principal");
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
			if(i==j){
                        System.out.print(matriz[i][j] + " ");
			}		
			else{
                        System.out.print("(-)");
			}
		}
	System.out.println("\n");
	}
	
	
	//Promedio de matriz
	double promedio = suma/(fila*columna);
	System.out.println("El promedio de la matriz es: "+ promedio);
	
	//Promedio de la diagonal principal
	double promedio2 = suma2/elementos;
	System.out.println("\nEl promedio de la diagonal principal es: " + promedio2);
        
        
    }
    
}
