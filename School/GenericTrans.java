class GenericClass<T>{ // 제네릭 클래스 생성
	private T tparam; // T라는 가상 자료형
	public T getTparam() { // T라는 가상 자료형 가지는 메소드
		return tparam; 
	}
	public void setTparam(T tparam) { // T tparam을 매개변수로 갖는 반환값이 없는 메소드 (void)
		this.tparam = tparam; // 인스턴스 변수 참조
	}
}
public class GenericTrans {
	public static void main(String[] args) {
		GenericClass<String> gcs = new GenericClass<>(); // String형 제네릭 클래스 생성
		gcs.setTparam("제네릭 클래스"); // setTparam에 "제네릭 클래스"를 매개변수 자리에 넣음
		System.out.println("반환값: "+gcs.getTparam()); // tparam값 반환하는 메서드
		
		GenericClass<Integer> gci = new GenericClass<>();
		gci.setTparam(125);
		System.out.println("반환값: "+gci.getTparam());
		
		GenericClass<Double> gcd = new GenericClass<>();
		gcd.setTparam(12.5);
		System.out.println("반환값: "+gcd.getTparam());
	}

}
