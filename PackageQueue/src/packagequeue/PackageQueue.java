package packagequeue;

import java.util.LinkedList; //Las colas implementan las listas
import java.util.Scanner;
import java.util.Queue; //Biblioteca de Colas

public class PackageQueue 
{

    /*
        Metodos nativos del Package Queue
    offer - Introducir un dato a la cola
    poll - Quita el primer dato que se introdujo a la cola
    peek - Consultar cual es el primer dato que se introdujo a la cola
    isEmpty - Valida si tiene datos la cola
    */
    
    
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
    int datos, entero, tipo=0;
    double decimal;
    char caracter;
    String cadena;
        
        //FIFO (First-In,First-Out)
        
        Queue cola = new LinkedList(); //Creando un objeto de tipo pila implementando listas
        
        
        System.out.println("Cuantos objetos deseas introducir a la cola? ");
        datos = entrada.nextInt();
        
                  
            do
            {
                for(int i=0; i<datos; i++)
                {  
                System.out.print("\nQue tipo de dato deseas ingresar... " + "\n1.- Entero" + "\n2.-Decimal" + "\n3.-Caracter" + "\n4.-Cadena" + "\n: ");
                tipo = entrada.nextInt();
                entrada.nextLine();//Limpiador de buffer 
                
                    switch(tipo)
                    {
                    case 1:
                        System.out.print("\nIngresa el dato entero " + (i+1) + ": ");
                        entero = entrada.nextInt();
                        cola.offer(entero);
                        break;
                    case 2:
                        System.out.print("\nIngresa el dato decimal " + (i+1) + ": ");
                        decimal = entrada.nextDouble();
                        cola.offer(decimal);
                        break;
                    case 3:
                        System.out.print("\nIngresa el dato caracter " + (i+1) + ": ");
                        caracter = entrada.next().charAt(0);
                        cola.offer(caracter);
                        break;
                    case 4:
                        System.out.print("\nIngresa el dato cadena " + (i+1) + ": ");
                        cadena = entrada.nextLine();
                        cola.offer(cadena);
                        break;
                    default: System.out.println("\nNo ingreso una opcion valida...");
                        tipo = 0;
                        break;
                    }
                }
                
            }while(tipo == 0);
            
            
            //Mostrar datos de la Cola
            System.out.println("\nDatos de la cola:");
            while(cola.isEmpty()==false) //Mientras que no este vacia
            {
                System.out.println(cola.poll());//Sacando el primer elemento de la cola
            }
            
            //La funcion peek solo es para ver cual es el primero de la cola.

        
        
    }
    
}
