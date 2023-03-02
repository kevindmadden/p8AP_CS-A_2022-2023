package u99_2048_Game_Madden;
/*
M - Model (the inner workings of the logic)
V - Drawing according to what is in the model
C
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;

/*
-Shift left
    -If there's a blank, condense each row
    in a manner that moves all blocks to their
    leftmost position, overcoming any blanks.
    [ ][ ][ ][ ]
    [ ][2][ ][ ]
    [ ][2][2][ ]
    [ ][2][2][2]
    [ ][2][4][ ]
    [ ][2][ ][4]
    [ ][2][4][4]
    for(


[ ][ ][ ][ ]
   [x][ ][ ][ ]
      [x][x][ ][ ]
         [x][x][x][ ]
         [x][x][ ][x]
         [x][x][x][x]
         [x][x]
      [x][ ][x][ ]
      [x][ ][ ][x]

   [ ][x][ ][ ]
   [ ][ ][x][ ]
   [ ][ ][ ][x]

 */

public class Main {

    public static void main(String[] args) {
        StdDraw.setScale(0, 50);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Block[][] blocks = new Block[4][4];
        for(int row=0; row<blocks.length; row++){
            for(int col=0; col<blocks[0].length; col++){
                blocks[row][col] = new Block();
            }
        }
        blocks[0][0].setNum(2);
        blocks[0][1].setNum(2);
        /*blocks[0][0].setNum(2);
        blocks[0][1].setNum(4);
        blocks[0][2].setNum(8);
        blocks[0][3].setNum(16);
        blocks[1][0].setNum(32);
        blocks[1][1].setNum(64);
        blocks[1][2].setNum(128);
        blocks[1][3].setNum(256);
        blocks[2][0].setNum(512);
        blocks[3][1].setNum(1024);*/

        boolean wasUpPressed = false;
        boolean wasDownPressed = false;
        boolean wasRightPressed = false;
        boolean wasLeftPressed = false;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            boolean wasDownUnpressed = !StdDraw.isKeyPressed(KeyEvent.VK_LEFT) &&  wasDownPressed;
            boolean wasUpUnpressed = !StdDraw.isKeyPressed(KeyEvent.VK_UP) &&  wasUpPressed;
            boolean wasRightUnpressed = !StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) &&  wasRightPressed;
            boolean wasLeftUnpressed = !StdDraw.isKeyPressed(KeyEvent.VK_LEFT) &&  wasLeftPressed;


            if(wasLeftUnpressed){
                boolean didKeypressChangeGrid = false;
                for(int row=0; row<4; row++){
                    int[] blockInts = Block.convertBlockArrToIntArr(blocks[row]);
                    int[] newBlockInts = PossibleConfigurations.getNextGroup(blockInts, PossibleConfigurations.Direction.LEFT);
                    if(!Arrays.equals(blockInts, newBlockInts)) didKeypressChangeGrid=true;
                    updateRow(blocks,newBlockInts,row);
                }
                System.out.println(didKeypressChangeGrid);

                if(didKeypressChangeGrid){
                    spawnNumber(blocks);
                }
                wasLeftPressed = false;
            }





            drawGrid(blocks);


            wasUpPressed = StdDraw.isKeyPressed(KeyEvent.VK_UP);
            wasDownPressed = StdDraw.isKeyPressed(KeyEvent.VK_DOWN);
            wasRightPressed = StdDraw.isKeyPressed(KeyEvent.VK_RIGHT);
            wasLeftPressed = StdDraw.isKeyPressed(KeyEvent.VK_LEFT);
            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static void updateRow(Block[][] blocks, int[] newRow, int rowNum){
        blocks[rowNum][0].setNum(newRow[0]);
        blocks[rowNum][1].setNum(newRow[1]);
        blocks[rowNum][2].setNum(newRow[2]);
        blocks[rowNum][3].setNum(newRow[3]);
    }

    public static Block[][] spawnNumber(Block[][] grid){
        int randomRow = 0;
        int randomCol = (int)(Math.random()*4);
        while(grid[randomRow][randomCol].getNum() != 0){
            randomRow = (int)(Math.random()*4);
            randomCol = (int)(Math.random()*4);
        }
        int spawnNum = Math.random()>0.9 ? 4 : 2;
        grid[randomRow][randomCol].setNum(spawnNum);
        return grid;
    }


    public static void drawGrid(Block[][] blocks){
        StdDraw.setPenColor(new Color(114, 83, 83));
        StdDraw.filledRectangle(25,25,25,25);

        for(int row=0; row<=3; row++){
            for(int col=0; col<=3; col++){
                if(blocks[row][col] != null){
                    blocks[row][col].draw(row,col);
                }
            }
        }

    }


}

