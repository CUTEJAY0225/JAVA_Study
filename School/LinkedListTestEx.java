import java.util.*;
// LinkedList�� ArrayList ��ü ���� �ð� ��
public class LinkedListTestEx {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		long sstime; // ���� �ð�
		long endtime; // �� �ð�
		long calctime; // ��� �ð�
		
		llist.add("end");
		alist.add("end");
		
		sstime = System.nanoTime(); // nanoTime(): ���� ������ �޼��� LinkedList ����
		for(int x = 0; x<5000; x++) {
			llist.add(0, String.valueOf(x)); //add(0,) �ε��� 0���� �� ���� // valueOf(): x�� String������ ���
		}
		endtime = System.nanoTime();
		calctime = endtime - sstime;
		System.out.println("LinkedList ��ü ���� ���� �ð�: "+"\t"+calctime+" ns");
		
		sstime = System.nanoTime(); // ArrayList ����
		for(int x=0; x<5000; x++) {
			alist.add(0, String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime - sstime;
		System.out.println("ArrayList ��ü ���� ���� �ð�: "+"\t"+calctime+" ns");
	}

}
