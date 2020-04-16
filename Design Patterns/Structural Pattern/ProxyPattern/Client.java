package ProxyPattern;

public class Client {
	public static void main(String[] args) {
		CLocalShowPic cls=new CLocalShowPic();
		cls.ShowPic("photo");
		//IShowPic ipic=new CRemoPic();
		//IShowPic proxy=(IShowPic) new CLocalShowPic();
		//proxy.ShowPic("AAA");
	}

}
