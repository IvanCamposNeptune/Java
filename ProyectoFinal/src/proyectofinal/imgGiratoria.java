/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import javax.swing.JButton;


public class imgGiratoria extends javax.swing.JPanel implements MouseListener, MouseMotionListener{

    private int grados = 0;
    public int poX;
    public int poY;
    public int bC;
    public int hC;
    public int rotar1=250;
    public int rotar2=250;
    private boolean arrastra = false;
    private int Xraton;
    private int Yraton;
    public int rB=35;
    public int rH=35;
    
     public int getrB() {
        return rB;
    }
    public void setrB(int rB) {
        this.rB = rB;
    }
     public int getrH() {
        return rH;
    }
    public void setrH(int rH) {
        this.rH = rH;
    }
    public int getGrados() {
        return grados;
    }
    public void setGrados(int grados) {
        this.grados = grados;
    }
    public int getbC(){
        return bC;
    }
    public void setbC(int bC){
        this.bC=bC;
    }
    public int gethC(){
        return hC;
    }
    public void sethC(int hC){
        this.hC=hC;
    }
    public int getpoX(){
        return poX;
    }
    public void setpoX(int poX){
        this.poX=poX;
    }
     public int getpoY(){
        return poY;
    }
    public void setpoY(int poY){
        this.poY=poY;
    }
    public imgGiratoria(){
        
    }
    private boolean estaDentro(MouseEvent e)
    {
        
        if ((e.getX() > poX) && (e.getX() < (poX + bC)) && (e.getY() > poY) && (e.getY()< (poY + hC)))
                {
            return true;
        }

        return false;
    }

    
   
    @Override
    public void paint(Graphics g) {
       //se borra e l contenido anterior
        super.paint(g);
        double r = Math.toRadians(grados); //se convierte a radianes lo grado
        AffineTransform at = new AffineTransform();
        at.rotate(r, poX+rB, poY+rH); //se asigna el angulo y centro de rotacion
        ((Graphics2D) g).setTransform(at);
        //se dibuja
        
        g.setColor(Color.RED);
        g.fillRect(poX, poY, bC, hC);
        addMouseMotionListener(this);
        
    }

    
 
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
       if (!arrastra)
        {
            if (estaDentro(e))
            {  
                Xraton = e.getX();
                Yraton = e.getY();  
                arrastra = true;
            }
        }
        else
        {
            if (estaDentro(e))
            {
                poX = (poX + e.getX()) - Xraton;
            poY = (poY + e.getY()) - Yraton;
                Xraton = e.getX();
                Yraton = e.getY();
                arrastra = true;
             
            }
        }
        repaint();
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      
    }
    
}
