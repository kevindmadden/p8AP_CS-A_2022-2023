import java.util.Arrays;

public class Testing {
    public static void main(String[] args){
        /*
        call moveNumsLeft
        then call mergeIdenticalNumbers on the array you get back from moveNumsLeft
         */

        // 0, 2, 4 in one of four cells
        // 3*3*3*3 = 81 possibilities
        // [0][2][2][0]

        // [0][0][0][0]
        // [0][0][0][2]
        int[] possibilities = {0,2,4};
        for(int i=0; i<possibilities.length; i++){
            for(int j=0; j<possibilities.length; j++){
                for(int k=0; k<possibilities.length; k++){
                    for(int m=0; m<possibilities.length; m++){
                        int[] row = {possibilities[i], possibilities[j], possibilities[k], possibilities[m]};
                        System.out.print(Arrays.toString(row)+ " --> ");
                        System.out.println(Arrays.toString(moveNumsLeft(row)));
                    }
                }
            }
        }
    }

    public static int[] moveNumsLeft(int[] arr){
        for(int k=0; k<arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i - 1] == 0) {
                    arr[i - 1] = arr[i];
                    arr[i] = 0;
                }
            }
        }
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
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                arr[i]=arr[i+1];
                arr[i-1]=arr[i]+arr[i-1];
            }

        }
        return arr; //or whatever array you want to return
    }
}