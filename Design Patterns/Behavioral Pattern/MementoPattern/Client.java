package MementoPattern;

public class Client {
	public static void main(String[] args) {
		OriginatorChess chess=new OriginatorChess(new MementoChess("黑",2,2));
		
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}

	private static int index=0;
	private static CaretakerChess caretaker=new CaretakerChess();
	private static void play(OriginatorChess chess) {
		// TODO 自动生成的方法存根
		index++;
		caretaker.AddMem(chess.SavetoMemento());
		chess.Show();
	}
	
	private static void undo(OriginatorChess chess, int i) {
		// TODO 自动生成的方法存根
		System.out.println("**********悔棋**********");
		index--;
		chess.Restore(caretaker.getMem(index-1));
		chess.Show();
	}
	private static void redo(OriginatorChess chess, int i) {
		// TODO 自动生成的方法存根
		System.out.println("*********撤销悔棋*********");
		chess.Restore(caretaker.getMem(index));
		index++;
		chess.Show();
	}
}
