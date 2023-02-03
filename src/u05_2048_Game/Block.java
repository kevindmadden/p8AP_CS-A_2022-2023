package u05_2048_Game;

import java.awt.*;

public class Block {
    //private instance variables
    private double xPos;
    private double yPos;
    private int num;
    private Color color;
    private static double velocity = 20;

    public Block(){
        num = 0;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void draw(int row, int col){
        int yCenter = 7+12*row;
        int xCenter = 7+12*col;
        //Draws block
        StdDraw.setPenColor(new Color(173, 125, 125));
        StdDraw.filledSquare(7+12*col,7+12*row,5);
        //Draw text
        StdDraw.setPenColor(new Color(0, 0, 0));
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        StdDraw.text(xCenter, yCenter, String.valueOf(num));
    }



}
