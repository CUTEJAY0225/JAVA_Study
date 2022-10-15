import java.util.*;
public class HashSetEx {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("VB"); // 객체를 추가한다
		set.add("JAVA");
		set.add("VB");
		set.add("C");
		System.out.println("set의 데이터 개수:" + set.size()); // set의 사이즈 반환
		
		set.remove("C");
		System.out.println("set의 데이터 개수:" + set.size());
		
		Iterator<String> iterator = set.iterator(); // 저장된 데이터를 일관적으로 처리하는 인터페이스 Iterator: 반복자
		while(iterator.hasNext()) { // hasNext(): 리스트로 정렬된 데이터를 읽어주는 메소드
			String element = iterator.next(); // next(): 다음 요소를 읽어옴
			System.out.println("\t" + element);
		}
		
		for(String str:set) { // 향상된 for문
			System.out.println("\t"+str);
		}
		
	}

}
