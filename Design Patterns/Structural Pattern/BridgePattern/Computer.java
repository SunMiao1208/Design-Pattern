package BridgePattern;

//电脑类型+获得品牌的引用
public class Computer {
	protected Brand brand;
	
	public Computer(Brand b) {
     this.brand = b;
     }
	
	public void sale(){
     brand.sale();
     }
}
