package u03_Classes101.CirclesExample;

public class Circle {

    //Instance Variables
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;

    public Circle(int xPos, int yPos, int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        xVel = 60;
        yVel = 60;
    }

    public void calculate(double timeElapsed){
        xPos = xPos + xVel*timeElapsed;
        yPos = yPos + yVel*timeElapsed;

        if(xPos < 0+radius){
            xVel = Math.abs(xVel);
        }
        if(xPos > 100-radius){
            xVel = -Math.abs(xVel);
        }
        if(yPos < 0+radius){
            yVel = Math.abs(yVel);
        }
        if(yPos > 100-radius){
            yVel = -Math.abs(yVel);
        }
        
    }

    public void draw(){
        StdDraw.filledCircle(xPos, yPos,
                radius);
    }
    

}
