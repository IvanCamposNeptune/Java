package tabla_numero;

import java.util.Scanner;

public class Tabla_Numero {

    public static void tabla(int num){
      System.out.println("\tTabla del " + num);
      for(int i=0;i<10;i++){
          int resultado = 0;
          resultado = (num * (i+1));
          System.out.println(num + " X " + (i+1) + " = " + resultado);
      }  
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int opc;
        boolean bandera = true;

        do{          
            
        System.out.println("\tTabla de un numero");
        
        System.out.println("Digita un numero: ");
        numero = entrada.nextInt();
        
        tabla(numero);
        
            System.out.println("Deseas mostrar otra tabla? 1.-Si  2.-No");
            opc = entrada.nextInt();
            if(opc==2){
                bandera=false;
            }

        }while(bandera==true);

       
        
        
    }
    
}
