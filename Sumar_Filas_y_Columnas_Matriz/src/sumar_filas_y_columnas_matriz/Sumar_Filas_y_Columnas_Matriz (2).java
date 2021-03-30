package sumar_filas_y_columnas_matriz;

import java.util.Scanner;

public class Sumar_Filas_y_Columnas_Matriz {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int [100][100];
        
        double fila, columna;
	
	System.out.println("\n¿Cuantas filas desea?:");
        fila = entrada.nextDouble();
        
	System.out.println("\n¿Cuantas columnas desea?:");
        columna = entrada.nextDouble();
	
	System.out.println("\n");
	
	//Llenar matriz
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
                System.out.println("Digite un numero para" + "[" + i + "]" + "[" + j + "]:");
                matriz[i][j] = entrada.nextInt();

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
	
	
	
	
	//Suma de las filas de matriz
	for(int i=0; i<fila; i++){
        int sumaFila = 0;
            for(int j=0; j<columna; j++){
              sumaFila += matriz[i][j];
            }
            System.out.println("La suma de la fila [" + (i+1) + "] es: " + sumaFila);
        }

         System.out.println("\n");

        //Suma de las columnas de matriz
	for(int j=0; j<columna; j++){
        int sumaColumna = 0;
            for(int i=0; i<fila; i++){
              sumaColumna += matriz[i][j];
            }
            System.out.println("La suma de la columna [" + (j+1) + "] es: " + sumaColumna);
        }
        
    }
    
}
