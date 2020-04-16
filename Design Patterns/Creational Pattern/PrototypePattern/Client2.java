package PrototypePattern;
//原型管理器

public class Client2 {
	public static void main(String[] args) {
		MyFruit fruit1=new Apple();
		MyFruit fruit2=new Banana();
		
		MyFruitStore.Add(1,fruit1);
		MyFruitStore.Add(2,fruit2);
		MyFruitStore.Add(3,new Apple());
		MyFruitStore.Add(4,new Banana());
		MyFruit fruit=MyFruitStore.Get(1);
		fruit.display();
	}
}
