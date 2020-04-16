package IteratorPattern;

//容器实现Iterable接口.
public class MyContainer<E> implements Iterable<E>{

    Object[] elements;

    public MyContainer() {
        elements = new Byte[10];
        for (int i =0; i < 10; i ++)
            elements[i] = (byte) i;
    }

    private class Itr<E> implements Iterator<E> {
        private int position = -1;
        private Object[] data = elements;
        @Override
        public boolean hasNext() {
            return ++ position < data.length;
        }

        @Override
        public E next() {
            return (E) data[position];
        }
    }

    @Override
    public Iterator<E> createIterator() {
        return new Itr();
    }

}

