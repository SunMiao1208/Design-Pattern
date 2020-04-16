package BuilderPattern;

//抽象电脑类型
public abstract class AbstractComputer {
    public abstract void display();    //显示器
    public abstract void cpu();        //CPU
    public abstract void memory();     //内存条
    public abstract void disk();       //硬盘
    public abstract void mainboard();  //主板
    public abstract void keyboard();   //键盘
    public abstract void mouse();     //鼠标
    public abstract void crate();     //机箱
}
