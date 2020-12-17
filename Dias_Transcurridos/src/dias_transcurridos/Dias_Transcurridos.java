package dias_transcurridos;

import java.util.Scanner;

public class Dias_Transcurridos 
{

    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);
     
        int anio_nacimiento, dias_transcurridos, anio_normal=365, anio_actual;
        
        System.out.println("\tCalcular días transcurridos de una persona desde su nacimiento");
        
        System.out.print("\nDigite su año de nacimiento: ");
        
        anio_nacimiento = entrada.nextInt();
        
        System.out.print("\nDigite el año actual: ");
        
        anio_actual = entrada.nextInt();
        
        //Calculo de area
        
        dias_transcurridos = anio_normal*(anio_actual - anio_nacimiento);
        
        System.out.println("\nLos dias transcurridos desde su nacimiento son: " + dias_transcurridos);
        
    }
    
}
