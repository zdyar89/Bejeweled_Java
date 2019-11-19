package Entities;

import edu.utc.game.GameObject;
import edu.utc.game.Texture;

public class Bowser extends GameObject{

    private Texture img;
    private int xPos;
    private int yPos;

    public Bowser(){
        this.img = new Texture("res/Textures/Bowser.png");
    }
}
