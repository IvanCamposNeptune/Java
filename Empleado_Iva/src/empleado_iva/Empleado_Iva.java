package empleado_iva;

import java.util.Scanner;//Para guardar datos

public class Empleado_Iva {

    public static void main(String[] args) {

        //Sueldo de un trabajador menos iva (16%)
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre, rfc;
        double sueldo1, sueiva1;
        
        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su rfc: ");
        rfc = entrada.nextLine();
        
        System.out.println("Digite su Salario: ");
        sueldo1 = entrada.nextDouble();
        
        
        //Sueldo menos el iva
        
        sueiva1 = sueldo1-(sueldo1*.16);
                
        
        //Mostrar datos
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("El rfc es: " + rfc);
                
        System.out.println("\nEl sueldo menos iva (16%) = " + sueiva1);
        
        
    }
    
}
