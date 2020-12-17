package obtener_fecha;

import java.util.Date;//Para la fecha
import java.text.SimpleDateFormat;//Para la fecha

public class Obtener_Fecha {

   
    public static void main(String[] args) {
       
    Date fecha = new Date();
    
    SimpleDateFormat fecha_actual = new SimpleDateFormat("YYYY-MM-dd");
    
        System.out.println(fecha_actual.format(fecha));
        
    }
    
}
