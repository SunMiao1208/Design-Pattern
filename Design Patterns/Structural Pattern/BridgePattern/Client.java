package BridgePattern;

public class Client {
    public static void main(String[] args) {

        //获得品牌 + 类型
        Computer c1=new Laptop(new Lenovo());
        c1.sale();

        Computer c2=new Desktop(new Shenzhou());
        c2.sale();

    }
}
