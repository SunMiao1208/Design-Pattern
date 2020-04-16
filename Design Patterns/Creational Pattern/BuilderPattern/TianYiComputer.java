package BuilderPattern;

//联想天逸510Pro电脑配置
public class TianYiComputer extends AbstractComputer {

	  @Override
	    public void display() {
	        System.out.println("联想23英寸超大屏幕");
	    }
	 
	    @Override
	    public void cpu() {
	        System.out.println("Intel Core I5-7400,三级缓存6MB,4核，3.00GHz");
	    }
	 
	    @Override
	    public void memory() {
	        System.out.println("DDR4 8G内存，最大扩容到32G");
	    }
	 
	    @Override
	    public void disk() {
	        System.out.println("1TB超大容量内存，转速7200转/分钟");
	    }
	 
	    @Override
	    public void mainboard() {
	        System.out.println("因特尔主板");
	    }
	 
	    @Override
	    public void keyboard() {
	        System.out.println("联想无线键盘");
	    }
	 
	    @Override
	    public void mouse() {
	        System.out.println("联想无线鼠标");
	    }
	 
	    @Override
	    public void crate() {
	        System.out.println("联想自主研发ideacentre机箱");
	    }
}
