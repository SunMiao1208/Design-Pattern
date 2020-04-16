package DecoratorPattern;

public class Cake implements IBirthdayCake {

    public Cake(){
    	System.out.println("Cake Black was Created");
    }

    public void Show(){
    	System.out.println("Cake Black");
    }

}
