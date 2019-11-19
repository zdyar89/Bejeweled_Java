package Entities;

import edu.utc.game.GameObject;
import edu.utc.game.Texture;

public class Kirby extends  GameObject{

    private Texture img;
    private int xPos;
    private int ypos;

    public Kirby(){
        this.img = new Texture("res/Textures/kirby.png");
    }

}
