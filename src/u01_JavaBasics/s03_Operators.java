package u01_JavaBasics;

/*
Resources:
 Class text: 2.9, 2.14-2.16
 Runestone: 1.4-1.6 - https://runestone.academy/ns/books/published/csawesome/Unit1-Getting-Started/toctree.html
 */

public class s03_Operators {
    public static void main(String[] args){
        //5 Basic operators in Java

        //+
        int number = 3;
        number = number+1;
        System.out.println(number); //prints 4
        System.out.println(24+90); //prints 114

        //-, * ~ work similarly

        // Division - /
        System.out.println(7/2); //prints 3
        System.out.println(7/2.0); //prints 3.5
        System.out.println(7.0/2); //prints 3.5
        System.out.println(7.0/2.0); //prints 3.5


        //Integer Division & Casting
        System.out.println(7/(double)2); //prints 3.5
        System.out.println((double)7/2); //prints 3.5

        //FYI
        //System.out.println((String)3); //this doesn't work
        System.out.println(3+""+4); //prints 34

        //String operator
        String start = "My name is";
        String end = "slim shady.";
        System.out.println(start+" "+end+" That's not actually my name.");

        //ArithmeticException Error
        //System.out.println(7/0); //error

        //Compound Operators
        // ++ (increment), -- (decrement)
        int iWannaBe7 = 6;
        System.out.println(iWannaBe7); //prints 7
        iWannaBe7++;
        System.out.println(iWannaBe7); //prints 7
        iWannaBe7--;
        System.out.println(iWannaBe7); //prints 6

        // +=
        iWannaBe7+=2; //iWannaBe7 = iWannaBe7 + 2;
        System.out.println(iWannaBe7); //prints 8

        //-=
        iWannaBe7-=3; //iWannaBe7 = iWannaBe7 - 3;
        System.out.println(iWannaBe7); //prints 5

        //*=
        iWannaBe7*=(7/5); // iWannaBe7 = iWannaBe7 * (7/5)
        System.out.println(iWannaBe7); //prints 5

        //*=
        iWannaBe7*=(7.0/5); // iWannaBe7 = iWannaBe7 * (7/5)
        System.out.println(iWannaBe7); //prints 7


        // % - Modulus
        System.out.println(10%7); //prints 3
        System.out.println(100%44); //prints 12

        // %=, /=d


    }
}
