class MemberCall {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수
	
	int iv2 = cv; // 인스턴스 변수는 클래스 변수 사용 가능
	static int cv2 = new MemberCall().iv; // 객체 만들어야 인스턴스 변수 사용 가능
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 클레스 메서드에서 객체 생성해야 인스턴스 메서드 사용 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv); // 클래스 변수 가능
		System.out.println(iv); // 인스턴스 변수 가능
	}
	
	static void staticMethod2() {
		staticMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 객체 만들고 인스턴스 메서드 호출 가능
		
	}
	
}
