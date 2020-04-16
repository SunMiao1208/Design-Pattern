package MementoPattern;

public class MementoChess {
	private String label;
	private int x,y;
	
	public MementoChess( String label, int x, int y) {
		// TODO 自动生成的构造函数存根
		this.label=label;
		this.x=x;
		this.y=y;
	}

	public String getLable() {
		// TODO 自动生成的方法存根
		return label;
	}
	
	public void setLable(String label) {
		// TODO 自动生成的方法存根
		this.label=label;
	}
	
	public void SetX(int x) {
		// TODO 自动生成的方法存根
		this.x=x;	
	}

	public void SetY(int y) {
		// TODO 自动生成的方法存根
		this.y=y;
	}

	public int getX() {
		// TODO 自动生成的方法存根
		return x;
	}

	public int getY() {
		// TODO 自动生成的方法存根
		return y;
	}

	

}
