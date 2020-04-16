package IteratorPattern;

//拥有容器数据处理方法的类持有一个实现Iterator接口的对象，并使用Iterator接口方法进行数据访问。
public class IterateWithIterator {
    private Iterator elements;

    public void setContainer(Iterator newElements) {
        this.elements = newElements;
    }

    // 访问并且处理容器数据的方法
    public void printElemtents() {
        if (elements == null) throw new NullPointerException();
        // 访问list容器内的数据
        while (elements.hasNext()) {
            System.out.println(elements.next());
        }

    }

    public static void main(String[] args) {
        IterateWithIterator it = new IterateWithIterator();
        it.setContainer(new MyContainer<Byte>().createIterator());
        it.printElemtents();
    }
}
