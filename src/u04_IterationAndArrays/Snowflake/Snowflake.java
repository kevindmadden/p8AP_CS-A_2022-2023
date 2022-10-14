package u04_IterationAndArrays.Snowflake;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;

    public Snowflake(){
        xPos = Math.random()*100;
        yPos = 100;
        yVel = -20;
    }

    public void draw(){
        System.out.println("am drawing");
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, 1);
    }

    public void calculate(double timeElapsed){
        yPos = yPos + yVel*timeElapsed;
    }



}
