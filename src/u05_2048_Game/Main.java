package u05_2048_Game;

/*
Basic Outline
-Every time arrow is pressed, block between 2 and 4 spawns
--4 blocks spawn 10% of the time
-When arrow pressed, reshape the 2d array to that side
--Focus on what is added up to
--Remember to delete blocks
-If you press the arrow in a direction that changes nothing, then nothing happens
-If grid is completely full, then game is over if pressing the arrows does nothing.
-Game indicates to you somehow that you reached 2048 (confetti)
-Let's have holding down a key not work because my computer sucks
-Drawing
    -Best way to implement a border
        -Adjust scale in STD draw to not be 100x100
            -60x60 scale with border in between of 5
    -Draw with numbers centered
    -Coloring - Change colors the larger they get (4096 is black)

Structure
-UI for the arrows
-Method that checks
-Distinction between what grid looks like to user versus the actual state of the grid
-2d Array


 */


public class Main {
    public static void main(String[] args) {
        StdDraw.setScale(0, 50);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        int[][] grid = new int[4][4];


        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}

