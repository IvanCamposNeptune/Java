package hipotenusa_triangulo;

import java.util.Scanner;

public class Hipotenusa_Triangulo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double hip,a,b;
        
        System.out.println("\tHipotenusa de un Triangulo");       
        
        System.out.println("\nDigite el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.println("\nDigite el valor de b: ");
        b = entrada.nextDouble();
        
        hip =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("\nEl valor de la hipotenusa es: " + hip);
        
        
    }
    
}
