package FlyweightPattern;

public class OnePiece extends APiece {

	public OnePiece(String inKind) {
		super(inKind);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void Play(int x, int y) {
		// TODO 自动生成的方法存根
		System.out.println("把"+inKind+"子放在("+x+","+y+")的位置");
	}

}
