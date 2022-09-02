package u02_IntroToGraphics;

public class s03_FirstAnimation {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double xPos=0; //px
        double xVel=20; // px/sec

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            xPos = xPos+xVel*timeElapsed;
            //StdDraw.square(xPos, 50, 5);
            drawStar(xPos, 40);


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear();
        }
    }

    public static void drawStar(double xOffset, double yOffset){
        StdDraw.line(6+xOffset,0+yOffset,7+xOffset,8+yOffset);
        StdDraw.line(7+xOffset,8+yOffset,0+xOffset,12+yOffset);
        StdDraw.line(0+xOffset,12+yOffset,10+xOffset,13+yOffset);
        StdDraw.line(10+xOffset,13+yOffset,12+xOffset,19+yOffset);
        StdDraw.line(12+xOffset,19+yOffset,14+xOffset,13+yOffset);
        StdDraw.line(14+xOffset,13+yOffset,18+xOffset,12+yOffset);
        StdDraw.line(18+xOffset,12+yOffset,13+xOffset,8+yOffset);
        StdDraw.line(13+xOffset,8+yOffset,15+xOffset,0+yOffset);
        StdDraw.line(15+xOffset,0+yOffset,12+xOffset,5+yOffset);
        StdDraw.line(12+xOffset,5+yOffset,6+xOffset,0+yOffset);

    }

}
