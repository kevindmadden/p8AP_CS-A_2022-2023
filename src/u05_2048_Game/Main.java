package u05_2048_Game;
/*
M - Model (the inner workings of the logic)
V - Drawing according to what is in the model
C - Controller
 */


import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        StdDraw.setScale(0, 50);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Block[][] blocks = new Block[4][4];

        for(int row=0; row<4; row++){
            for(int col=0; col<4; col++){
                blocks[row][col] = new Block();
            }
        }
        blocks[0][0].setNum(2);
        blocks[0][1].setNum(4);
        blocks[0][2].setNum(8);
        blocks[0][3].setNum(16);
        blocks[1][0].setNum(32);
        blocks[1][1].setNum(64);
        blocks[1][2].setNum(128);
        blocks[1][3].setNum(256);
        blocks[2][0].setNum(512);
        blocks[3][1].setNum(1024);

        System.out.println(String.valueOf(blocks[0][0]));

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
        int randomRow = (int)(Math.random()*4);
        int randomCol = (int)(Math.random()*4);
        while(blocks[randomRow][randomCol].getNum() != 0){
            randomRow = (int)(Math.random()*4);
            randomCol = (int)(Math.random()*4);
        }
        if(Math.random()<0.9){
            blocks[randomRow][randomCol].setNum(2);
        }else{
            blocks[randomRow][randomCol].setNum(4);
        }

        return blocks;
    }


    public static void drawGrid(Block[][] blocks){
        StdDraw.setPenColor(new Color(114, 83, 83));
        StdDraw.filledRectangle(25,25,25,25);

        for(int row=0; row<=3; row++){
            for(int col=0; col<=3; col++){
                blocks[row][col].draw(row, col);
            }
        }

    }
}

