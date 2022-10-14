class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 조상 클래스 멤버 사용 가능
		ctv.channelUp(); // 조상 클래스 메서드 사용 가능
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // 자막 기능을 켬
		ctv.displayCaption("Hello, World");
	}

}
