package area_triangulo;

import java.util.Scanner;

public class Area_Triangulo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double base, altura, area;
                System.out.println("Digite la base del triangulo: ");
                base = entrada.nextDouble();
                System.out.println("Digite la altura del triangulo: ");
                altura = entrada.nextDouble();
                
                //Calculo de area de triangulo
                area = (base*altura)/2;
                
                //Impresion de area
                System.out.println("\nEl area del triangulo es: " + area);
        
    }
    
}
