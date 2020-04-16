package StrategyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chef chef=new Chef();
		ICutFruit cut=new MultiBlade();
		chef.SetCutMethod(cut);
		chef.CutFruit("橙子");
	}

}
