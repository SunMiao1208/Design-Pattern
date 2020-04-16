package TemplateMethodPattern;

public abstract class AbstractCook {
	//模板方法，用来控制炒菜的流程 （炒菜的流程是一样的-复用）
	//申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序 
	final void cookProcess(){
		this.pourOil();          //第一步：倒油
		this.HeatOil();          //第二步：热油
	    this.pourVegetable();    //第三步：倒蔬菜
	    this.pourSauce();        //第四步：倒调味料
	    this.fry();              //第五步：翻炒
	}
	//定义结构里哪些方法是所有过程都是一样的可复用的，哪些是需要子类进行实现的

	//第一步：倒油是一样的，所以直接实现
	void pourOil(){  
		System.out.println("倒油");  
		}  

	//第二步：热油是一样的，所以直接实现
	void  HeatOil(){  
		System.out.println("热油");  
		}  
	
	//所以声明为抽象方法，具体由子类实现 
	abstract void  pourVegetable();
	
	//第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
	//所以声明为抽象方法，具体由子类实现 
	abstract void  pourSauce();
	
	//第五步：翻炒是一样的，所以直接实现
	void fry(){  
		System.out.println("炒啊炒啊炒到熟啊");  
		} 
}
	