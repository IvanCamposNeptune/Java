package packagestack;

import java.util.Scanner;
import java.util.Stack; //Biblioteca de Pilas

public class PackageStack 
{
    
    /*
        Metodos nativos del Package Stack
    push - Introducir un dato a la pila
    pop - Quita el ultimo dato que se introdujo a la pila
    peek - Consultar cual es el ultimo dato que se introdujo a la pila
    empty - Valida si tiene datos la pila
    */
    
    

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
    int datos, entero, tipo=0;
    double decimal;
    char caracter;
    String cadena;
        
        
        //FILO (First-In,Last-Out)
        
        Stack pila = new Stack(); //Creando un objeto de tipo pila
        
        System.out.println("Cuantos objetos deseas introducir a la pila? ");
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
                        pila.push(entero);    
                        break;
                    case 2:
                        System.out.print("\nIngresa el dato decimal " + (i+1) + ": ");
                        decimal = entrada.nextDouble();
                        pila.push(decimal);
                        break;
                    case 3:
                        System.out.print("\nIngresa el dato caracter " + (i+1) + ": ");
                        caracter = entrada.next().charAt(0);
                        pila.push(caracter);
                        break;
                    case 4:
                        System.out.print("\nIngresa el dato cadena " + (i+1) + ": ");
                        cadena = entrada.nextLine();
                        pila.push(cadena);
                        break;
                    default: System.out.println("\nNo ingreso una opcion valida...");
                        tipo = 0;
                        break;
                    }
                }
                
            }while(tipo == 0);
            
            
            //Mostrar datos de la pila
            System.out.println("\nDatos de la pila:");
            while(pila.empty()==false) //Mientras que no este vacia
            {
                System.out.println(pila.pop());//Sacando el ultimo elemento de la pila
            }
            
            //La funcion peek solo es para ver cual es la cima de la pila.
            
            
            
    }
    
}
            
            
            
        
        
        
    
    

