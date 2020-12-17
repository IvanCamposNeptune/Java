package area_de_cilindro;

import java.util.Scanner;

public class Area_De_Cilindro 
{
      
    public static void main(String[] args) 
    {
        
        Scanner entrada = new Scanner(System.in);
     
        double radio, altura, pi=3.1416, area;
        
        System.out.println("\tCalcular Area de un Cilindro");
        
        System.out.print("\nDigite el Radio: ");
        
        radio = entrada.nextDouble();
        
        System.out.print("\nDigite la Altura: ");
        
        altura = entrada.nextDouble();
        
        //Calculo de area
        
        area = 2*pi*radio*(radio+altura);
        
        System.out.println("\nEl Area del Cilindro es: " + area);
        
    }
    
}
