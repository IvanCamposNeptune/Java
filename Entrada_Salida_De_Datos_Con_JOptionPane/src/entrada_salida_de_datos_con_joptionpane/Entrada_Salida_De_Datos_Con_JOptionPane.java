package entrada_salida_de_datos_con_joptionpane;

import javax.swing.JOptionPane;  //Biblioteca par JOptionPane

public class Entrada_Salida_De_Datos_Con_JOptionPane {

    
    public static void main(String[] args) {

        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: "); //Guarda una cadena
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));  //Se tiene que convertir la cadena que se guarda a entero para poder almacenar en la variable tipo int.
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);  //Se le pone el charAt para que guarde solo la letra o en su defecto la primera de la cadena.
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));  //Se tiene que convertir la cadena que se guardo a double para poder almacenar en la variable tipo double.
        //Ademas con JOptionPane ya no es necesario poner coma(,) en los decimales, se puede usar punto (.).
        
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);
        
        
    }
    
}
