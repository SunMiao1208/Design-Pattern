package DecoratorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IBirthdayCake BirthdayCake=new Cake();
		BirthdayCake.Show();
		Cream cream=new Cream(BirthdayCake);
		cream.putCream();
		//cream.Show();
		
		Fruit fruit=new Fruit(cream);
		fruit.putFruit();
		fruit.Show();

	}

}
