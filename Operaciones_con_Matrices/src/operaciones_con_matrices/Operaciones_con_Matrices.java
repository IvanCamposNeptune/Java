package operaciones_con_matrices;

import java.util.Scanner;

public class Operaciones_con_Matrices {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[][] matriz = new int[100][100];     
        int opc = 0, bandera=0;
        
        //Menu de opciones
        do{
            
            System.out.println("\tMenu de opciones de operaciones con matrices");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Traspuesta");
            System.out.println("Elige una opcion: ");
            
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("\tSumar");
                    
                    
        int matriz2[][] = new int [100][100];
        int Suma[][] = new int [100][100];
        
        double fila, columna;
	
	System.out.println("\nCuantas filas desea?:");
        fila = entrada.nextDouble();
        
	System.out.println("\nCuantas columnas desea?:");
        columna = entrada.nextDouble();
	
	System.out.println("\n");
	
        System.out.println("\tLlenado de la matriz 1");
        
	//Llenar matriz 1
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
                System.out.println("Digite un numero para" + "[" + i + "]" + "[" + j + "]:");
                matriz[i][j] = entrada.nextInt();		
		}
	}
	
	System.out.println("\n");
	
	//Mostrar matriz 1
	System.out.println("\nMatriz 1");
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
		System.out.print(matriz[i][j] + " ");
		}
	System.out.println("\n");
	}
	
	
        System.out.println("\tLlenado de la matriz 2");
        
        //Llenar matriz 2
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
                System.out.println("Digite un numero para" + "[" + i + "]" + "[" + j + "]:");
                matriz2[i][j] = entrada.nextInt();		
		}
	}
	
	System.out.println("\n");
	
	//Mostrar matriz 2
	System.out.println("\nMatriz 2");
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
		System.out.print(matriz2[i][j] + " ");
		}
	System.out.println("\n");
	}
	
        
        //Suma de matrices 
  	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
                Suma[i][j] = (matriz[i][j]+matriz2[i][j]);
		}
	}


  //Mostrar suma
	System.out.println("\tSuma");
	for(int i=0; i<fila; i++){
		for(int j=0; j<columna; j++){
		System.out.print(Suma[i][j] + " ");
		}
	System.out.println("\n");
	}
                break;
                
                case 2:
                    System.out.println("\tRestar");
                    
                    
                break;
                
                case 3:
                    System.out.println("\tMultiplicar");
                break;
                
                case 4:
                    System.out.println("\tDividir");
                break;
                
                case 5:
                    System.out.println("\tTranspuesta");
                break;
                    
                default:
                    System.out.println("No eligio una opcion valida...");
                    break;
            }
                try{
                   System.out.println("Deseas elegir otra opcion? Si(1) / No(0): "); 
                bandera = entrada.nextInt(); 
                }catch(Exception e){
                    System.out.println("No eligio una opcion valida Error:" + e);
                }
                
                
      
            
        }while(bandera!=0);
        
        
    }
    
}
