package Entities;

import java.util.ArrayList;
import java.util.List;
import edu.utc.game.Game;
import edu.utc.game.GameObject;
import edu.utc.game.Math.Vector2f;
import edu.utc.game.Texture;
import org.lwjgl.glfw.GLFW;

class Combo
{
    public int start;
    public int end;
    public int length;
}

public class Combofinder extends GameObject
{
    private static final int MIN_LINK_LENGTH = 3;
    private GameBoard board;

    public Combofinder(GameBoard board)
    {
        this.board = board;
    }

    public boolean swapCheck(int originRow, int originCol, int swapRow, int swapCol)
    {
        int deltaX = Math.abs(originRow - swapRow);
        int deltaY = Math.abs(originCol - swapCol);

        if(deltaX == 0 && deltaY == 1) return true;
        else if(deltaX == 1 && deltaY == 0) return true;
        else
        {
            return false;
        }

    }


}
