package invertir_vector;

public class Invertir_Vector {

    public static void main(String[] args) {
        
        int[] arr = {1,4,6,8,9};

        System.out.println("Arreglo normal:");

        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
        }

        System.out.println("Arreglo invertido:");

        for(int i=arr.length-1; i>=0; i--){
        System.out.println(arr[i]);
        }
        
        
    }
    
}
