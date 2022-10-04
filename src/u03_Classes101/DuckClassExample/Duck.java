package u03_Classes101.DuckClassExample;

//Class name should always start with capital letter.
public class Duck {

    private int numOfTimesHonked;
    private String speechContent;
    private boolean isSwimming;

    //Constructor
    public Duck(String speechContent){
        numOfTimesHonked = 0;
        this.speechContent = speechContent;
        isSwimming = false;
    }

    //Methods
    public void honk(){
        numOfTimesHonked++;
        System.out.println(speechContent);
    }

    //Getter-method
    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }



}
