package BridgePattern;

//笔记本电脑
public class Laptop extends Computer {
	public Laptop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("出售笔记本");
    }
}
