import java.util.*;
public class HashSetEx {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("VB"); // ��ü�� �߰��Ѵ�
		set.add("JAVA");
		set.add("VB");
		set.add("C");
		System.out.println("set�� ������ ����:" + set.size()); // set�� ������ ��ȯ
		
		set.remove("C");
		System.out.println("set�� ������ ����:" + set.size());
		
		Iterator<String> iterator = set.iterator(); // ����� �����͸� �ϰ������� ó���ϴ� �������̽� Iterator: �ݺ���
		while(iterator.hasNext()) { // hasNext(): ����Ʈ�� ���ĵ� �����͸� �о��ִ� �޼ҵ�
			String element = iterator.next(); // next(): ���� ��Ҹ� �о��
			System.out.println("\t" + element);
		}
		
		for(String str:set) { // ���� for��
			System.out.println("\t"+str);
		}
		
	}

}
