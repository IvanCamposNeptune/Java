/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopro;

import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author Usuario
 */
public class ProyectitoPro extends javax.swing.JFrame {
    
    private int X,Y,Z,W;

    /**
     * Creates new form ProyectitoPro
     */
    public ProyectitoPro() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        Figuras = new javax.swing.ButtonGroup();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        Salir = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        JL2 = new javax.swing.JLabel();
        JL1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Figuras.add(RB1);
        RB1.setText("Cuadrado");
        RB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB1MouseClicked(evt);
            }
        });

        Figuras.add(RB2);
        RB2.setText("Circulo");
        RB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB2MouseClicked(evt);
            }
        });
        RB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB2ActionPerformed(evt);
            }
        });

        Figuras.add(RB3);
        RB3.setText("Ambos");
        RB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB3MouseClicked(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mainPanelMouseMoved(evt);
            }
        });

        JL2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Circulo.png")); // NOI18N
        JL2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JL2MouseMoved(evt);
            }
        });

        JL1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Cuadrado.png")); // NOI18N
        JL1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JL1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(JL1)
                .addGap(83, 83, 83)
                .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RB1)
                .addGap(100, 100, 100)
                .addComponent(RB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(RB3))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB1)
                    .addComponent(RB3)
                    .addComponent(RB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB2ActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void RB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB1MouseClicked
        //Cuadrado
        JL1.setVisible(true);
        JL2.setVisible(false);
        
    }//GEN-LAST:event_RB1MouseClicked

    private void RB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB2MouseClicked
        //Circulo
        JL2.setVisible(true);
        JL1.setVisible(false);
    }//GEN-LAST:event_RB2MouseClicked

    private void RB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB3MouseClicked
        //Ambos
        JL1.setVisible(true);
        JL2.setVisible(true);
        
    }//GEN-LAST:event_RB3MouseClicked

    private void mainPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseMoved
        //Obtener Coordenadas del Mouse
       
        Point punto = MouseInfo.getPointerInfo().getLocation();
        
        Z=punto.x;
        W=punto.y;
        
        JL1.setBounds(Z-50, W-80, 100, 88);
        
        
    }//GEN-LAST:event_mainPanelMouseMoved

    private void JL1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL1MouseMoved
        // Cuadrado cuando lo tocan
        

        
    }//GEN-LAST:event_JL1MouseMoved

    private void JL2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL2MouseMoved
        
        X=getNumberRandom(400);
        Y=getNumberRandom(300);
        
        JL2.setLocation(X,Y);
        
    }//GEN-LAST:event_JL2MouseMoved

    private int getNumberRandom(int ea){
    
        return (int) (Math.random()*ea+1);
        
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
            java.util.logging.Logger.getLogger(ProyectitoPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectitoPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectitoPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectitoPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectitoPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Figuras;
    public static javax.swing.JLabel JL1;
    public static javax.swing.JLabel JL2;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JButton Salir;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables


}
