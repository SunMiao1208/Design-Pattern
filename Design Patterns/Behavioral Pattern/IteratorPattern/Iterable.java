package IteratorPattern;

//Iterable接口十分简单，提供一个可以输出Iteator对象的方法
public interface Iterable<E> {
	Iterator<E> createIterator();
}
