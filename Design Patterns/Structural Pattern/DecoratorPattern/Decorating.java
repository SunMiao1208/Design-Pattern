package DecoratorPattern;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake BirthdayCake;

    public Decorating(IBirthdayCake BirthdayCake){
    	this.BirthdayCake=BirthdayCake;
    }

    public void Show(){
    	BirthdayCake.Show();
    }

}
