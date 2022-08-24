package u01_JavaBasics;

import java.util.Scanner;

public class s05_ifelse_elseif {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        //if statement
        System.out.println("-----------\nif statement:");
        if(num==3){
            System.out.println("You guessed the lucky number 3.");
        }
        /*
            == - equality
            >
            >=
            <
            <=
            != - not equal
        */


        //if...else statement
        if(num==3){
            System.out.println("You guessed the lucky number 3.");
        }else{
            System.out.println("You didn't guess the lucky number.");
        }

        //if...else if...else statement
        if(num==4){
            System.out.println("You guessed the lucky number 4.");
        }else if(num==3){
            System.out.println("You guessed the lucky number 3.");
        }else if(num<0){
            System.out.println("You guessed waaaay too low.");
        }else if(num<3){
            System.out.println("You guessed too low.");
        }else{
            System.out.println("You guessed the lucky number 3.");
        }




    }
}
