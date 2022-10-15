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
public class IteratorTestEx {
	public static void main(String[] args) {
		ArrayList<EmpInfo> list = new ArrayList<>();
		
		list.add(new EmpInfo("홍길동", "010-3221-6789", "서울 은평구"));
		list.add(new EmpInfo("서제이", "010-2019-0225", "고양 덕양구"));
	    list.add(new EmpInfo("정재현", "010-1997-0225", "서울 강남구"));
	    
	    Iterator<EmpInfo> it = list.iterator(); // ArrayList의 list에 접근할 수 있는 권한을 넘김
	    while(it.hasNext()) { // 정렬 // Interator 인터페이스에 있는 메소드를 사용
	    	EmpInfo info = it.next();
	    	System.out.println(info.name+"\t"+info.tel+"\t");
	    }
	}

}
