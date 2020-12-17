package palindromo;

public class Palindromo {

    public static boolean esPalindromo(String cadena) {
		// Convertir a minúscula y quitar espacios " ", puntos "." y comas ","
		// También remplazar palabras con acento p.ej. í => i

		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		// Invertir la cadena, y si es igual que la original entonces
		// son palíndromos
		String invertida = new StringBuilder(cadena).reverse().toString();
		// Para invertir recomiendo ver
		// https://parzibyte.me/blog/2019/02/20/invertir-cadena-string-java/
		return invertida.equals(cadena);
	}
    
    
    public static void main(String[] args) {
     String cadena = "was it a car or a cat I saw";
     
             
/*
     String cadena1 = "";
     
      char[] str1=cadena.toCharArray();
      
      int longitud = cadena.length();
      
      
      for(int i=longitud-1; i>=0; i--){
          cadena1 += str1[i];
      }
      
        System.out.println(cadena1);
        
        if(cadena.equals(cadena1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        */
        
        System.out.println(esPalindromo(cadena));
        
        
      
      
      
          
        
    }
    
}
