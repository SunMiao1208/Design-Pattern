package AdapterPattern;

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
		InewJuicer newJuicer=new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(3), mfs1.Get(2))); 
	}
	
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

}
