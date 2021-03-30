package area_figuras;

import java.util.Scanner;

public class Area_Figuras {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Declaracion de variable
        int opcion;
        
        
        System.out.println("\tArea de figuras");
        System.out.println("\n1.-Triangulo \n2.-Circulo \n3.-Cuadrado");
        
        System.out.println("\nEliga una opcion: ");
        opcion = entrada.nextInt();
        
        switch(opcion){
        
            case 1:
                double base, altura, area;
                System.out.println("Digite la base del triangulo: ");
                base = entrada.nextDouble();
                System.out.println("Digite la altura del triangulo: ");
                altura = entrada.nextDouble();
                
                //Calculo de area de triangulo
                area = (base*altura)/2;
                
                //Impresion de area
                System.out.println("\nEl area del triangulo es: " + area);
            break;
                
            case 2:
                double radio, area2;
                System.out.println("Digite el radio del circulo: ");
                radio = entrada.nextDouble();
                
                //Calculo de area de triangulo
                area2 = Math.pow((3.1416*radio),2);
                
                //Impresion de area
                System.out.println("\nEl area del circulo es: " + area2);
            break;
                                
            case 3:
                double base3, altura3, area3;
                System.out.println("Digite la base del cuadrado: ");
                base3 = entrada.nextDouble();
                System.out.println("Digite la altura del cuadrado: ");
                altura3 = entrada.nextDouble();
                
                //Calculo de area de triangulo
                area3 = base3*altura3;
                
                //Impresion de area
                System.out.println("\nEl area del cuadrado es: " + area3);
            break;
        
            default: System.out.println("Opcion no valida...");
            
            break;
                      
        }
        
        
    }
    
}
