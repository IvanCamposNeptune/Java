package cadena_a_arreglo_char;

public class Cadena_a_Arreglo_Char {

    public static void main(String[] args) {
       
    String str = "Ivan Campos";

    
    char[] str1 = str.toCharArray(); //Asi se puede imprimir cada una de las posiciones de la cadena, de modo string no se puede.
  
    
    System.out.print(str1[5]);
    System.out.print(str1[6]);
    System.out.print(str1[7]);
    System.out.print(str1[8]);
    System.out.print(str1[9]);
    System.out.println(str1[10]);
    
    //Usando otras funciones
    
    int longitud = str.length(); //Longitud de la cadena
    
    for(int i=0 ; i<longitud; i++)//imprimiendo de 0 hasta el final de la cadena convertida a char array anteriormente
    {
        System.out.print(str1[i]);
    }
    
    System.out.println("");//salto de linea final
        
        
    }
    
}
