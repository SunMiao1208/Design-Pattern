package ObserverPattern;

public class Client {
	public static void main(String[] args) {
		SubjectS subject=new ConcreteSubjectA();
		ObserverS obj1=new ConcreteObserver1();
		ObserverS obj2=new ConcreteObserver2();
		subject.Add(obj1);
		subject.Add(obj2);
		subject.notifyObserver();
	}

}
