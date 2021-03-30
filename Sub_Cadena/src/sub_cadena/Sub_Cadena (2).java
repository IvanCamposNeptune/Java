package sub_cadena;

import java.util.Scanner;

public class Sub_Cadena {

    public static void main(String[] args) {
        
        String cadena = "Hola mundo"; //0123456789
        String subcadena;
        
        subcadena=cadena.substring(0,cadena.length()-6); //Esta substrayendo de la cadena original del 0 hasta 9(longitud) - 6
        
        System.out.println("La cadena es: " + cadena);
        
        System.out.println("La subcadena es: " + subcadena);
        
        //Otro ejemplo escogiendo inicio y final
        
        Scanner inp = new Scanner(System.in);
  	System.out.println("\nEscriba la cadena: ");
  	String str = inp.nextLine();
  	System.out.println("Inicio:");
  	int start = inp.nextInt();
  	System.out.println("Fin:");
  	int end = inp.nextInt();
    
        String subcadena2;
        System.out.print("La subcadena de "+str+" desde "+start+" hasta "+end+" es: ");
        System.out.println(subcadena2=str.substring(start,end+1));
        
        
        
    }
    
}
