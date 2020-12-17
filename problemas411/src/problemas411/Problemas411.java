package problemas411;

import java.util.Scanner; //Biblioteca para funcion de lectura

public class Problemas411 {

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); //Definicion de variable de lectura
        
       
        //Declaracion de variables        
        int num1 = 10, num2 ,paso, mult2;
               
        //Ejercicio 4.4
        //Introduccion de valores       
        
        System.out.println("4.4 Multiplicacion del primer numero X 2");
        
        System.out.println("\nDigita el primer valor: ");
        
        num1 = entrada.nextInt(); //Lectura de entero
        
        System.out.println("\nDigita el segundo valor: "); 
        
        num2 = entrada.nextInt(); //Lectura de entero
        
        //Numero1 x 2
        mult2 = num1*2;
        
        System.out.println("\nNum1 = " + num1 + " Num2 = " + num2);
               
        System.out.println("\nLa multiplicacion de el primer numero X 2 es = " + num1 + " X 2 = " + (mult2) );
        
        //Ejercicio 4.5
        System.out.println("\n4.5 Intercambiar posicion de dos valores");
        
        int posicion1=num1, posicion2=num2;
        
        System.out.println("Posicion 1 = " + posicion1 + " Posicion 2 = " + posicion2);
        
        
        paso = posicion1; //Guardando el valor de la posicion 1
        
        posicion1 = posicion2; //asignando el valor de la posicion 2 a la posicion 1
        
        posicion2 = paso; //Asignando a la posicion 2 el valor de Paso, paso vale lo que la posicion 1
                
        
        System.out.println("\nIntercambio de posicion... Posicion 1 = " + posicion1 + " Posicion 2 = " + posicion2);
        
        
        //4.6
        
        //Declaracion de variables
        
        int division, modular, opcion;
        
        do{
       
        System.out.println("\n4.6 Division y modular de 2 valores (Con opcion de realizarlo con diferentes valores)");
                    
                    //Introduccion de valores        
        System.out.println("\nDigita el primer valor: ");
        
        num1 = entrada.nextInt(); //Lectura de entero
        
        System.out.println("\nDigita el segundo valor: "); 
        
        num2 = entrada.nextInt(); //Lectura de entero
        
        //Operaciones
        
        //Division
        division = num1/num2;
                
        //Modular
        modular = num1%num2;
        
        
        //Operaciones en pantalla
        
            System.out.println("\nLa division del numero1/numero2: " + num1 + "/" + num2 + " = " + division);
            
            System.out.println("\nEl modular del numero1%numero2: " + num1 + "%" + num2 + " = " + modular);
        
        
        
        //Preguntar si quiere realizarlo de nuevo    
        
            System.out.println("\nSi=1 \nNo=2 \n¿Deseas realizarlo de nuevo con otros numeros? = ");
            
            opcion = entrada.nextInt();
        
        
        
        }while(opcion==1);
        
        
        //4.7
        //Longitud y anchura de una habitacion para ver su superficie
        
        System.out.println("\n4.7 Longitud y anchura de una habitacion para ver su superficie");
        
        //Declaracion de variables
        
        float longuitud, ancho, igual;
        System.out.println("\nIngresar medida de la longuitud: ");
        longuitud=entrada.nextFloat();
        System.out.println("Ingresar medida del ancho:  ");
        ancho=entrada.nextFloat();
        
        //Calcular superficie
        
        igual=longuitud*ancho;
        
        System.out.println("Tu resultado es:  " + igual);
        
        
        
        //4.8
        //Suma de dos numeros decimales
        //Declaracion de variables
        
        System.out.println("\n4.8 Suma de dos numeros decimales");
        
        
        double valor1, valor2, total;
        
        System.out.println("\nIngrese el primer decimal (Separelo con coma): ");
        valor1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo decimal (Separelo con coma): ");
        valor2 = entrada.nextDouble();
        
        //Resultado de la suma de ambos decimales
        
        total = valor1 + valor2;
        
        System.out.println("La suma de los decimales es: " + total);
        
        
        //4.9
        //Clasificar un entero en distintas categorias
        
        System.out.println("\n4.9 Clasificar un entero en distintas categorias");
        
        //Declaracion de variable
        boolean x=false;
        int entero;
        
        //Definicion de datos
        System.out.println("\nIngrese un numero entero: ");
        entero = entrada.nextInt();
                
        if(entero<0){
            System.out.println("Su entero es menor que 0");
        
        
        }
        if(entero<=entero & entero<=100) {
            System.out.println("Su entero es menor o igual a 100");
        
        }
        if(entero>100) {
            System.out.println("Su entero es mayor que 100");
        
        }
        
        
       //4.10
       //Escribir un programa que introduzca el numero de un mes (1-12) y visualize el numero de sus dias
        
        System.out.println("\n4.10 Escribir un programa que introduzca el numero de un mes (1-12) y visualize el numero de sus dias");
        
        //Declaracion de variables
        
        int opc,ene=31,feb=28,mar=31,abr=30,may=31,jun=30,jul=31,ago=31,sep=30,oct=31,nov=30,dic=31;
        
        System.out.println("1 = Enero \n2 = Febrero \n3 = Marzo \n4 = Abril \n5 = Mayo \n6 = Junio \n7 = Julio \n8 = Agosto \n9 = Septiembre \n10 = Octubre \n11 = Noviembre \n12 = Diciembre");
        System.out.println("Elga uno para mostrarle el numero de sus dias: ");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Enero tiene " + ene + " dias");
                break;
            case 2:
                System.out.println("Febrero tiene " + feb + " dias");
                break;
            case 3:
                System.out.println("Marzo tiene " + mar + " dias");
                break;
            case 4:
                System.out.println("Abril tiene " + abr + " dias");
                break;
            case 5:
                System.out.println("Mayo tiene " + may + " dias");
                break;
            case 6:
                System.out.println("Junio tiene " + jun + " dias");
                break;
            case 7:
                System.out.println("Julio tiene " + jul + " dias");
                break;
            case 8:
                System.out.println("Agosto tiene " + ago + " dias");
                break;
            case 9:
                System.out.println("Septiembre tiene " + sep + " dias");
                break;
            case 10:
                System.out.println("Octubre tiene " + oct + " dias");
                break;
            case 11:
                System.out.println("Noviembre tiene " + nov + " dias");
                break;
            case 12:
                System.out.println("Diciembre tiene " + dic + " dias");
                break;
            
            default:
                System.out.println("No ingreso un numero dentro del rango");
                break;
                
        }
        
        
        
       //4.11
       //Escribir un programa que lea 2 numeros y vizualize el mayor; utilizar el operador ternario ?:
        
        System.out.println("\n4.11 Mayor de dos numeros con ternario");
        
        //Declaracion de variables 
        
        int nu1,nu2,mayor;
        
        System.out.println("\nIngrese el primer valor: ");
        nu1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        nu2 = entrada.nextInt();
        
        mayor = (nu1>nu2)?nu1:nu2;
        
        System.out.println("El mayor es: " + mayor);
        
        
        
        
        
    }
    
}
