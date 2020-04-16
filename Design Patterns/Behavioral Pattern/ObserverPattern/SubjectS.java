package ObserverPattern;

import java.util.ArrayList;

public abstract class SubjectS {
	protected ArrayList<ObserverS> observers;
	public SubjectS()
	{
		observers=new ArrayList<ObserverS>();
	}
	public void Add(ObserverS observer) 
	{
		observers.add(observer);
	}
	public void Remove(ObserverS observer) 
	{
		observers.remove(observer);
	}
	public abstract void notifyObserver();

}
