package DProxyPattern;

public class CTest implements ITestInterface {

	@Override
	public void SendMessage(String mes) {
		// TODO 自动生成的方法存根
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"敌军还有"+i+"秒到达战场！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println(mes+"敌军已到达战场！");

	}

}
