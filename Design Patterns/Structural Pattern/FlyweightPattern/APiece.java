package FlyweightPattern;

public abstract class APiece {
	protected String inKind;
	public APiece(String inKind) {
		// TODO 自动生成的构造函数存根
		this.inKind=inKind;
	}
	//下棋时落子的位置
	public abstract void Play(int x,int y) ;	
}
