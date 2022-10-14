package u04_IterationAndArrays;

public class s02_ArraysForEachLoops {
    public static void main(String[] args){
        //Arrays            0        1        2         3          4
        String[] fruits = {"banana", "apple", "orange", "tomato", "kiwi"};
        System.out.println(fruits[2]); //prints out "orange" because it is @ index 2

        String fruits2[] = {"banana", "apple", "orange", "tomato", "kiwi"}; //another method of creating an array

        String[] fruits3 = new String[5]; //creates an array with empty elements
        fruits3[0] = "banana";
        fruits3[1] = "apple";
        fruits3[2] = "orange";
        fruits3[3] = "tomato";
        fruits3[4] = "kiwi";

        //Print out all elements in array
        for(int i=0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //For-each loop -- READ ONLY
        for(String fruit : fruits){
            fruit = "lime";
            System.out.println(fruit);
        }











    }
}
