package AbstractFactoryPattern;

//创建实现相同接口的具体类
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
