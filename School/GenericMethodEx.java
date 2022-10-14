class GenericClass<T>{ // 제네릭 타입의 클래스
	private T tparam;
	public T getTparam() { // 반환값 T
		return tparam;
	} 
	public void setTparam(T tparam) { //반환값 없어서 T 안씀
		this.tparam = tparam;
	}
}
class Utility{        // 반환형         // 메소드 이름 // 형식 매개변수 타입 T
	public static <T> GenericClass<T> gmove(T t){
		GenericClass<T> gt = new GenericClass<>(); // 인스턴스 클래스라 객체 생성 후 사용
		gt.setTparam(t); // tparam에 값 집어넣음
		return gt;
	}
}
public class GenericMethodEx {
	public static void main(String[] args) {
		GenericClass<String> gmex1 = Utility.gmove("자바 2"); // 방법 1: 타입 명시 안함
		String strValue = gmex1.getTparam();
		System.out.println("첫번째 호출 방식: "+strValue);
		
		GenericClass<Integer> gmex2 = Utility.<Integer>gmove(200);
		int intValue = gmex2.getTparam();
		System.out.println("두번째 호출 방식: "+intValue);
	}

}
