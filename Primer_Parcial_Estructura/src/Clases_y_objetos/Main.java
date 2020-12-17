package Clases_y_objetos;

import java.util.*; //Arraylist y Scanner
import javax.swing.JOptionPane;

public class Main {
    
    
    
    public static void main(String [] args) //Metodo main
    {   
        Scanner entrada = new Scanner (System.in);//Variable de lectura tipo Scanner
        
        //Variables para paso de parametros por valor
        String nombre = "";
        String apellido_paterno = "";
        String apellido_materno = "";
        String rfc = "";
        int anio_ingreso = 0;     
        
        
        
        //Variables del arreglo
        int n=0;
        
        System.out.println("Digite el numero de empleados que va a registrar: ");
        n = entrada.nextInt();
        
        
        Empleado e[] = new Empleado[n];//Arreglo de objetos

        entrada.nextLine();//Limpiador de buffer
                
            System.out.println("\n");
            System.out.println("\tIngresar datos de empleados");
            for(int i=0; i<n; i++)//Almacenar datos
            {
            System.out.println("\nEscriba el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Escriba el apellido paterno: ");
            apellido_paterno = entrada.nextLine();
            System.out.println("Escriba el apellido materno: ");
            apellido_materno = entrada.nextLine();
            System.out.println("Escriba el rfc: ");
            rfc = entrada.nextLine();
            System.out.println("Escriba el año de ingreso: ");
            anio_ingreso = entrada.nextInt();
            
            entrada.nextLine();//Limpiador de buffer
            
            Empleado actual = new Empleado(nombre,apellido_paterno,apellido_materno,rfc,anio_ingreso);//Mandando los datos a la sobrecarga del constructor
            
            e[i] = actual;//Almacenando todos los datos del objeto en el arreglo
            
            }
            
            System.out.println("\n");
            System.out.println("\nEnlistar datos como fueron Ingresados");
            for(int i=0; i<n; i++)//Mostrar datos
            {
                System.out.println("\nNombre del empleado " + i + ": " + e[i].getNombre());  
                System.out.println("Apellido paterno del empleado " + i + ": " + e[i].getApellidoP());
                System.out.println("Apellido materno del empleado " + i + ": " + e[i].getApellidoM());
                System.out.println("Rfc del empleado " + i + ": " + e[i].getRfc());
                System.out.println("Año de ingreso del empleado " + i + ": " + e[i].getAnio());
            }
            
            
            System.out.println("\n");
            System.out.println("\nEnlistar datos ordenados por año de ingreso");
            for(int i=0; i<n-1; i++)
            {
                for(int j=0; j<n-1; j++)
                {
                    if(e[j].getAnio()>e[j+1].getAnio())
                    {
                       Empleado aux = new Empleado();
                       aux = e[j];
                       e[j] = e[j+1];
                       e[j+1] = aux;
                    }
                }
            }
            
            for(int i=0; i<n; i++)//Mostrar datos ordenados por año
            {
                System.out.println("\nNombre del empleado " + i + ": " + e[i].getNombre());  
                System.out.println("Apellido paterno del empleado " + i + ": " + e[i].getApellidoP());
                System.out.println("Apellido materno del empleado " + i + ": " + e[i].getApellidoM());
                System.out.println("Rfc del empleado " + i + ": " + e[i].getRfc());
                System.out.println("Año de ingreso del empleado " + i + ": " + e[i].getAnio());
            }
            
            
            
            System.out.println("\n");
            System.out.println("\nEnlistar datos ordenados por rfc");
            for(int i=0; i<n-1; i++)
            {
                for(int j=0; j<n-1; j++)
                {
                    if(e[j].getRfc().charAt(0)>e[j+1].getRfc().charAt(0))
                    {
                       Empleado aux = new Empleado();
                       aux = e[j];
                       e[j] = e[j+1];
                       e[j+1] = aux;
                    }
                }
            }
            
            for(int i=0; i<n; i++)//Mostrar datos ordenados por rfc
            {
                System.out.println("\nNombre del empleado " + i + ": " + e[i].getNombre());  
                System.out.println("Apellido paterno del empleado " + i + ": " + e[i].getApellidoP());
                System.out.println("Apellido materno del empleado " + i + ": " + e[i].getApellidoM());
                System.out.println("Rfc del empleado " + i + ": " + e[i].getRfc());
                System.out.println("Año de ingreso del empleado " + i + ": " + e[i].getAnio());
            }
            
            
            
            
            System.out.println("\n");
            System.out.println("\nEnlistar datos ordenados por apellidos y nombre");
            for(int i=0; i<n-1; i++)
            {
                for(int j=0; j<n-1; j++)
                {
                    if(e[j].getApellidoP().charAt(0)>e[j+1].getApellidoP().charAt(0))
                    {
                       Empleado aux = new Empleado();
                       aux = e[j];
                       e[j] = e[j+1];
                       e[j+1] = aux;
                    }
                }
            }
            
            for(int i=0; i<n-1; i++)
            {
                for(int j=0; j<n-1; j++)
                {
                    if(e[j].getApellidoM().charAt(0)>e[j+1].getApellidoM().charAt(0))
                    {
                       Empleado aux = new Empleado();
                       aux = e[j];
                       e[j] = e[j+1];
                       e[j+1] = aux;
                    }
                }
            }
            
            for(int i=0; i<n-1; i++)
            {
                for(int j=0; j<n-1; j++)
                {
                    if(e[j].getNombre().charAt(0)>e[j+1].getNombre().charAt(0))
                    {
                       Empleado aux = new Empleado();
                       aux = e[j];
                       e[j] = e[j+1];
                       e[j+1] = aux;
                    }
                }
            }
            
            
            for(int i=0; i<n; i++)//Mostrar datos ordenados por Apellidos y nombre
            {
                System.out.println("\nNombre del empleado " + i + ": " + e[i].getNombre());  
                System.out.println("Apellido paterno del empleado " + i + ": " + e[i].getApellidoP());
                System.out.println("Apellido materno del empleado " + i + ": " + e[i].getApellidoM());
                System.out.println("Rfc del empleado " + i + ": " + e[i].getRfc());
                System.out.println("Año de ingreso del empleado " + i + ": " + e[i].getAnio());
            }
            
            System.out.println("\n");
            System.out.println("\tBusqueda por rfc");
            
            System.out.println("\nEscriba el rfc a buscar: ");
            String rfcB = entrada.nextLine();
            
            for(int i=0; i<n; i++)
                {
                    if(rfcB.equals(e[i].getRfc()))
                    {
                        System.out.println("\nNombre del empleado " + i + ": " + e[i].getNombre());  
                        System.out.println("Apellido paterno del empleado " + i + ": " + e[i].getApellidoP());
                        System.out.println("Apellido materno del empleado " + i + ": " + e[i].getApellidoM());
                        System.out.println("Rfc del empleado " + i + ": " + e[i].getRfc());
                        System.out.println("Año de ingreso del empleado " + i + ": " + e[i].getAnio());
                        break;
                    }
                    else
                    {
                        System.out.println("No se encontro " + rfcB);
                    }
                }
            
            
            
            
            
            
            
            
    }
    
}
