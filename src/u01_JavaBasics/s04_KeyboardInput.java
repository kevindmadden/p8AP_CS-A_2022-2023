package u01_JavaBasics;

import java.util.Scanner;

public class s04_KeyboardInput {
    public static void main(String[] args){

        //Create new Scanner to read keyboard input
        Scanner kb = new Scanner(System.in);


        /*
            Retrieve Entire Line (String)
         */
        System.out.println("Enter a message: ");
        String message = kb.nextLine();
        System.out.println("Retrieved Message: "+message);

        /*
            Retrieve next int.
         */
        System.out.println("Enter int value: ");
        int num1 = kb.nextInt();
        System.out.println("Retrieved int: "+num1);

        /*
            Retrieve next double.
         */
        System.out.println("Enter double value: ");
        double num2 = kb.nextDouble();
        System.out.println("Retrieved double: "+num2);

        /*
            Retrieve Entire Line (String)

            Dummy kb.nextLine()
            You need to have a dummy kb.nextLine() whenever you are switching from
            pulling in an int/double to pulling in a String (whenever you go from
            kb.nextInt() to kb.nextLine())
         */
        kb.nextLine();

        System.out.println("Enter a message: ");
        String message2 = kb.nextLine();
        System.out.println("Retrieved Message: "+message2);

    }
}
