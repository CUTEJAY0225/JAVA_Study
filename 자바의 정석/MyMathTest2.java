class MyMath2{
	long a, b;
	
	long add() {return a+b;}
	long subtract() {return a-b;}
	
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
}

public class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 200L)); // 클래스 메서드라 바로 호출 가능
		System.out.println(MyMath2.subtract(200L, 200L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 200L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract()); // 인스턴스 메서드는 객체 생성 후 사용
		
				
	}

}
