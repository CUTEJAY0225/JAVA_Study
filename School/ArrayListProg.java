import java.util.*;
public class ArrayListProg {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// ArrayList<String> list = new ArrayList<>();
		// ArrayList ������ �ִ�, �ε��� ���, ��ü�� �˻�/���� ��� �߰�, ��ü�� �����ϴ°� �ƴ϶� ������ ����, �ߺ� �����Ұ�� ������ ���� ����, null����� ��� �ش� �ε����� ��ü ���� X
		list.add("Pig"); // add(): list �� ���� �߰� 
		list.add("Dog");
		list.add("Cow");
		
		System.out.println("ArrayList ��ü ��: "+list.size());
		
		list.add("Snake");
		list.add(2,"Cat"); // add(,) ������ �ε����� ��ü�� ����
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)+" "); // get(): �ε��� i�� ����ִ� ��Ҹ� ������
		}
		System.out.println();
		
		list.remove(3); // remove(): �ε��� 3�� �ִ� ��� ���� // 4��° ��� ����
		
		Iterator<String> e = list.iterator(); // Iterator: ����
		while(e.hasNext()) { // hasNext(): ���ĵ� ������ �о��ִ� �޼ҵ�
			System.out.println(e.next()+" "); // next(): ���� ��Ҹ� �о��
		}
		System.out.println();
		
		list.remove("Pig");
		for(String obg:list) { // ���� for��
			System.out.println(obg+" ");
		}
	}

}
