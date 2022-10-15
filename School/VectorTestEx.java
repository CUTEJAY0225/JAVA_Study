import java.util.*;
class EmpInfo{
	String name;
	String tel;
	String address;
	public EmpInfo(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
}
public class VectorTestEx {
	public static void main(String[] args) {
		Vector<EmpInfo> vector = new Vector<>();
		
		// EmpInfo 메서드에 매개변수 값들 집어넣음 // 객체화 시켜서 넣어야함
		vector.add(new EmpInfo("홍길동", "010-3221-6789", "서울 은평구"));
		vector.add(new EmpInfo("서제이", "010-2019-0225", "고양 화정동"));
		vector.add(new EmpInfo("정재현", "010-0214-1997", "서울 강남구"));
		
		System.out.println("벡터의 크기: "+vector.size()); // size(): 벡터의 크기 반환 
		System.out.println("벡터의 저장 용량: "+vector.capacity()); // capacity(): 벡터의 저장 용량 반환
		
		vector.remove(2); // 인덱스 2에 있는거 지움 3번째꺼
		System.out.println();
		for(int i=0; i<vector.size(); i++) {
			EmpInfo info = vector.get(i); // get(): 인덱스에 저장된 객체 반환
			System.out.println(info.name+"\t"+info.tel+"\t"+info.address);
		}
	}

}
