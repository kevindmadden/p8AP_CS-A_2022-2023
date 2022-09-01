package u02_IntroToGraphics;

public class s01_Drawing {
    public static void main(String[] args) {
        StdDraw.setPenRadius(0.05); //We are calling the method setPenRadius. 0.05 is a parameter
        StdDraw.setPenColor(StdDraw.BLUE); //We are calling the method setPenColor.
        StdDraw.point(0.5, 0.5); //0.5 and 0.5 are both parameters
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
    }
}
