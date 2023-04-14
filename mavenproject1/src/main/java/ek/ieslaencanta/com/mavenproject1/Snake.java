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
   private Rectangle2D game_zone;
    
 /*  private enum State {
       LEFT,
        RIGHT,
        UP,
        DOWN
    }
   */
    public Snake(Point2D posicion, Rectangle2D game_zone) {
        this.posicion = posicion;
        this.game_zone = game_zone;
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
        this.posicion = this.getPosicion().add(15*this.dirx, 15*this.diry);
        if(this.posicion.getX() >= game_zone.getMaxX()){
            this.posicion = new Point2D(game_zone.getMaxX(),this.posicion.getY());
        }
        if(this.posicion.getY() >= game_zone.getMaxY()){
            this.posicion = new Point2D(this.posicion.getX(),game_zone.getMaxY());
        }
        if(this.posicion.getX() <= game_zone.getMinX()) {
            this.posicion = new Point2D(game_zone.getMinX(), this.posicion.getY());
        }
        if(this.posicion.getY() <= game_zone.getMinY()) {
            this.posicion = new Point2D(this.posicion.getX(),game_zone.getMinY());
        }
}
   public void change_dir(int dirx, int diry){
       this.dirx = dirx;
       this.diry = diry;
   }
   
   
}