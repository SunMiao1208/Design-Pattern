package BuilderPattern;

public class Demo {
	public static void main(String[] args) {
        //电脑创建好了
        AbstractComputer ac = new TianYiComputer();
        //组装
        ac.mouse();
        ac.memory();
        ac.disk();
    }
}
