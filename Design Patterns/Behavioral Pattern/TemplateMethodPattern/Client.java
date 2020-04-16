package TemplateMethodPattern;

public class Client {
	 public static void main(String[] args){
		 //³´ - ÊÖËº°ü²Ë
		 ConcreteClass_BaoCai BaoCai = new ConcreteClass_BaoCai();
		 BaoCai.cookProcess();

		//³´ - ËâÈØ²ËĞÄ
		ConcreteClass_CaiXin CaiXin = new ConcreteClass_CaiXin();
		CaiXin.cookProcess();
		
	 }
}
