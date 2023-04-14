/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ek.ieslaencanta.com.mavenproject1;

import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author kirae
 */
public class Apple extends Fruit{
   public static int WIDTH = 15, HEIGHT = 15;
   private int img_x = 51;
   private int img_y = 17;
   
   
    public Apple(Point2D posicion, Rectangle2D game_zone) {
        super.setGame_zone(game_zone);
    }
    public Apple(){}

    /**
     * @param posicion the posicion to set
     */
    
   
   @Override
   public void paint(GraphicsContext gc){
       Resources r = Resources.getInstance();
             gc.drawImage(r.getImage("imagen"),
                //inicio de la posicion
                this.img_x,
                this.img_y,
                Apple.WIDTH,
                Apple.HEIGHT,
                //dibujar en el lienzo
                super.getPosicion().getX() * Game.SCALE,
                super.getPosicion().getY() * Game.SCALE,
                Apple.WIDTH * Game.SCALE,
                Apple.HEIGHT * Game.SCALE);
}

    @Override
    public void Eat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
