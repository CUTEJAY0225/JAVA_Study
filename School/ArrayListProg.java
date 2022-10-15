import java.util.*;
public class ArrayListProg {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// ArrayList<String> list = new ArrayList<>();
		// ArrayList 순서가 있는, 인덱스 사용, 객체를 검색/삭제 기능 추가, 객체는 저장하는게 아니라 번지를 참조, 중복 저장할경우 동일한 번지 참조, null저장될 경우 해당 인덱스는 객체 참조 X
		list.add("Pig"); // add(): list 맨 끝에 추가 
		list.add("Dog");
		list.add("Cow");
		
		System.out.println("ArrayList 객체 수: "+list.size());
		
		list.add("Snake");
		list.add(2,"Cat"); // add(,) 지정한 인덱스에 객체를 삽입
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)+" "); // get(): 인덱스 i에 들어있는 요소를 가져옴
		}
		System.out.println();
		
		list.remove(3); // remove(): 인덱스 3에 있는 요소 삭제 // 4번째 요소 삭제
		
		Iterator<String> e = list.iterator(); // Iterator: 정렬
		while(e.hasNext()) { // hasNext(): 정렬된 데이터 읽어주는 메소드
			System.out.println(e.next()+" "); // next(): 다음 요소를 읽어옴
		}
		System.out.println();
		
		list.remove("Pig");
		for(String obg:list) { // 향상된 for문
			System.out.println(obg+" ");
		}
	}

}
