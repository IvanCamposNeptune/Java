package interpolacion;
import java.util.Scanner;

/**
 *
 * @author Miguel Tristan
 */
public class Interpolacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        //variables
        float fx1,fx2,ln1=0,error1,error2;
        float logx1=6,logx2=4,ln6,ln4;
        
        System.out.println("Interpolacion ejercicio en clase\n\n");
        
        ln1=(float) Math.log(2);
        System.out.println("Calculo de ln 2: "+ln1);
        System.out.println("\n\nLogaritmo natural de 1: "+0);
        
        System.out.println("\n\nLogaritmo natural de 6: "+Math.log(logx1));
        
        System.out.println("\n\nLogaritmo natural de 4: "+Math.log(logx2));
        
        //aplicando formula
        ln6=(float) Math.log(logx1);
        ln4=(float) Math.log(logx2);
        
        fx1=((ln6-0)/(logx1-1))*1;
        fx2=((ln4-0)/(logx2-1))*1;
        
        System.out.println("\nFuncion F(x): "+fx1);
        System.out.println("\nFuncion F(x): "+fx2);
        
        //error porcentual
        error1=(fx1/ln1)*100;
        error2=(fx2/ln1)*100;
        System.out.println("\nError Porcentual:\n"+error1+"%"+"\n"+error2+"%");
        
    }
    
}
