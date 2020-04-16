package DecoratorPattern;

public class Fruit extends Decorating {

    public void putFruit(){
        System.out.println("Add Fruit......");
    }

    public Fruit(IBirthdayCake BirthdayCake){
    	super(BirthdayCake);
    	//System.out.println("Fruit");
    }
    

}
