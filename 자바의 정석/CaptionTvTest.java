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
		ctv.channel = 10; // ���� Ŭ���� ��� ��� ����
		ctv.channelUp(); // ���� Ŭ���� �޼��� ��� ����
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // �ڸ� ����� ��
		ctv.displayCaption("Hello, World");
	}

}
