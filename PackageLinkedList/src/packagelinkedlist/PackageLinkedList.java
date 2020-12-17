package packagelinkedlist;

import clases.Persona;//Importando Clase persona
import java.util.Collections;//Para ordenar el LinkedList
import java.util.LinkedList;//Biblioteca de LinkedList
import java.util.Scanner;

public class PackageLinkedList 
{   
    
    /*
        Metodos nativos del Package LinkedList
    add - Introducir un dato a la lista. Tambien se puede agregar un dato a un indice especifico
    lista.add(INDICE,DATO); y si se agrega un dato en un indice que ya tiene un valor,
    el dato en vez de sobreescribirse y perderse, se recorre y los datos siguientes tambien se recorren una posicion.
    pero no puede agregarse a un indice que no tenga un valor de un dato aún, mas que en la posicion 0 ya que es la primera.
    size - numero de elementos que tiene la lista
    get - Consultar el dato en el indice indicado lista.get(INDICE);
    isEmpty - Valida si tiene datos la cola
    */
    

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
    int entero, tipo, opc1, opc2, index;
    double decimal;
    char caracter;
    String cadena;
        
        
        /*
            LinkedList es una lista enlazada en la cual se pueden guardar un indefinido numero de datos.
        Depende de la memoria disponible del equipo en el que se trabaje.
        */
        
        LinkedList lista = new LinkedList(); //Creando un objeto de tipo LinkedList 
        
                  
            do
            {
                
                System.out.print("\nQue tipo de dato deseas ingresar... " + "\n1.-Entero" + "\n2.-Decimal" + "\n3.-Caracter" + "\n4.-Cadena" + "\n: ");
                tipo = entrada.nextInt();
                entrada.nextLine();//Limpiador de buffer 
                
                    switch(tipo)
                    {
                    case 1:
                        System.out.print("\nIngresa el dato entero: ");
                        entero = entrada.nextInt();
                        System.out.print("\nLo quieres en un indice especifico? " + "\n1.-Si" + "\n2.-No" + "\n: ");
                        opc1 = entrada.nextInt();
                        if(opc1==1)
                        {
                            System.out.print("\nDigite el indice: ");
                            index = entrada.nextInt();
                            lista.add(index,entero);
                        }
                        else if(opc1==2)
                        {
                            lista.add(entero);
                        }     
                        break;
                    case 2:
                        System.out.print("\nIngresa el dato decimal: ");
                        decimal = entrada.nextDouble();
                        System.out.print("\nLo quieres en un indice especifico? " + "\n1.-Si" + "\n2.-No" + "\n: ");
                        opc1 = entrada.nextInt();
                        if(opc1==1)
                        {
                            System.out.print("\nDigite el indice: ");
                            index = entrada.nextInt();
                            lista.add(index,decimal);
                        }
                        else if(opc1==2)
                        {
                            lista.add(decimal);
                        }    
                        break;
                    case 3:
                        System.out.print("\nIngresa el dato caracter: ");
                        caracter = entrada.next().charAt(0);
                        System.out.print("\nLo quieres en un indice especifico? " + "\n1.-Si" + "\n2.-No" + "\n: ");
                        opc1 = entrada.nextInt();
                        if(opc1==1)
                        {
                            System.out.print("\nDigite el indice: ");
                            index = entrada.nextInt();
                            lista.add(index,caracter);
                        }
                        else if(opc1==2)
                        {
                            lista.add(caracter);
                        }    
                        break;
                    case 4:
                        System.out.print("\nIngresa el dato cadena: ");
                        cadena = entrada.nextLine();
                        System.out.print("\nLo quieres en un indice especifico? " + "\n1.-Si" + "\n2.-No" + "\n: ");
                        opc1 = entrada.nextInt();
                        if(opc1==1)
                        {
                            System.out.print("\nDigite el indice: ");
                            index = entrada.nextInt();
                            lista.add(index,cadena);
                        }
                        else if(opc1==2)
                        {
                            lista.add(cadena);
                        }    
                        break;
                    default: System.out.println("\nNo ingreso una opcion valida...");
                        break;
                    }
                
                    System.out.print("\nDeseas ingresar otro dato? " + "\n1.-Si" + "\n2.-No" + "\n: ");
                    opc2 = entrada.nextInt();
                    
                    if(opc2==1)
                    {
                        System.out.println("Sigamos...");
                    }
                    else if (opc2==2)
                    {
                        break;
                    }
            }while(opc2==1);
            
            
            //Mostrar datos de la lista
            System.out.println("\nDatos de la lista:");
            for(int i=0; i<lista.size(); i++)
            {
                System.out.println(lista.get(i));
            }
            
            
            //Metodo de ordenacion de un LinkedList
            
            System.out.println("\nOrdenando un LinkedList con Comparable/compareTo/Collections " + "\n");
            

            Persona p1 = new Persona("Ivan","Campos",3);
            Persona p2 = new Persona("Gaby","Campos",2);
            Persona p3 = new Persona("Laura","Campos",1);
            Persona p4 = new Persona("Elena","Hernandez",4);
            Persona p5 = new Persona("Tereza","Ortega",5);
            
            LinkedList<Persona> personas = new LinkedList<Persona>(); //Objeto LinkedList de tipo Persona

            //Añadiendo al linkedList los objetos de clase Persona
            personas.add(p1);
            personas.add(p2);
            personas.add(p3);
            personas.add(p4);
            personas.add(p5);
            
            Collections.sort(personas);//Ordenando el LinkedList con respecto a el Id
            
            for(Persona elemento : personas)//Foreach para mostrar los datos
            {
                System.out.println(elemento);
            }
            
        
        
    }
    
}
