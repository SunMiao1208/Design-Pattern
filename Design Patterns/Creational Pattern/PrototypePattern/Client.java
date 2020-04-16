package PrototypePattern;

public class Client {
	public static void main(String[] args) {
		MyFruit fruit1=new Apple();
		//MyFruit fruit2=fruit1;
		MyFruit fruit2=(Apple)fruit1.clone();
		fruit1.display();
		fruit2.display();
		System.out.println("fruit1:"+fruit1.hashCode());
		System.out.println("fruit2:"+fruit2.hashCode());
		System.out.println("fruit1:"+fruit1.toString());
		System.out.println("fruit2:"+fruit2.toString());
		System.out.println(fruit1==fruit2);
	}
	
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

}
