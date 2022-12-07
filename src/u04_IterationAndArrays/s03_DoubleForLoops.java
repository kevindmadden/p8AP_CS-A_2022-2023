package u04_IterationAndArrays;

public class s03_DoubleForLoops {
    public static void main(String[] args){

        String[] desserts = {"ice cream","cookies","brownies","doughnuts","popsicles"};
        String[] fruits = {"strawberry", "cherry", "grape", "prune", "lemon"};

        for(int i=0; i<desserts.length; i++){
            for(int j=0; j<fruits.length; j++){
                System.out.println(fruits[j]+" "+desserts[i]);
            }
        }

        System.out.println("------------");

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<desserts.length; j++){
                System.out.println(fruits[i]+" "+desserts[j]);
            }
        }




    }
}
