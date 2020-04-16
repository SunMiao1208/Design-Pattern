package MediatorPattern;

public class CommonMember extends Member {
	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		// TODO 自动生成的方法存根
		System.out.println("普通会员发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO 自动生成的方法存根
		System.out.println("普通会员不能发送图片！");
	}

}
