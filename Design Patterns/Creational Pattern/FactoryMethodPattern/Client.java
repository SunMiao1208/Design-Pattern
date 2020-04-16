package FactoryMethodPattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Factory factory=new AFactory();
		//Factory factory=(Factory)XMLUtil.getBean();
		Fruit fruit=factory.CreateFruit();
		fruit.eat();
	}
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}
