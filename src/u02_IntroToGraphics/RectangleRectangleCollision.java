package u02_IntroToGraphics;

public class RectangleRectangleCollision {
    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double xPos_rect1 = StdDraw.mouseX();
        double yPos_rect1 = StdDraw.mouseY();
        double halfWidth_rect1 = 10;
        double halfHeight_rect1 = 5;

        double xPos_rect2 = 50;
        double yPos_rect2 = 40;
        double halfWidth_rect2 = 5;
        double halfHeight_rect2 = 10;



        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {

            xPos_rect1 = StdDraw.mouseX();
            yPos_rect1 = StdDraw.mouseY();

            if(areRectanglesColliding(xPos_rect1, yPos_rect1, halfWidth_rect1, halfHeight_rect1, xPos_rect2, yPos_rect2, halfWidth_rect2, halfHeight_rect2)){
                StdDraw.setPenColor(StdDraw.RED);
            }else{
                StdDraw.setPenColor(StdDraw.BLACK);
            }

            StdDraw.filledRectangle(xPos_rect1, yPos_rect1, halfWidth_rect1, halfHeight_rect1);
            StdDraw.filledRectangle(xPos_rect2, yPos_rect2, halfWidth_rect2, halfHeight_rect2);

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static boolean areRectanglesColliding(double x1, double y1, double halfWidth1, double halfHeight1,  double x2, double y2, double halfWidth2, double halfHeight2){
        double l1 = x1 - halfWidth1;
        double r1 = x1 + halfWidth1;
        double t1 = y1 + halfHeight1;
        double b1 = y1 - halfHeight1;

        double l2 = x2 - halfWidth2;
        double r2 = x2 + halfWidth2;
        double t2 = y2 + halfHeight2;
        double b2 = y2 - halfHeight2;

        if(r1<l2 || t1<b2 || l1>r2 || b1>t2){
            return false;
        }
        return true;
    }

}

