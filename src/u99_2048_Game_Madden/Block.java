package u99_2048_Game_Madden;

import java.awt.*;

public class Block {
    //private instance variables
    private double xPos;
    private double yPos;
    private int num;
    private Color color;
    private static double velocity = 20;
    private boolean wasJustMerged;

    public Block(){
        num = 0;
        wasJustMerged = false;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    public void draw(int row, int col){


        int yCenter = 50-(7+12*row);
        int xCenter = 7+12*col;

        //Draws block
        //Num of 2 (255, 240, 180)
        //Num of 2048 (255, 200, 0)
        //Difference  (0, 40, 180)
        int r=0;
        int g=0;
        int b=0;
        if(num!=0){
            r = (int)(255-(100*Math.log(num)/Math.log(2))/12.0);
            g = (int)(240-(240.0*Math.log(num)/Math.log(2))/12.0);
            b = (int)(180-(180.0*Math.log(num)/Math.log(2))/12.0);
        }
        StdDraw.setPenColor(new Color(r, g, b));
        StdDraw.filledSquare(xCenter,yCenter,5);
        //Draw text
        StdDraw.setPenColor(new Color(0, 0, 0));
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        StdDraw.text(xCenter, yCenter, String.valueOf(num));
    }

    public boolean equals(Block block){
        if(num == block.getNum()){
            return true;
        }
        return false;
    }

    public static int[] convertBlockArrToIntArr(Block[] blockArr){
        int[] arr = {blockArr[0].getNum(), blockArr[1].getNum(), blockArr[2].getNum(), blockArr[3].getNum()};
        return arr;
    }

}
