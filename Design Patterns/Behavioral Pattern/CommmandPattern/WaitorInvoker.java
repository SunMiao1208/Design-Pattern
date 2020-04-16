package CommmandPattern;

import java.util.ArrayList;

public class WaitorInvoker {
	private ArrayList<Command> commands=null;
	public WaitorInvoker()
	{
		commands=new ArrayList<Command>();
	}
	public void SetCommand(Command cmd)
	{
		commands.add(cmd);
	}
	public void OrderUp()
	{
		System.out.println("∂©µ•¿¥¡À:");
		for(Command cmd:commands)
		{
			if(cmd!=null)
				cmd.execute();
		}
	}

}
