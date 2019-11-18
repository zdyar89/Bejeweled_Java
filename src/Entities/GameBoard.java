package Entities;

import edu.utc.game.Game;
import edu.utc.game.GameObject;
import edu.utc.game.Math.Vector2f;
import edu.utc.game.Texture;
import org.lwjgl.glfw.GLFW;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Observable;

enum Jewel
{
    Purple, Orange, Blue, Empty
}

enum EventType
{
    SWITCH, REMOVAL
}

class PiecePosition
{
    public int row;
    public int col;

    public PiecePosition(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
}
class BoardEvent
{
    public EventType event;
    public PiecePosition pos;

    public BoardEvent(EventType event, PiecePosition pos)
    {
        this.event = event;
        this.pos = pos;
    }
}



public class GameBoard extends Observable
{
    //will need to update with more pieces later

    private int cols;
    private int rows;
    private String color;
    private Jewel[][] grid;


    public GameBoard(int rows, int cols, String color)
    {
        //May need to implement a 2-D array, would also think about a DFS or BFS solution
        //The logic needs to see if a chain of three or more shapes lineup vertically or horizontally
        this.rows = rows;
        this.cols = cols;
        this.color = color;
        this.grid = new Jewel[rows][cols];

    }

    public Jewel[][] makeGrid()
    {

    }

    public Jewel getRandomJewel()
    {
        Random randNum = new Random();
        //update total gems when all pieces are added to final design
        int totalGems = 2;
        int indexSlot = randNum.nextInt(totalGems) + 1;

        return Jewel.values()[indexSlot];
    }

    public Jewel getJewelPos(int r, int c)
    {
        return grid[r][c];
    }

    public void setJewel(int r, int c, Jewel gem)
    {
        grid[r][c] = gem;
        //updateJewel(EventType.SWITCH, r, c);
    }

    public void switchPos(int originR, int originC, int swapR, int swapC)
    {
        Jewel gemOne = getJewelPos(originR, originC);
        Jewel gemTwo = getJewelPos(swapR, swapC);

        setJewel(originR, originC, gemTwo);
        setJewel(swapR, swapC, gemOne);

    }

    public void removeJewel(List<Position> combo)
    {
        for(Position p : combo)
        {
            setJewel(p.);
        }
    }

}
