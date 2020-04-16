package ProxyPattern;

public class CLocalShowPic implements Runnable, IShowPic {
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		pic.ShowPic(picname);
		System.out.println(picname+"图片调用完成");

	}
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO 自动生成的方法存根
		pic=new CRemoPic();
		this.picname=picname;
		System.out.println("准备载入图片"+picname);
		Thread th=new Thread(this);
		th.start();

	}



}
