package ChainOfResponsibilityPattern;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		AbstractFruitSort Bfs,Mfs,Sfs;
		Bfs=new BigFruitSorting(9);
		Mfs=new MidFruitSorting(5);
		Sfs=new SmallFruitSorting(2);
		
		Bfs.setNextSort(Mfs);
		Mfs.setNextSort(Sfs);
		
		Random rm=new Random();
		for(int i=0;i<1000;i++)
		{
			int weight=rm.nextInt(10);
			Bfs.sendFruit(weight, "Æ»¹û");
		}
		Bfs.getFruitBox();
		Mfs.getFruitBox();
		Sfs.getFruitBox();
	}
}
