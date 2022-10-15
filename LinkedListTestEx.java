import java.util.*;
// LinkedList와 ArrayList 객체 삽입 시간 비교
public class LinkedListTestEx {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		long sstime; // 시작 시간
		long endtime; // 끝 시간
		long calctime; // 계산 시간
		
		llist.add("end");
		alist.add("end");
		
		sstime = System.nanoTime(); // nanoTime(): 성능 측정용 메서드 LinkedList 측정
		for(int x = 0; x<5000; x++) {
			llist.add(0, String.valueOf(x)); //add(0,) 인덱스 0번에 값 저장 // valueOf(): x를 String형으로 출력
		}
		endtime = System.nanoTime();
		calctime = endtime - sstime;
		System.out.println("LinkedList 객체 삽입 측정 시간: "+"\t"+calctime+" ns");
		
		sstime = System.nanoTime(); // ArrayList 측정
		for(int x=0; x<5000; x++) {
			alist.add(0, String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime - sstime;
		System.out.println("ArrayList 객체 삽입 측정 시간: "+"\t"+calctime+" ns");
	}

}
