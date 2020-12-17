package sueldo_trabajador;

import java.util.Scanner;//Para guardar datos

public class Sueldo_Trabajador {

    public static void main(String[] args) {
       //Sueldos de un trabajador menos iva (16%)
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre, rfc;
        double sueldo, sueldo_iva, sueldo_total;
        
        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su rfc: ");
        rfc = entrada.nextLine();
        
        System.out.println("Digite su sueldo: ");
        sueldo = entrada.nextDouble();
                
        //Calcular sueldo bruto, impuesto retenido y salario total.
        
        sueldo_iva = sueldo-(sueldo-(sueldo*.16)); //Iva
        
        sueldo_total = sueldo-(sueldo*.16); //Sueldo total
        
        
        System.out.println("\nEl nombre del trabajador es: " + nombre);
        System.out.println("El rfc del trabajador es: " + rfc);
        System.out.println("El sueldo bruto del trabajador es: " + sueldo);
        System.out.println("El impuesto retenido del sueldo del trabajador es: " + sueldo_iva);
        System.out.println("El sueldo total del trabajador es: " + sueldo_total);
        
        
        
    }
    
}
