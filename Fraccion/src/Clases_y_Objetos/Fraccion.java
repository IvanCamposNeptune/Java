package Clases_y_Objetos;

public class Fraccion 
{    //Atributos
    
    private int numerador, denominador;
    
  /*
    //Constructor
    public Fraccion(int num, int den) //Unico metodo que no debe tener tipo de retorno, llamado igual a la clase.
    {
        this.numerador = num; //This, hace referencia a la variable global, en caso de tener el mismo nombre que el parametro para que el programa no se confunda.
        this.denominador = den;
    }
  */
    
    //Metodos accesores getters y setters
    public int getNumerador() 
    {
        return numerador;
    }

    public void setNumerador(int numerador) 
    {
        this.numerador = numerador; //This, hace referencia a la variable global, en caso de tener el mismo nombre que el parametro para que el programa no se confunda.
    }

    public int getDenominador() 
    {
        return denominador;
    }

    public void setDenominador(int denominador) 
    {
        this.denominador = denominador;
    }
    
    
    //Metodos
    
    //Mostrar
    public void mostrar() 
    {
        System.out.println(numerador + "/" + denominador);
        
    }
    
    //Sumar
    public static Fraccion sumar(Fraccion a, Fraccion b) //Metodo de la clase de tipo Fraccion y estatico.
    {
        Fraccion C = new Fraccion(); //Fraccion resultante de la suma
        
        C.numerador = a.numerador*b.denominador + a.denominador*b.numerador;
        C.denominador = a.denominador*b.denominador;
        
        double suma = (a.numerador*b.denominador + a.denominador*b.numerador)/(a.denominador*b.denominador);
        
        System.out.print("Representacion grafica de la suma: ");
        
        C.mostrar();
        
        System.out.println("La suma es: " + suma);
        
        return C;
    }
    
    
}