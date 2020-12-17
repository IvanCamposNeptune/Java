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


public class triangulo extends javax.swing.JPanel implements MouseListener, MouseMotionListener{
    private int grados = 0;
   public int po1=110;
    public int po2=60;
    public int po3=90;
    public int po4=6;
    public int po5=10;

    
  
    public int bC;
    public int hC;
    public int rotar1=250;
    public int rotar2=250;
    private boolean arrastra = false;
    private int Xraton;
    private int Yraton;
    public int rB=50;
    public int rH=46;
    
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
    public int getPo1(){
        return po1;
    }
    public void setPo1(int po1){
        this.po1=po1;
    }
        public int getPo2(){
        return po2;
    }
    public void setPo2(int po2){
        this.po2=po2;
    }
        public int getPo3(){
        return po3;
    }
    public void setPo3(int po3){
        this.po3=po3;
    }
        public int getPo4(){
        return po4;
    }
    public void setPo4(int po4){
        this.po4=po4;
    }
        public int getPo5(){
        return po5;
    }
    public void setPo5(int po5){
        this.po5=po5;
    }
   
    
    private boolean estaDentro(MouseEvent e)
    {
        
       if ((e.getX() > po5+25) && (e.getX() < (po1-20)) && (e.getY() > po2-5) && (e.getY()< (po3)))
                {
                   
            return true;
        }


        return false;
    }
    public void paint(Graphics g) {
       //se borra e l contenido anterior
        super.paint(g);
        double r = Math.toRadians(grados); //se convierte a radianes lo grado
        AffineTransform at = new AffineTransform();
        at.rotate(r, po5+rB, po4+rH); //se asigna el angulo y centro de rotacion
        ((Graphics2D) g).setTransform(at);

        g.setColor(Color.RED);
       
        int xp[]={po1,po2,po5};
        int yp[]={po3,po4,po3};
        g.fillPolygon(xp, yp, 3);
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
               // poX = (poX + e.getX()) - Xraton;
                
                po1=(po1+e.getX())-Xraton;
                po2=(po2+e.getX())-Xraton;
                po3=(po3+e.getY())-Yraton;
                po4=(po4+e.getY())-Yraton;
                po5=(po5+e.getX())-Xraton;
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
