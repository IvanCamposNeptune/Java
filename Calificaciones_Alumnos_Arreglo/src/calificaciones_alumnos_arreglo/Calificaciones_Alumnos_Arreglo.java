package calificaciones_alumnos_arreglo;

import java.util.Scanner;

public class Calificaciones_Alumnos_Arreglo {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    String[] alumnos = new String[50];
    String[] materias = {"uno","dos","tres","cuatro","cinco","seis"};
    int[] promedio = new int[50];

    int alumno;

    System.out.println("Cuantos alumnos desea ingresar?: ");
    alumno = entrada.nextInt();
        
    for(int i=0; i<alumno; i++){
        entrada.nextLine();//Limpiamos buffer de entrada
        int prom = 0;
        System.out.println("\nEscribe el nombre del alumno " + (i+1) + ": ");
        alumnos[i] = entrada.nextLine();
        
        for(int j=0; j<6; j++){
        System.out.println("Escribe la calificacion de  " + materias[j] + ": ");
        prom += entrada.nextInt();
    }
        promedio[i] = (prom/6);
    }
    
    
    
    for(int i=0; i<alumno; i++){
        System.out.println("El alumno " + alumnos[i] + " tiene un promedio de: " + promedio[i]);
    }
        
        
    }
    
}
