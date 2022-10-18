package u04_IterationAndArrays.Snowflake;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;

    private static int totalSnowflakes;

    public Snowflake(){
        xPos = Math.random()*100;
        yPos = Math.random()*100+100;
        yVel = -1*(Math.random()*80+40);
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, 1);
    }

    public void calculate(double timeElapsed){
        yPos = yPos + yVel*timeElapsed;
        if(yPos < -5){
            xPos = Math.random()*100;
            yPos = 105;
            yVel = -1*(Math.random()*80+40);
            totalSnowflakes++;
            System.out.println(totalSnowflakes);
        }
    }

    public static void drawSnowBuildup(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(0,0,250, totalSnowflakes);
    }



}
