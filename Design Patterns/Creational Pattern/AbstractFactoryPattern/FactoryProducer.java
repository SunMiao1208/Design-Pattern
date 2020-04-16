package AbstractFactoryPattern;

//创建工厂生成器/生产器类，通过传递如Shape或Color等信息来获取工厂
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){

	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();

	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }

	      return null;
	   }
	
}
