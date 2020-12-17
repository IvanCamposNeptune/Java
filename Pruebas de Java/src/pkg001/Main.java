package pkg001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          
    //write code below
    /*String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";
    
    //write code here
    
    int pos = str.indexOf("c");
    System.out.println(pos);
    
    int pos1 = str.indexOf(" ");
    System.out.println(pos1);
    
    int pos2 = str.indexOf(target1);
    System.out.println(pos2);
    
    int pos3 = str.indexOf(target2);
    System.out.println(pos3);*/
        
    
        
        
    /*String str = "laptops out for harambe";
    String subcadena, subcadena1;
    //write code below
    System.out.println(subcadena=str.substring(5,str.length()));
    System.out.println(subcadena=str.substring(7,10));
    
    //fill in the blanks below:
    System.out.println(str.substring(16,23)); //fill in substring so it prints "harambe"
    System.out.println(str.substring(10,13)); //fill in substring so it prints "t f"*/
    
    
    
        /*Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String word = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	String subcadena;
  	
  	System.out.println(subcadena=word.substring(word.length()-1 , word.length()));*/
        
        
        /*Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String word = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	String subcadena, subcadena1, subcadena2, anterior;
  	
  	subcadena=word.substring(word.length()-1,word.length());
  	subcadena1=word.substring(word.length()-2,word.length());
  	subcadena2=word.substring(word.length()-3,word.length());
  	
  	anterior=word.substring(word.length()-2,word.length()-1);
  	
  	if(subcadena.compareTo("y") == 0 && anterior.compareTo("e")!=0){
  	  System.out.println("-ies");
  	}
  	else if(subcadena1.compareTo("ey") == 0){
  	  System.out.println("-eys");
  	}
  	else if(subcadena2.compareTo("ife") == 0){
  	  System.out.println("-ives");
  	}
  	else{
  	  System.out.println("-s");
  	}*/
        
    /*Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    char[] palabra = word.toCharArray();
    
    int longitud = word.length();
    
    for(int i=0; i<=longitud-1; i++){
      System.out.println(palabra[i]);
    }*/
            
    /*Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    
    char[] arreglo = word.toCharArray();
    
    int longitud = word.length();
    
    for(int i=0; i<=longitud-1; i++){
      
      System.out.print(arreglo[i]);
      
      i+=1;
      
    } */
        
       /* Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
		  System.out.print("Introduce el valor: ");
			arr[i] = input.nextInt();
		}
		//leave above alone!  write your code below
		for (int j=0;j<5;j++)
		{
			System.out.println(arr[j]);
		}*/
        
        
        
        
       /*Scanner input = new Scanner(System.in);
		int[] arr = {10,2,13,24,15};
                                
		for (int i=0;i<5;i++)//Impresion de arreglo
		{
                    System.out.println(arr[i]);
		}
                
                int tam;
        tam = arr.length;
                
                int aux;//Para intercambio de valores
                
                for(int j=0; j<5-1; j++){//Ordenamiento Burbuja
                    for(int k=0; k<5-1;k++){
                        if(arr[j]>arr[j+1]){
                            aux = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = aux;
                        }
                    }
                }
                
                for (int j=0;j<5;j++)//Impresion de arreglo ordenado
		{
                    System.out.println(arr[j]);
		}*/
        
        /*
       Scanner entrada = new Scanner(System.in);
        
        String[] Alumno = {"Ivan","Yoselin"};
        
        String[] Materia = {"Aprender_A","Precalculo","Programacion","Desarrollo_S","Ingles","Matematicas_D"};
        
        int[] Calificacion = new int[Alumno.length-1];
        
        int suma=0, promedio=0;
                                
		for (int i=0;i<Alumno.length;i++)//Impresion de Alumnos
		{
                    System.out.println("\nAlumno " + Alumno[i]);
                    
                    for(int j=0; j<Materia.length; j++){//Guardando calificaciones
                        System.out.println("Digite la calificacion de " + Materia[j] + ": ");
                        Calificacion[j] = entrada.nextInt();
                        suma+=Calificacion[j];
                    }
                    
                    promedio=suma/Materia.length;
                    
                    Calificacion[i] = promedio;
                    
		}
                
                
                for (int i=0;i<Alumno.length;i++)//Impresion de Alumnos
		{
                    System.out.println("\nAlumno " + Alumno[i]);    
                    System.out.println("El promedio del alumno es: " + Calificacion[i]);
                    
		}
                */
        
        /*
         
        Scanner entrada = new Scanner(System.in);
    
    String[] alumnos = new String[50];
    String[] materias = {"uno","dos","tres","cuatro","cinco","seis"};
    int[] calificaciones= new int[6];
    int[] promedio = new int[50];

    int alumno;

    System.out.println("Cuantos alumnos desea ingresar?: ");
    alumno = entrada.nextInt();
        
    for(int i=0; i<alumno; i++){
        entrada.nextLine();//Limpiamos buffer de entrada
        int prom = 0;
        System.out.println("\nEscribe el nombre del alumno " + (i+1) + ": ");
        alumnos[i] = entrada.nextLine();
        
        for(int j=0; j<6; j++){
        System.out.println("Escribe la calificacion de  " + materias[j] + ": ");
        prom += entrada.nextInt();
    }
        promedio[i] = (prom/6);
    }
    
    
    
    for(int i=0; i<alumno; i++){
        System.out.println("El alumno " + alumnos[i] + " tiene un promedio de: " + promedio[i]);
    }
    
    */
        
    /*   
    Scanner entrada = new Scanner(System.in);
    
    int elementos, multiplo,itera=0,promedio,suma=0;
    
    System.out.println("Cuantos elementos quiere?: ");
    elementos = entrada.nextInt();
    
    int[] multiplos= new int[elementos];
    
    System.out.println("De que numero desea los multiplos?: ");
    multiplo = entrada.nextInt();
    
    
    for(int i=1; i<=1000; i++){  
        
        if(i%multiplo==0){
            multiplos[itera] = i;
            itera++;
        }
        
        if(itera==elementos){
            break;
        }
        
    }
    
        System.out.println("Los multiplos de " + multiplo + " son: ");
    
    
    for(int i=0; i<elementos; i++){
        System.out.println(multiplos[i]);
        suma+=multiplos[i];
    }
        
        System.out.println("\nEl promedio de los elementos es: " + (suma/elementos));
    
    */
        
    
    
               
    
                
                
                
        
		
		
        
        
        
                
                
                
                
    
    
            
        
    }
    
}
