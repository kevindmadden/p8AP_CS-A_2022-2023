package u05_2048_Game;
/*
M - Model (the inner workings of the logic)
V - Drawing according to what is in the model
C
 */


import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        StdDraw.setScale(0, 50);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Block[][] blocks = new Block[4][4];

        boolean isLeftPressed = false;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {

            if(!StdDraw.isKeyPressed(KeyEvent.VK_LEFT) &&  isLeftPressed){
                blocks=spawnNumber(blocks);
                isLeftPressed = false;
            }

            if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
                isLeftPressed = true;
            }
            drawGrid(blocks);



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static Block[][] spawnNumber(Block[][] blocks){
        int randomRow = 0;
        int randomCol = (int)(Math.random()*4);
        //TODO: Fix this error below when uncommented
        /*while(blocks[randomRow][randomCol] != 0){
            randomRow = 0;
            randomCol = (int)(Math.random()*4);
        }
        blocks[randomRow][randomCol] = 2;*/
        return blocks;
    }


    public static void drawGrid(Block[][] blocks){
        StdDraw.setPenColor(new Color(114, 83, 83));
        StdDraw.filledRectangle(25,25,25,25);

        for(int row=0; row<=3; row++){
            for(int col=0; col<=3; col++){
                int yCenter = 7+12*row;
                int xCenter = 7+12*col;
                //Draws block
                StdDraw.setPenColor(new Color(173, 125, 125));
                StdDraw.filledSquare(7+12*col,7+12*row,5);
                //Draw text
                StdDraw.setPenColor(new Color(0, 0, 0));
                Font font = new Font("Arial", Font.BOLD, 60);
                StdDraw.setFont(font);
                StdDraw.text(xCenter, yCenter, String.valueOf(blocks[row][col]));
            }
        }

    }
}

