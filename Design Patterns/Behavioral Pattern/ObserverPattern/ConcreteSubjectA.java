package ObserverPattern;

public class ConcreteSubjectA extends SubjectS {
	public ConcreteSubjectA()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("A目标发生了改变");
		for(ObserverS obs:observers)
		{
			obs.response();
		}
	}
}
