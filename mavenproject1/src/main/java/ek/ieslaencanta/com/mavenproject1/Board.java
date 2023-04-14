/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ek.ieslaencanta.com.mavenproject1;

import java.util.concurrent.ThreadLocalRandom;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.E;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

/**
 * Tablero del juego, posee un fondo (imagen estática, solo se cambia cuando se
 * cambia el nivel), Una bola, un vector de niveles, un disparador y una matriz
 * de bolas gestiona la pulsación de tecla derecha e izquierda
 *
 * @author Pedro
 * @see Bubble Level Shttle BallGrid
 */
public class Board implements IKeyListener {
    private Rectangle2D game_zone;
    private GraphicsContext gc;
    private GraphicsContext bggc;
    private MediaPlayer m;
    private Dimension2D original_size;
    private boolean game_over;
    private boolean debug;
    private boolean iscolission = false;
    private boolean left_press, right_press, up_press, down_press;
    private boolean explotarball = false;
    private int level_actual=0;
   private boolean game_win;
   private Snake snake;
   private Fruit[] f = {new Apple(), new Orange()};
   private Fruit fruit;
   private Nofruit[] nf = {new Key(), new Rocket()};
   private Nofruit nofruit;

    /**
     * constructor
     *
     * @param original
     */
    public Board(Dimension2D original) {
        this.gc = null;
        this.game_zone = new Rectangle2D(0, 0, 320, 224);
        this.original_size = original;
        this.debug = false;
        this.snake = new Snake(new Point2D(100, 100), this.game_zone);
        int fruti = ThreadLocalRandom.current().nextInt(0,1);
        this.fruit = f[fruti];
        this.fruit.setGame_zone(game_zone);
        this.fruit.setPosicion();
        int nofruti = ThreadLocalRandom.current().nextInt(0,1);
        this.nofruit = nf[nofruti];
        this.nofruit.setGame_zone(game_zone);
        this.nofruit.setPosicion();
    }
    
    
    public void setGraphicsContext(GraphicsContext gc) {
        this.gc = gc;

    }

    public void setBackGroundGraphicsContext(GraphicsContext gc) {
        this.bggc = gc;
    }

    /**
     * cuando se produce un evento
     */
    public synchronized void TicTac() {
        if(!this.game_over && !this.game_win){
        this.clear();
        this.render();
        this.process_input();
        //actualizar
        this.update();
        }
    }


    
    private void update() {
        
        this.snake.move();
        
        

    }

    private void render() {
        this.snake.paint(gc);
        this.fruit.paint(gc);
        this.nofruit.paint(gc);
    }


    private void process_input() {
        if (this.left_press) {

        } else if (this.right_press) {

        } else {

        }
    }

    /**
     * limpiar la pantalla
     */
    private void clear() {
        this.gc.restore();
        this.gc.clearRect(0, 0, this.original_size.getWidth() * Game.SCALE, this.original_size.getHeight() * Game.SCALE);
    }



    /**
     * gestión de pulsación
     *
     * @param code
     */
    @Override
    public void onKeyPressed(KeyCode code) {
        switch (code) {
            case LEFT:
                this.left_press = true;
                break;
            case RIGHT:
                this.right_press = true;
                break;
        }
    }

    @Override
    public void onKeyReleased(KeyCode code) {
        switch (code) {
            case LEFT:
                this.left_press = false;
                this.snake.change_dir(-1, 0);
                break;
            case RIGHT:
                this.right_press = false;
                this.snake.change_dir(1, 0);
                break;
            case UP:
                this.up_press = false;
                this.snake.change_dir(0, -1);
                break;
            case DOWN:
                this.down_press = false;
                this.snake.change_dir(0, 1);
                break;
            case ENTER:
                break;
                
            case SPACE:
                break;
            case P:

                break;
            case E:
                break;
            case D:
        }

    }

}
