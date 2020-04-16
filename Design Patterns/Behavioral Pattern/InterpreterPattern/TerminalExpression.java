package InterpreterPattern;

public class TerminalExpression implements Expression {
	
	private String data;
	public TerminalExpression(String data) {
		// TODO 自动生成的构造函数存根
		this.data=data;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO 自动生成的方法存根
		if(context.contains(context))
			return true;
		return false;
	}
}
