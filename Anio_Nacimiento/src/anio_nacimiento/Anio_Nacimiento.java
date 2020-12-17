package anio_nacimiento;

import java.util.Scanner;

public class Anio_Nacimiento 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int anio_nacimiento, anio_actual = 2020, edad_actual;
        
        System.out.println("\t Año de nacimiento con solo la edad para el año 2020");
        System.out.print("\nDigite su edad: ");
        edad_actual = entrada.nextInt();
        
        //Calculo año de nacimiento 
        anio_nacimiento = anio_actual-edad_actual;
        
        System.out.println("\nSu año de nacimiento es: " + anio_nacimiento);
        
    }
    
}
