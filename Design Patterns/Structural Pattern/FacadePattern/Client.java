package FacadePattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------");
		gsf.off();
	}

}
