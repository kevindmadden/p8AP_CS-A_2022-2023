package u_09_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Checker checker = new Checker("yellow");
        checker.printColor();
        King king = new King("yellow");
        king.printColor();

        Object obj = new Object();

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.toString());

        int[] arr2 = new int[2];
        arr2[0] = 1;
        arr2[1] = 3;
        System.out.println(arr2);
        System.out.println(arr2.toString());


    }
}
