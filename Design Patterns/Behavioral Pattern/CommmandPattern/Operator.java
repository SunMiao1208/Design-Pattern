package CommmandPattern;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO 自动生成的方法存根
		String str="";
		for(String key:order.getFruitmap().keySet())
		{
			str+=key+order.getFruitmap().get(key);
		}
		System.out.println("混合果汁:"+str);
	}

}
