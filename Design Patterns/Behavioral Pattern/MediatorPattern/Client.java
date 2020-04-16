package MediatorPattern;

public class Client {
	public static void main(String[] args) {
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4;
		member1=new DiamondMember("õõ²õ");
		member2=new DiamondMember("Ğ¡ÇÇ");
		member3=new CommonMember("ÂÀ²¼");
		member4=new CommonMember("ÖÜè¤");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		
		member1.sendText("ÂÀ²¼", "I LOVE YOU");
		member2.sendText("ÖÜè¤", "LOVE YOU");
		member1.sendImage("ÂÀ²¼", "ÖğÃÎÖ®Òô");
		member2.sendImage("ÖÜè¤", "çÍ·×¶À½ÇÊŞ");
		
		member3.sendText("õõ²õ", "I LOVE YOU,TOO");
		member4.sendText("Ğ¡ÇÇ", "LOVE YOU,TOO");
		member3.sendImage("õõ²õ", "ÖÙÏÄÒ¹Ö®ÃÎ");
		member4.sendImage("Ğ¡ÇÇ", "Ìì¶ìÖ®ÃÎ");
		
	}

}
