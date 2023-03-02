package u04_IterationAndArrays.Snowflake;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;

    private static int totalSnowflakes;

    public Snowflake() {
        xPos = Math.random() * 100;
        yPos = Math.random() * 100 + 100;
        yVel = -1 * (Math.random() * 80 + 40);
    }

    public void draw() {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, 1);
    }

    public void calculate(double timeElapsed) {
        yPos = yPos + yVel * timeElapsed;
        if (yPos < -5) {
            xPos = Math.random() * 100;
            yPos = 105;
            yVel = -1 * (Math.random() * 80 + 40);
            totalSnowflakes++;
        }
    }


    /*

        1. Modify so that the snow falls at different levels depending on whether it falls on left or right side of screen.
            -Implement with two variables:
                totalSnowflakesLeft, totalSnowflakesRight
            -Update the calculate method to increment totalSnowflakesLeft and totalSnowflakesRight based on side of screen snowflakes fall.
        2. Rework code so that it uses an array instead of two separate variables.
                 private static int totalSnowflakes[] = new int[2];
                 -increment # stored in totalSnowflakes[0] if snowflake falls on the left
                 -increment # stored in totalSnowflakes[1] if snowflake falls on the right
        3. Divide screen up into 10 sections instead of 2. Get it working.
            -Get it working?
            -Was there a lot of code you had to copy/paste in order to do this?
            -If yes, use a for-loop instead.
        4. Divide screen up into 100 sections instead of 10. Get it working.



     */
    public static void drawSnowBuildup() {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(0, 0, 250, totalSnowflakes);
    }




}
