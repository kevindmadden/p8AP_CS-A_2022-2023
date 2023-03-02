package u99_2048_Game_Madden;

import java.util.Arrays;

/*
Write a method that takes an array of length four and moves
any non-zero numbers to the left.
moveNumsLeft([0,0,0,2]) -> [2,0,0,0]
moveNumsLeft([0,0,4,0]) -> [4,0,0,0]
moveNumsLeft([0,0,4,0]) -> [4,0,0,0]
moveNumsLeft([2,0,0,2]) -> [2,2,0,0]
moveNumsLeft([0,0,0,0]) -> [0,0,0,0]

public static int[] moveNumsLeft(int[] arr){

}
 */

public class PossibleConfigurations {
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    /*
        --Why split this process into two different functions?--

        If you don't move all 0s to the end, you have to consider
        the below possibilities as separate cases:
        [2][2][0][0]
        [2][0][2][0]
        [2][0][0][2]

        If you instead shift all the 0s to be at the end, then all
        of the above possibilities get shifted to looks identical:
        [2][2][0][0] -> [2][2][0][0]
        [2][0][2][0] -> [2][2][0][0]
        [2][0][0][2] -> [2][2][0][0]

        This simplifies thinking through merging the numbers together.

     */

    /*
            Possibilities for two different pairs of numbers merging:
            [2][2][2][2] -> [4][4][0][0]
            [2][2][4][4] -> [4][8][0][0]

            Possibilities for one merge
            [2][2][4][2] - merge 1st and 2nd cells only
            [2][4][4][4] - merge 2nd and 3rd cells only
            [2][8][4][4] - merge 3rd and 4th cells only

            Possibility that no cells can be merged
            [2][4][2][4]
             */
    public static int[] getNextGroup(int[] arr, Direction direction){
        arr = moveNums(arr, direction);
        arr = mergeIdenticalNumbers(arr, direction);
        return arr;
    }

    public static int[] mergeIdenticalNumbers(int[] arr, Direction direction) {
        int[] newArr = new int[4];
        if (direction == Direction.UP) direction = Direction.LEFT;
        if (direction == Direction.DOWN) direction = Direction.RIGHT;

        /* Left AND Right - Case for when there are two merges, such as:
         [2][2][4][4] -> (Left)  [4][8][0][0]
         [2][2][4][4] -> (Right) [0][0][4][8] */
        if (arr[0] == arr[1] && arr[2] == arr[3]) {
            newArr[0] = arr[0] + arr[1];
            newArr[1] = arr[2] + arr[3];
            if (direction == Direction.RIGHT) { //shift nums to right side if RIGHT
                newArr = moveNums(newArr, Direction.RIGHT);
            }
        } else {
            /*Case for when there is only one merge.
             It isn't as easy to account for the direction of the merge due to the differences here:
             [2][2][2][8] -> (Left)  [4][2][8][0]
             [2][2][2][8] -> (Right) [0][2][4][8]
             */
            if (direction == Direction.LEFT) {
                if (arr[0] == arr[1]) {
                    newArr[0] = arr[0] + arr[1];
                    newArr[1] = arr[2];
                    newArr[2] = arr[3];
                } else if (arr[1] == arr[2]) { //merge 2nd and 3rd cells only
                    newArr[0] = arr[0];
                    newArr[1] = arr[1] + arr[2];
                    newArr[2] = arr[3];
                } else if (arr[2] == arr[3]) { //merge 3rd and 4th cells only
                    newArr[0] = arr[0];
                    newArr[1] = arr[1];
                    newArr[2] = arr[2] + arr[3];
                } else { //merge no cells
                    newArr = arr; //if there are no matches, then the arr will stay the same
                }
            }
            if (direction == Direction.RIGHT) {
                if (arr[3] == arr[2]) {
                    newArr[3] = arr[3] + arr[2];
                    newArr[2] = arr[1];
                    newArr[1] = arr[0];
                } else if (arr[2] == arr[1]) {
                    newArr[3] = arr[3];
                    newArr[2] = arr[2] + arr[1];
                    newArr[1] = arr[0];
                } else if (arr[1] == arr[0]) {
                    newArr[3] = arr[3];
                    newArr[2] = arr[2];
                    newArr[1] = arr[1] + arr[0];
                } else {
                    newArr = arr;
                }
            }
        }
        return newArr;
    }

    public static int[] moveNums(int[] arr, Direction direction) {
        int[] newArr = new int[4];
        if (direction == Direction.LEFT || direction == Direction.UP) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    newArr[count] = arr[i];
                    count++;
                }
            }
        }
        if (direction == Direction.RIGHT || direction == Direction.DOWN) {
            int count = 3;
            for (int i = 3; i >= 0; i--) {
                if (arr[i] != 0) {
                    newArr[count] = arr[i];
                    count--;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] possibilities = {0, 2, 4};
        for (int i = 0; i < possibilities.length; i++) {
            for (int j = 0; j < possibilities.length; j++) {
                for (int k = 0; k < possibilities.length; k++) {
                    for (int m = 0; m < possibilities.length; m++) {
                        int[] row = {possibilities[i], possibilities[j], possibilities[k], possibilities[m]};
                        System.out.print(Arrays.toString(row) + " -> ");
                        Direction dir = Direction.RIGHT;
                        row = moveNums(row, dir);
                        row = mergeIdenticalNumbers(row, dir);
                        System.out.println(Arrays.toString(row));
                    }
                }
            }
        }
    }

}

