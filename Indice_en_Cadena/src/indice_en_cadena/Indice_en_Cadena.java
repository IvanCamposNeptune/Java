package indice_en_cadena;

public class Indice_en_Cadena {

    public static void main(String[] args) {
        
    String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";
    
    //write code here
    
    int pos = str.indexOf("c");
    System.out.println("El indice de c en la cadena " + str + " es: ");
    System.out.println(pos);
    
    int pos1 = str.indexOf(" ");
    System.out.println("El indice de ' ' en la cadena " + str + " es: ");
    System.out.println(pos1);
    
    int pos2 = str.indexOf(target1);
    System.out.println("El indice de '" + target1 + "' en la cadena " + str + " es: ");
    System.out.println(pos2);
    
    int pos3 = str.indexOf(target2);
    System.out.println("El indice de '" + target2 + "' en la cadena " + str + " es: ");
    System.out.println(pos3);
        
        
    }
    
}
