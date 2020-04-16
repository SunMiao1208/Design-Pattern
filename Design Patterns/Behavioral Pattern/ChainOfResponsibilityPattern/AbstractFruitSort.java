package ChainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;
	protected List<String> fruitBox;
	private AbstractFruitSort nextFruitSort;
	public void getFruitBox()
	{
		System.out.println("Weight£º"+weight);
		System.out.println("¸öÊý£º"+fruitBox.size());
		for(String t:fruitBox)
		{
			System.out.print(t+",");
		}
		System.out.println(" ");
	}
	public AbstractFruitSort(int weight)
	{
		this.weight=weight;
		fruitBox=new ArrayList<String>();
	}
	public void setNextSort(AbstractFruitSort nextFruitSort)
	{
		this.nextFruitSort=nextFruitSort;
	}	
	public void sendFruit(int weight,String fruit)
	{
		if(this.weight==weight)
			pushBox(fruit);
		else
			if(nextFruitSort!=null)
				nextFruitSort.sendFruit(weight, fruit);
			
	}
	abstract protected void pushBox(String fruit);
}
