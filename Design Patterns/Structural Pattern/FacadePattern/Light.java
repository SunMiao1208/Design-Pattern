package FacadePattern;

public class Light {
	private String position;

	public Light(String position) {
		// TODO 自动生成的构造函数存根
		this.position=position;
	}

	public void on() {
		// TODO 自动生成的方法存根
		System.out.println(this.position+"灯开");
	}

	public void off() {
		// TODO 自动生成的方法存根
		System.out.println(this.position+"灯关");
	}

}
