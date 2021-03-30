package suma_pares_impares;

public class Suma_Pares_Impares {

    public static void main(String[] args) {
        
        //Suma de pares e impares hasta 10
        
        System.out.println("\tSuma de pares e impares hasta 10");
        
        int acumP=0, acumI=0;
        
        for(int pi=0; pi<=10 ; pi++){
            
            if(pi%2==0){
            acumP = acumP + pi;
            }
            else{
            acumI+=pi;
            }
            
        }
        
        System.out.println("\nLa suma de los pares es: " + acumP);
        System.out.println("La suma de los impares es: " + acumI);
        
        
    }
    
}
