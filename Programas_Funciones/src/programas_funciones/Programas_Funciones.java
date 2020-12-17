package programas_funciones;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Programas_Funciones {            
    
    public static void tabla(int num){//Tabla de un numero
      System.out.println("\tTabla del " + num);
      for(int i=0;i<10;i++){
          int resultado = 0;
          resultado = (num * (i+1));
          System.out.println(num + " X " + (i+1) + " = " + resultado);
      }  
    }
    
    
    public static void areas(){
        Scanner entrada = new Scanner(System.in);
        int opc1;
                    System.out.println("\tAreas de figuras");
                    System.out.println("1.-Cuadrado/Rectangulo" + "\n2.-Triangulo" + "\n3.-Circulo");
                    System.out.println("Elige una opcion: ");
                    opc1 = entrada.nextInt();
                    
                    switch(opc1){
                        
                        case 1:
                            System.out.println("\tCuadrado/Rectangulo");
                            System.out.println("Digita la base: ");
                            int base = entrada.nextInt();
                            System.out.println("Digita la altura: ");
                            int altura = entrada.nextInt();
                            
                            System.out.println("El area de la figura es: " + (base*altura));
                            
                            break;
                            
                        case 2:
                            System.out.println("\tTriangulo");
                            System.out.println("Digita la base: ");
                            int base2 = entrada.nextInt();
                            System.out.println("Digita la altura: ");
                            int altura2 = entrada.nextInt();
                            
                            System.out.println("El area de la figura es: " + ((base2*altura2)/2) );
                            
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("\tCirculo");
                            System.out.println("Digita el radio: ");
                            int radio = entrada.nextInt();
                            
                            System.out.println("El area del circulo es: " + pow((3.1416*radio) , 2) );
                            
                            break;
                            
                        default:
                            System.out.println("No eligio una opcion valida...");
                            break;
        
                    }
    }
    
    
    public static int calculadora(int x, int y){
        Scanner entrada = new Scanner(System.in);
        
        int resultado=0, opc;
        System.out.println("\tOperaciones");
        System.out.println("1.-Suma" + "\n2.-Resta" + "\n3.-Multiplicacion" + "\n4.-Division");
        System.out.println("Elige una opcion: ");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                System.out.print("La suma es: ");
                resultado=(x+y);
                break;
            case 2:
                System.out.print("La resta es: ");
                resultado=(x-y);
                break;
            case 3:
                System.out.print("La multiplicacion es: ");
                resultado=(x*y);
                break;
            case 4:
                System.out.print("La division es: ");
                resultado=(x/y);
                break;
            default:
                break;
        }
        
        return(resultado);
    }
    
    
    

    public static void main(String[] args) {
        
        try{
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, opc, otra;
        boolean bandera = true;

        do{
            System.out.println("\n");
            System.out.println("\tMenu");
            System.out.println("1.-Tabla de un numero" + "\n2.-Area de figuras" + "\n3.-Calculadora");
            
            System.out.println("Eliga una opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                
                case 1://Tablas
                    
                    System.out.println("\tTabla de un numero");
        
                    System.out.println("Digita un numero: ");
                    
                    numero = entrada.nextInt();
        
                    tabla(numero);
                    
                    break;
                    
                case 2:// Areas de figuras
                    
                    areas();
  
                    break;
                    
                case 3://Calculadora
                    System.out.println("\tCalculadora");
                    
                    System.out.println("Ingresa el primer numero: ");
                    int x = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero: ");
                    int y = entrada.nextInt();
                    
                    System.out.println(calculadora(x,y));
                    
                    break;
                    
                default:
                    System.out.println("Noma");
                    break;    
                    
            }
   
        System.out.println("Deseas elegir otra opcion? Si-1 o No-2 ");
        opc = entrada.nextInt();
        
        if(opc==2){
            bandera=false;
        }

          

        }while(bandera==true);

        
        }catch(Exception e){
            System.out.println("No eligio una opcion valida...");
            
        }
        
        
    }
    
}
