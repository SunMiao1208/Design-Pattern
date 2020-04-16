package DecoratorPattern;

public class Cream extends Decorating {

    public void putCream(){
    	System.out.println("Add Cream......");
    }

    public Cream(IBirthdayCake BirthdayCake){
    	super(BirthdayCake);
    	//System.out.println("Cream");
    }

}
