package TemplateMethodPattern;

//炒手撕包菜的类
public class ConcreteClass_BaoCai extends AbstractCook {

	@Override
	void pourVegetable() {
		// TODO 自动生成的方法存根
		System.out.println("下锅的蔬菜是包菜");
	}

	@Override
	void pourSauce() {
		// TODO 自动生成的方法存根
		System.out.println("下锅的酱料是辣椒");
	}

}
