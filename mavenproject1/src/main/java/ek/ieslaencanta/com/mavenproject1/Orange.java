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
public class Orange  extends Fruit{
    private int img_x = 34;
    private int img_y = 17;
    public static int WIDTH = 15, HEIGHT = 15;

    public Orange(Point2D posicion, Rectangle2D game_zone) {
        super(posicion, game_zone);
    }

    public Orange() {
    }
    
    

    @Override
    public void Eat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    @Override
    public void paint(GraphicsContext gc) {
        Resources r = Resources.getInstance();
             gc.drawImage(r.getImage("imagen"),
                //inicio de la posicion
                this.img_x,
                this.img_y,
                Orange.WIDTH,
                Orange.HEIGHT,
                //dibujar en el lienzo
                super.getPosicion().getX() * Game.SCALE,
                super.getPosicion().getY() * Game.SCALE,
                Orange.WIDTH * Game.SCALE,
                Orange.HEIGHT * Game.SCALE);
    }
    
}
