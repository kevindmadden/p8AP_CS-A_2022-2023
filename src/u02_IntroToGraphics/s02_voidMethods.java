package u02_IntroToGraphics;

public class s02_voidMethods {
    public static void main(String[] args){
        StdDraw.setScale(0,100);
        drawStar(90,0);
        drawStar(10,10);
        drawStar();
    }

    public static void drawStar(int xOffset, int yOffset){
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

    public static void drawStar(){
        drawStar(0,0);
    }


}
