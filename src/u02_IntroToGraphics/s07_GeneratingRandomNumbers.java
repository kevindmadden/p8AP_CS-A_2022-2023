package u02_IntroToGraphics;

public class s07_GeneratingRandomNumbers {
    public static void main (String[] args){

        System.out.println(Math.random()); //prints double num between 0 to 1

        System.out.println(Math.random()*2); //prints double num between 0 to 2
        System.out.println(Math.random()*10); //prints double num between 0 to 10
        System.out.println(Math.random()*50+50); //prints double num between 50 to 100
        System.out.println((int)(Math.random()*50+50)); //prints int num between 50 to 100
        System.out.println(Math.random()); //prints double num between


    }
}
