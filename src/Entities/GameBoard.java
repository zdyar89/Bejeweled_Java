package Entities;

import edu.utc.game.Game;
import edu.utc.game.GameObject;
import edu.utc.game.Math.Vector2f;
import edu.utc.game.Texture;
import org.lwjgl.glfw.GLFW;

public class GameBoard extends GameObject
{

    private int cols;
    private int rows;
    private String color;
    private int[][] Grid;


    public GameBoard(int rows, int cols, String color)
    {
        //May need to implement a 2-D array, would also think about a DFS or BFS solution
        //The logic needs to see if a chain of three or more shapes lineup vertically or horizontally
        this.rows = rows;
        this.cols = cols;
        this.color = color;
        this.Grid = new int[rows][cols];


    }

}
