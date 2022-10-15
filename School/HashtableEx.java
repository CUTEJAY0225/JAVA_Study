import java.util.*;
// 해쉬테이블에 저장되어 있는 모든 값을 알아내어 출력하는 프로그램
public class HashtableEx {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("Grapes", "포도");
		ht.put("Apple", "사과");
		ht.put("Strawberry", "딸기");
		ht.put("Orange", "오렌지");
		
		System.out.println("hashtable의 키의 수: "+ht.size());
		
		System.out.println("hashtable의 키로 값을 찾음: "+ht.get("Apple"));
		System.out.println();
		
		//키를 알고있는 경우 Get 메소드를 이용하여 찾지만 모르는 경우 저장된 전체 객체를 Set컬렉션으로 얻은 후에 사용해야함
		Set<String> keyset = ht.keySet(); // ht에 저장된 모든 키를 Set 컬렉션으로 얻음
		Iterator<String> keyiterator = keyset.iterator(); // 반복으로 키 생성해서 대입
		while(keyiterator.hasNext()) { // 정렬
			String k = keyiterator.next(); // 다음 요소 읽어옴
			String v = ht.get(k); // k(키)로 v(값) 가져옴
			System.out.println("키: "+k+"---> 값: "+v);
			
		}
	}

}
