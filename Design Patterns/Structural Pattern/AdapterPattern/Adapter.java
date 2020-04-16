package AdapterPattern;

//类适配器
/*public class Adapter extends OldJuicer implements InewJuicer {
    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	String str="混合果汁：" +onePort(fruit1);
    	str+=onePort(fruit2);
    	return str;
    }
}*/


//对象适配器
public class Adapter implements InewJuicer {
	private  OldJuicer oldJuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2){
	  oldJuicer=new OldJuicer();  
	  String str="混合果汁：" +oldJuicer.onePort(fruit1);
	  str+=oldJuicer.onePort(fruit2);
	  return str;
	 }
}
