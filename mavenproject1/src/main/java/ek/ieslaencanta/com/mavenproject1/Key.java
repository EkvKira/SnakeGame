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
public class Key extends Nofruit{
    private static int WIDTH = 15, HEIGHT = 15;
    private int img_x = 116;
    private int img_y = 16;
    
    public Key(Point2D posicion, Rectangle2D game_zone) {
        super(posicion, game_zone);
    }
    public Key() {
    }

    @Override
    public void paint(GraphicsContext gc) {
       Resources r = Resources.getInstance();
             gc.drawImage(r.getImage("imagen"),
                //inicio de la posicion
                this.img_x,
                this.img_y,
                Key.WIDTH,
                Key.HEIGHT,
                //dibujar en el lienzo
                super.getPosicion().getX() * Game.SCALE,
                super.getPosicion().getY() * Game.SCALE,
                Key.WIDTH * Game.SCALE,
                Key.HEIGHT * Game.SCALE);
    }

    @Override
    public void Eat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
