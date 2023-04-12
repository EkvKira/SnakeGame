/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ek.ieslaencanta.com.mavenproject1;

import java.util.HashMap;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Pedro
 */
public class Resources {

    private HashMap<String, Image> imagenes;
    private HashMap<String, MediaPlayer> sonidos;
    private String path_imagenes[][] = {
        {"imagen", "images.png"},
        {"spriters", "snakes.png"}
    };
    private String path_sonidos[][] = {
    };
    private static Resources resource;

    {
        resource = null;

    }

    private Resources() {
        load();
    }

    private void load() {
        this.imagenes = new HashMap<>();
        this.sonidos = new HashMap<>();
        ClassLoader classLoader = getClass().getClassLoader();
        //cargar las imagenes
        for (int i = 0; i < this.path_imagenes.length; i++) {
            String s = (this.path_imagenes[i][1]);
            this.imagenes.put(this.path_imagenes[i][0], new Image(classLoader.getResource(this.path_imagenes[i][1]).toString()));
        }
        for (int i = 0; i < this.path_sonidos.length; i++) {
            
            this.sonidos.put(this.path_sonidos[i][0], new MediaPlayer(new Media(classLoader.getResource(this.path_sonidos[i][1]).toString())));
        }

    }

    public static Resources getInstance() {
        if (Resources.resource == null) {
            Resources.resource = new Resources();
        }
        return Resources.resource;
    }

    public Image getImage(String name) {
        Image i = this.imagenes.get(name);
        return i;
    }

    public MediaPlayer getSound(String name) {
        return this.sonidos.get(name);
    }

}
