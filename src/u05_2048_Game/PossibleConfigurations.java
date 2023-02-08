package u05_2048_Game;

import java.util.Arrays;

public class PossibleConfigurations {
    public static void main(String[] args){
        /*
        This quadrouple for-loop will cycle through all the potential
        configurations for a 2048 row that can contain the numbers 0, 2, 4.
         */

        int[] possibilities = {0,2,4};
        for(int i=0; i<possibilities.length; i++){
            for(int j=0; j<possibilities.length; j++){
                for(int k=0; k<possibilities.length; k++){
                    for(int m=0; m<possibilities.length; m++){
                        int[] row = {possibilities[i], possibilities[j], possibilities[k], possibilities[m]};
                        System.out.print(Arrays.toString(row)+ " --> "); //Print out unmodified potential configuration
                        System.out.println(Arrays.toString(moveNumsLeft(row))); //Print out modified potential configuration with zeros at the end.
                    }
                }
            }
        }
    }

    public static int[] moveNumsLeft(int[] arr){
        /*
            Write a method that takes an array of length four and moves
            any non-zero numbers to the left.
            moveNumsLeft([0,0,0,2]) -> [2,0,0,0]
            moveNumsLeft([0,0,4,0]) -> [4,0,0,0]
            moveNumsLeft([0,0,4,0]) -> [4,0,0,0]
            moveNumsLeft([2,0,0,2]) -> [2,2,0,0]
            moveNumsLeft([0,0,0,0]) -> [0,0,0,0]
         */

        return arr; //or whatever array you want to return
    }

    /*
    This is why we want to move all the zeros to one side first because it simplifies this situation into the same situation:
        [2][2][0][0] -> [2][2][0][0]
        [2][0][2][0] -> [2][2][0][0]
        [2][0][0][2] -> [2][2][0][0]

     Possible merge situations
     [x][x][y][y] -> [x+x][y+y][0][0]

     */
    public static int[] mergeIdenticalNumbers(int[] arr){

        return arr; //or whatever array you want to return
    }
}
