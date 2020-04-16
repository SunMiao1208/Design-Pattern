package SimpleFactory;

public class Factory {

	public Fruit CreateFruit(String kind) {
		// TODO 自动生成的方法存根
		if(kind.equals("A"))
			return new Apple();
		if(kind.equals("B"))
			return new Banana();
		return null;
	}

}
