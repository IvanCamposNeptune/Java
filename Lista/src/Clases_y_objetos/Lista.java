package Clases_y_objetos;

import java.util.Scanner;

public class Lista {
    int[] a = new int[5];
    int n;
    int cont;
    
    void Lista()
    {
        n=5;
        cont=0;
    }
    
    void mostrar_lista()
    {
        if(cont>0){
            System.out.println("Los datos son: " + "\n");
            
            for(int i=0; i<cont; i++)
            {
            System.out.println(a[i] + " " +"\n");
            }
                   
        }else
        {
            System.out.println("Lista vacia...");
        }
        
        
        
    }
    void mostrar_elemento()
    {
        
    }
    
    void buscar_elemento()
    {
        
    }
    
    void insertar_elemento()
    {
        
    }
    
    void eliminar_elemento()
    {
        
    }
    
    
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Lista lista = new Lista();//Objeto lista de clase Lista
        
        int x=1;
        
        //Menu
        do{
            System.out.println("\tMenu" + "\n1.-Mostrar Lista" + "\n2.-Mostrar elemento" + "\n3.-Buscar elemento");
            
            System.out.println("¿Deseas realizar otra operacion?" + "\n Si=1 2=No: ");
            
            x = entrada.nextInt();
            
        }while(x==1);
        
        //lista.mostrar_lista();
        
        
        
    }
    
}


