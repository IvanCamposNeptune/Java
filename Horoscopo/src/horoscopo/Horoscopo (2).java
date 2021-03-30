package horoscopo;

import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {
        
    Scanner meses = new Scanner(System.in);
        
    System.out.println("\tMeses del año");
    int mes, dia;

    System.out.println("Digite el numero del mes: ");
    mes = meses.nextInt(); 
    
    switch(mes)
    {
              case 1:
                   System.out.println("¿Cual es tu dia de nacimiento?: ");
                   dia = meses.nextInt();
                   if(dia>=1 && dia<=19){
                    System.out.println("Tu signo zodiacal es CAPRICORNIO");
                   }
                   else
                   if(dia>=20 && dia<=31){
                    System.out.println("Tu signo zodiacal es ACUARIO");
                   } 
                   break;
              case 2:
                    System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=18){
                    System.out.println("Tu signo zodiacal es ACUARIO");
                   }
                   else
                   if(dia>=19 && dia<=29){
                    System.out.println("Tu signo zodiacal es PISCIS");
                   }

                        break;
              case 3:
                    System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=20){
                    System.out.println("Tu signo zodiacal es PISCIS");
                   }
                   else
                   if(dia>=21 && dia<=31){
                    System.out.println("Tu signo zodiacal es ARIES");
                   }
                        break;
              case 4:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=20){
                  System.out.println("Tu signo zodiacal es ARIES");
                   }
                   else
                   if(dia>=21 && dia<=31){
                  System.out.println("Tu signo zodiacal es TAURO");
                   }
                        break;
              case 5:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=20){
                  System.out.println("Tu signo zodiacal es TAURO");
                   }
                   else
                   if(dia>=21 && dia<=31){
                  System.out.println("Tu signo zodiacal es GEMINIS");
                   }
                        break;
              case 6:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                       dia = meses.nextInt();
                       if(dia>=1 && dia<=20){
                  System.out.println("Tu signo zodiacal es GEMINIS");
                   }
                   else
                   if(dia>=21 && dia<=31){
                 System.out.println("Tu signo zodiacal es CANCER");
                   }
                        break;
              case 7:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                  
                        if(dia>=1 && dia<=20){
                  System.out.println("Tu signo zodiacal es CANCER");
                   }
                   else
                   if(dia>=21 && dia<=31){
                  System.out.println("Tu signo zodiacal es LEO");
                   }
                        break;
              case 8:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=21){
                  System.out.println("Tu signo zodiacal es LEO");
                   }
                   else
                   if(dia>=22 && dia<=31){
                 System.out.println("Tu signo zodiacal es VIRGO");
                   }
                        break;
              case 9:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=22){
                  System.out.println("Tu signo zodiacal es VIRGO");
                   }
                   else
                   if(dia>=23 && dia<=30){
                  System.out.println("Tu signo zodiacal es LIBRA");
                   }
                        break;
              case 10:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=22){
                  System.out.println("Tu signo zodiacal es LIBRA");
                   }
                   else
                   if(dia>=23 && dia<=31){
                  System.out.println("Tu signo zodiacal es ESCORPIO");
                   }
                        break;
              case 11:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=22){
                  System.out.println("Tu signo zodiacal es ESCORPIO");
                   }
                   else
                   if(dia>=23 && dia<=30){
                  System.out.println("Tu signo zodiacal es SAGITARIO");
                   }
                        break;
              case 12:
                  System.out.println("¿Cual es tu dia de nacimiento?: ");
                        dia = meses.nextInt();
                        if(dia>=1 && dia<=20){
                  System.out.println("Tu signo zodiacal es SAGITARIO");
                   }
                   else
                   if(dia>=21 && dia<=31){
                  System.out.println("Tu signo zodiacal es CAPRICORNIO");
                   }
                        break;
                
              default:
                  System.out.println("Numero de mes no valido");
                        break;
                        } 
        
        
    }
    
}
