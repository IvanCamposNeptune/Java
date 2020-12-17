package textos;
import java.io.*; /*Este paquete proporciona al sistema las entradas y
salidas a través de flujos de datos, las serializaciones y
el acceso al sistema de ficheros.
Está constituido por una serie de interfaces y clases
destinadas a definir y controlar los distintos tipos de
flujos, el sistema de ficheros y la serializaciones de
objetos.*/

public class Textos 
{
    
    public void leer(String nombreArchivo)
    {
        
        try
        {//Estructura de control de errores
           FileReader r = new FileReader(nombreArchivo);
           BufferedReader buffer = new BufferedReader(r);
           
           String temp="";
           
           while(temp!=null)//Ciclo para poder leer varias lineas del archivo de texto.
           {
               
               temp = buffer.readLine();
               if(temp==null)
                   break;
               System.out.println(temp);
               
           }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());//Mensaje de error en caso de haber alguno
        };
        
    }
    
    

    public static void main(String[] args)
    {
        Textos t = new Textos();//Objeto de la clase Textos llamado t
        t.leer("Prueba.txt");
    }
    
}
