package u03_Classes101.DuckClassExample;

public class Main {

    public static void main(String[] args){
        Duck donald = new Duck("quack");
        donald.honk();
        donald.honk();
        //System.out.println(donald.numOfTimesHonked);
        Duck daffy = new Duck("meow");
        daffy.honk();

        System.out.println("Donald's # of honks: "+donald.getNumOfTimesHonked());
        System.out.println("Daffy's # of honks: "+daffy.getNumOfTimesHonked());

    }

}
