package IteratorPattern;

//Iterator中最重要的两个方法就是next方法和hasNext方法，构成了遍历整个容器数据的两个方法。
//remove方法如果没有实现的话默认是会抛出一个不支持该操作的异常。
public interface Iterator<E> {
	boolean hasNext();
    
	E next();
    
	default void remove() {
        throw new UnsupportedOperationException();
    }
}
