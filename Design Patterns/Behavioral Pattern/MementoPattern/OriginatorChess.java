package MementoPattern;

public class OriginatorChess {
	private MementoChess memchess;
	public OriginatorChess(MementoChess mem) {
		this.memchess=mem;
	}
	public void SetX(int x) {
		memchess.SetX(x);
	}
	public void SetY(int y) {
		memchess.SetY(y);
	}
	public MementoChess SavetoMemento() {
		return new MementoChess(memchess.getLable()	,
				memchess.getX(),memchess.getY());
	}
	
	public void Restore(MementoChess mem) {
		this.memchess.setLable(mem.getLable());
		this.memchess.SetX(mem.getX());
		this.memchess.SetY(mem.getY());
	} 
	public void Show() {
		System.out.println("µ±Ç°Æå×Ó×´Ì¬£º"+memchess.getLable()+
				"("+memchess.getX()+","+memchess.getY()+")");
	}
}
