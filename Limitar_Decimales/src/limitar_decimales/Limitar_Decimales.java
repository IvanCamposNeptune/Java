package limitar_decimales;

import java.util.Scanner;

import java.text.DecimalFormat;//Para limitar decimales


public class Limitar_Decimales {

    public static void main(String[] args) {
       
        //Datos y promedio de un alumno
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre, apellido;
        int matricula;
        double cal1, cal2, cal3, cal4, cal5, cal6, promedio;
        
               
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Digite su matricula: ");
        matricula = entrada.nextInt();
        
        System.out.println("Digite la Calificacion 1: ");
        cal1 = entrada.nextDouble();
        
        System.out.println("Digite la Calificacion 2: ");
        cal2 = entrada.nextDouble();
        
        System.out.println("Digite la Calificacion 3: ");
        cal3 = entrada.nextDouble();
        
        System.out.println("Digite la Calificacion 4: ");
        cal4 = entrada.nextDouble();
        
        System.out.println("Digite la Calificacion 5: ");
        cal5 = entrada.nextDouble();
        
        System.out.println("Digite la Calificacion 6: ");
        cal6 = entrada.nextDouble();
        
        //Promedio de 6 materias
        
        promedio = (cal1+cal2+cal3+cal4+cal5+cal6)/6;
        
        //Formato para limitar decimales
        DecimalFormat formato1 = new DecimalFormat("#.00");
        
        System.out.println("\nEl nombre del alumno es: " + nombre);
        System.out.println("El apellido del alumno es: " + apellido);
        System.out.println("La matricula del alumno es: " + matricula);
        System.out.println("El promedio del alumno es: " + formato1.format(promedio));  //Aplicamos formato para 2 decimales.
        
        
    }
    
}
