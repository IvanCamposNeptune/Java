package prueba_conexion_registro;

import com.mysql.jdbc.Connection; //Libreria para la conexion de jdbc
import com.mysql.jdbc.PreparedStatement; //Para PreparedStatement consultas a la BD
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class registro_cliente extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/prueba_conexion"; //Direccion de la conexion de la jdbc
    public static final String USERNAME = "root";
    public static final String PASSWORD = "admin3312";
    
    public registro_cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_conexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("registro_liente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_conexion.setText("Conexion");
        btn_conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conexionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btn_conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conexionActionPerformed
     
        try
        {
        Connection con = null;
        con = getConection();
        
        PreparedStatement ps;
        ResultSet res;
        
        ps = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente");
        
        res = ps.executeQuery();
        
        if(res.next())
        {
            JOptionPane.showMessageDialog(null,res.getInt("id_cliente") + " " + res.getString("nombre"));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No existen datos");
        }
        
        con.close(); //Cerrando conexion
        
        }catch(Exception e){
        
            System.out.println(e);
            
        }
        
        
    }//GEN-LAST:event_btn_conexionActionPerformed

    public static Connection getConection()
    {
        Connection con = null; //Variable de tipo conexion
        
        try
        {
        
            Class.forName("com.mysql.jdbc.Driver"); //Nombre de espacio del conector
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        return con;
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_conexion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
