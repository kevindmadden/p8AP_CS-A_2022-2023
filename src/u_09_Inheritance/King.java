package u_09_Inheritance;

// the Checker class is the parent of the King class
// the Checker class is the superclass of the King class
// the King class is the subclass of the Checker class

public class King extends Checker {

    public King(String color){
        super(color); //new Checker("yellow")
        System.out.println("random");
    }



    public void printColor(){
        System.out.println(color+"hi");
    }

}
