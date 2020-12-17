package area_de_circulo;

import java.util.Scanner;

public class Area_De_Circulo 
{
    
    public static void main(String[] args) 
    {
     
        Scanner entrada = new Scanner(System.in);
     
        double radio, pi=3.1416, area;
        
        System.out.println("\tCalcular Area de un Circulo");
        
        System.out.print("\nDigite el radio: ");
        
        radio = entrada.nextDouble();
        
        //Calculo de area
        
        area = pi*Math.pow(radio,2);
        
        System.out.println("El Area del Circulo es: " + area);
        
        
    }
    
}
