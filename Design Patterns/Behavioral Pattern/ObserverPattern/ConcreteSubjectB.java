package ObserverPattern;

public class ConcreteSubjectB extends SubjectS {
	public ConcreteSubjectB()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("B目标发生了改变");
		for(ObserverS obs:observers)
		{
			obs.response();
		}
	}

}
