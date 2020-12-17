package entrada_salida_de_datos_en_consola;

import java.util.Scanner;  //Se importa la biblioteca para que reconozca la funcion Scanner.

public class Entrada_Salida_De_Datos_En_Consola {

    public static void main(String[] args) {
        
        //Para guardar datos que el usuario digite.
        Scanner entrada = new Scanner(System.in);
        
        //LECTURA DE NUMERO ENTERO
        int numero;
        
        System.out.println("Digite un numero entero: ");
        numero = entrada.nextInt(); //(Nombre de la funcion tipo Scanner).next(TIPO DE DATO); Para que lea el numero.
        
        System.out.println("El numero es: " + numero);
        
        //LECTURA DE NUMERO DECIMAL 
        
        //Tipo float
        float numero1;
        
        System.out.println("Digite un numero decimal: ");  //¡OJO! No acepta punto (.), se tiene que poner coma (,) para separar decimales.
        numero1 = entrada.nextFloat(); //(Nombre de la funcion tipo Scanner).next(TIPO DE DATO); Para que lea el numero.
        
        System.out.println("El numero es: " + numero1);
        
        //Tipo double
        double numero2;
        System.out.println("Digite un numero decimal: ");  //¡OJO! No acepta punto (.), se tiene que poner coma (,) para separar decimales.
        numero2 = entrada.nextDouble();  //(Nombre de la funcion tipo Scanner).next(TIPO DE DATO); Para que lea el numero.
        
        System.out.println("El numero es: " + numero2);
        entrada.skip("\n");  //Se debe a que la posición de lectura está justo después de un salto de linea, lo que te retornara una cadena vacia. Se recomienda poner esto despues de leer cualquier numero.
        
        //LECTURA DE CADENA
        
        String cadena;
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();  //Si solo se pusiera next, leeria la cadena hasta donde encuentre un espacio. Cuando es nextLine lee todo hasta con espacios.
        
        System.out.println("La cadena es: " + cadena);

        //LECTURA DE CARACTER
        
        char letra;
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);  //Si solo se pusiera next, leeria la cadena hasta donde encuentre un espacio. Cuando es nextLine lee todo hasta con espacios.
                              //CharAt 0 guarda el primer caracter que encuentre en caso de que se escriba una cadena. 0 indica posicion. 
        System.out.println("La letra es: " + letra);
        
        
    }
    
}
