package datos_de_un_alumno;

import java.util.Scanner;  //Para guardar datos
import javax.swing.JOptionPane;  //Para JOptionPane

public class Datos_de_un_alumno {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Datos de un alumno en Consola
        
        int edad;
        String nombre;
        String apellido;
        String rfc;
        
        System.out.println("Digite su edad: ");
        edad = entrada.nextByte();
        entrada.skip("\n");  //Se debe a que la posición de lectura está justo después de un salto de linea, lo que te retornara una cadena vacia. Se recomienda poner esto despues de leer cualquier numero.
        System.out.println("Digite su nombre");
        nombre = entrada.nextLine();
        System.out.println("Digite su apellido");
        apellido = entrada.nextLine();
        System.out.println("Digite su rfc");
        rfc = entrada.nextLine();
        
        System.out.println("\nLa edad es: " + edad);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El rfc es: " + rfc);
        
        
        /*
        //Datos de un alumno en JOptionPane
        
        int edad1;
        String nombre1;
        String apellido1;
        String rfc1;
        
        
        edad1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        nombre1 = JOptionPane.showInputDialog("Digite su nombre: ");
        apellido1 = JOptionPane.showInputDialog("Digite su apellido: ");
        rfc1 = JOptionPane.showInputDialog("Digite su rfc: ");
        
        JOptionPane.showMessageDialog(null, "La edad es: " + edad1);
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre1);
        JOptionPane.showMessageDialog(null, "El apellido es: " + apellido1);
        JOptionPane.showMessageDialog(null, "El rfc es: " + rfc1);
        */
        
    }
    
}
