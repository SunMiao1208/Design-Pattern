package CompositePattern;

import java.util.ArrayList;

public class Plate  extends MyElement {
    private ArrayList list=new ArrayList();

    public void eat(){
    	for(Object object:list) {
    		((MyElement)object).eat();
    	}
    }

    public void add(MyElement element){
    	list.add(element);
    }

    public void remove(MyElement element){
    	list.remove(element);
    }

}
