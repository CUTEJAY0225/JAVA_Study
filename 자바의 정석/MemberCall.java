class MemberCall {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // Ŭ���� ����
	
	int iv2 = cv; // �ν��Ͻ� ������ Ŭ���� ���� ��� ����
	static int cv2 = new MemberCall().iv; // ��ü ������ �ν��Ͻ� ���� ��� ����
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // Ŭ���� �޼��忡�� ��ü �����ؾ� �ν��Ͻ� �޼��� ��� ����
	}
	
	void instanceMethod1() {
		System.out.println(cv); // Ŭ���� ���� ����
		System.out.println(iv); // �ν��Ͻ� ���� ����
	}
	
	static void staticMethod2() {
		staticMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // ��ü ����� �ν��Ͻ� �޼��� ȣ�� ����
		
	}
	
}
