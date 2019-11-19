package Entities;

import edu.utc.game.GameObject;
import edu.utc.game.Texture;

public class Samus extends GameObject{

    private Texture img;
    private int xPos;
    private int yPos;

    public Samus(){
        this.img = new Texture("res/Textures/Samus.png");
    }
}
