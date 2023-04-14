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
public abstract class Fruit implements Food {
    private Point2D posicion;
    private Rectangle2D game_zone;
    
     public Fruit(Point2D posicion, Rectangle2D game_zone) {
        this.posicion = posicion;
        this.game_zone = game_zone;
    }

    public Fruit() {
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
    public void setPosicion() {
        int x = ThreadLocalRandom.current().nextInt((int)this.game_zone.getMinX(),(int)this.game_zone.getMaxX());
        int y = ThreadLocalRandom.current().nextInt((int)this.game_zone.getMinY(),(int)this.game_zone.getMaxY());
        this.posicion = new Point2D(x,y);
    }

    /**
     * @return the game_zone
     */
    public Rectangle2D getGame_zone() {
        return game_zone;
    }

    /**
     * @param game_zone the game_zone to set
     */
    public void setGame_zone(Rectangle2D game_zone) {
        this.game_zone = game_zone;
    }
    
    public abstract void paint(GraphicsContext gc);
}
