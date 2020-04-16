package StatePattern;

public class DeadState extends ThreadState {
	public DeadState()
	{
		state=StateSet.DEAD;
		System.out.println("线程死亡");
	}
	public void stop(ThreadContext tc) 
	{
		System.out.println("调用了stop方法");
		if(state==StateSet.DEAD)
			tc.setThreadState(new DeadState());
		else
			System.out.println("当前线程不是死亡状态");
	}

}
