package Clases_y_objetos;

public class Empleado {
    
    //Atributos
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String rfc;
    private int anio_ingreso;
  
    
    
    //Metodos
    public Empleado()//Constructor
    {
        nombre = "";
        apellido_paterno = "";
        apellido_materno = "";
        rfc = "";
        anio_ingreso = 0;
    }
    
    public Empleado(String n, String ap, String am, String r, int a)//Sobrecarga de metodo constructor
    {
        this.nombre = n;
        this.apellido_paterno = ap;
        this.apellido_materno = am;
        this.rfc = r;
        this.anio_ingreso = a;
    }
     
    
    public void setNombre(String nombreE)
    {
        this.nombre = nombreE;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    
    public void setApellidoP(String apellidoP)
    {
        this.apellido_paterno = apellidoP;
    }
    
    public String getApellidoP()
    {
        return apellido_paterno;
    }
    
    
    public void setApellidoM(String apellidoM)
    {
        this.apellido_materno = apellidoM;
    }
    
    public String getApellidoM()
    {
        return apellido_materno;
    }
    
    
    public void setRfc(String rfcE)
    {
        this.rfc = rfcE;
    }
    
    public String getRfc()
    {
        return rfc;
    }
    
    
    public void setAnio(int anioI)
    {
        this.anio_ingreso = anioI;
    }
    
    public int getAnio()
    {
        return anio_ingreso;
    }
    

}
