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
            //r = (int)(255-(100*Math.log(num)/Math.log(2))/12.0);
        int r,g,b;
        if(num==0){
            r = 255;
            g = 233;
            b = 198;
        }else{
            r = (int)(255-(255-222)*((Math.log(num)/Math.log(2))/12.0));
            g = (int)(233-(233-134)*((Math.log(num)/Math.log(2))/12.0));
            b = (int)(198-(198-0)*((Math.log(num)/Math.log(2))/12.0));
        }
        //StdDraw.setPenColor(new Color(255, 233, 198));
        System.out.println("num:"+num+"r:"+r+",g:"+g+"b:"+b);
        StdDraw.setPenColor(new Color(r, g, b));
        //StdDraw.setPenColor(new Color(222, 134, 0));

        StdDraw.filledSquare(7+12*col,7+12*row,5);
        //Draw text
        StdDraw.setPenColor(new Color(0, 0, 0));
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        if(num!=0){
            StdDraw.text(xCenter, yCenter, String.valueOf(num));
        }
    }



}
