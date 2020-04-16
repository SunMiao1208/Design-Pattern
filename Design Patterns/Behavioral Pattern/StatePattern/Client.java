package StatePattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCPU();
		//tc.suspend();
		tc.stop();
	}
}
