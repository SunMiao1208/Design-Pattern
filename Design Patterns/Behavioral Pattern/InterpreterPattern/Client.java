package InterpreterPattern;

public class Client {
	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWomen=getMarriedWomenExpression();
		
		System.out.println("John is male?"+isMale.interpret("Joh"));
		System.out.println("Julie is a married women?"+isMarriedWomen.interpret("Married Julie"));
	}
	
    //规则：Robert和John是男性
	private static Expression getMarriedWomenExpression() {
		// TODO 自动生成的方法存根
		Expression robert=new TerminalExpression("Robert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	//规则：Julie是一个已婚的女性
	private static Expression getMaleExpression() {
		// TODO 自动生成的方法存根
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
}
