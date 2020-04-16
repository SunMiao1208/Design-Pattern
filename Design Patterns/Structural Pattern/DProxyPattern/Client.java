package DProxyPattern;

public class Client {
	public static void main(String[] args) {
		/*IShowPic isp=new CRemoPic();
		CLocalPicShow cpic=new CLocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("Photo");*/  //静态代理
		
		ITestInterface ipic=new CTest();
		ITestInterface proxy=(ITestInterface)new CLocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage(" ");     //动态代理
	}

}
