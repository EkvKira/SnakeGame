/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ek.ieslaencanta.com.mavenproject1;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author kirae
 */
public class Snake {

   private Point2D posicion;
   public static int WIDTH = 15, HEIGHT = 15;
   private float velocidad;
   private int dirx = 1;
   private int diry = 0;
    
   private enum State {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
   
    public Snake(Point2D posicion) {
        this.posicion = posicion;
    }
    /**
     * @return the posicion
     */
    public Point2D getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(Point2D posicion) {
        this.posicion = posicion;
    }
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
   public void paint(GraphicsContext gc){
       Resources r = Resources.getInstance();
        
             gc.drawImage(r.getImage("imagen"),
                //inicio de la posicion
                0,
                0,
                Snake.WIDTH,
                Snake.HEIGHT,
                //dibujar en el lienzo
                (this.posicion.getX() - Snake.WIDTH / 2) * Game.SCALE,
                (this.posicion.getY() - Snake.HEIGHT / 2) * Game.SCALE,
                Snake.WIDTH * Game.SCALE,
                Snake.HEIGHT * Game.SCALE);
}
   public void move() {
        boolean pared = false;
        this.posicion = this.getPosicion().add(1*this.dirx, 1*this.diry);
        System.out.println(this.getPosicion().getX());
}
}