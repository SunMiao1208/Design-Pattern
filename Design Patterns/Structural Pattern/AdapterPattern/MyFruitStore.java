package AdapterPattern;

import java.util.Hashtable;

public class MyFruitStore {
	private static Hashtable fruittable=null;
	//private static MyFruitStore fruitstore=null;               //ÀÁººÊ½
	private static MyFruitStore fruitstore=new MyFruitStore();   //¶öººÊ½
	private MyFruitStore() 
	{
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore()
	{
		/*if (fruittable==null) {
			fruitstore=new MyFruitStore();
		}*/   //ÀÁººÊ½
		return fruitstore;
	}
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key,fruit);
	}
	public MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
	
}
