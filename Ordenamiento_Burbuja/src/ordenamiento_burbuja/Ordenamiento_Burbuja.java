package ordenamiento_burbuja;

import java.util.Scanner;

public class Ordenamiento_Burbuja {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
		int[] arr = {10,2,13,24,15};

    System.out.println("Vector Desordenado:");                                
		for (int i=0;i<5;i++)//Impresion de arreglo
		{
      System.out.println(arr[i]);
		}
                
    int aux;//Para intercambio de valores
                
    for(int j=0; j<5-1; j++){//Ordenamiento Burbuja
        for(int k=0; k<5-1;k++){
        if(arr[j]>arr[j+1]){
        aux = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = aux;
        }
      }
    }
                
    System.out.println("Vector Ordenado:");  
    for (int j=0;j<5;j++)//Impresion de arreglo ordenado
		{
      System.out.println(arr[j]);
		}
        
        
    }
    
}
