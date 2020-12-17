package edad_actual;

import java.util.Scanner;

public class Edad_Actual 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int anio_nacimiento, anio_actual, edad_actual;
        
        System.out.print("Digite el año actual: ");
        anio_actual = entrada.nextInt();
        System.out.print("Digite su año de nacimiento: ");
        anio_nacimiento = entrada.nextInt();
        
        //Calculo de edad 
        edad_actual = anio_actual-anio_nacimiento;
        
        System.out.println("\nSu edad actual es: " + edad_actual);
        
    }
    
}
