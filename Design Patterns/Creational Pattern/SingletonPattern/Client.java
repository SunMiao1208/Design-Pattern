package SingletonPattern;

import AdapterPattern.Adapter;
import AdapterPattern.InewJuicer;

public class Client {
	public static void main(String[] args) {
		MyFruit fruit1=new Apple();
		MyFruit fruit2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1,fruit1);
		mfs1.Add(2,fruit2);
		mfs1.Add(3,new Apple());
		mfs1.Add(4,new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		MyFruit fruit=(MyFruit)mfs1.Get(3);
		fruit.display();
		System.out.println("mfs1:"+mfs1.toString());
		System.out.println("mfs2:"+mfs2.toString());
	}
	
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

}