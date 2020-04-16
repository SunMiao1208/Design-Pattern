package DProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
	private Object target;
	public CLocalPicShow(Object target) 
	{
		super();
		this.target=target;
	}
	public Object getProxyInstance()
	{
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO 自动生成的方法存根
						System.out.println("准备载入图片"+args[0].toString());
						Thread thr=new Thread(new Runnable() {
							
							@Override
							public void run() {
								// TODO 自动生成的方法存根
								try {
									method.invoke(target , args);
								} catch (IllegalAccessException e) {
									// TODO 自动生成的 catch 块
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO 自动生成的 catch 块
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO 自动生成的 catch 块
									e.printStackTrace();
								}
							}
						});
						thr.start();
						return null;
					}
				});
	}
	
}
