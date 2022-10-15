import java.util.*;
// �ؽ����̺� ����Ǿ� �ִ� ��� ���� �˾Ƴ��� ����ϴ� ���α׷�
public class HashtableEx {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("Grapes", "����");
		ht.put("Apple", "���");
		ht.put("Strawberry", "����");
		ht.put("Orange", "������");
		
		System.out.println("hashtable�� Ű�� ��: "+ht.size());
		
		System.out.println("hashtable�� Ű�� ���� ã��: "+ht.get("Apple"));
		System.out.println();
		
		//Ű�� �˰��ִ� ��� Get �޼ҵ带 �̿��Ͽ� ã���� �𸣴� ��� ����� ��ü ��ü�� Set�÷������� ���� �Ŀ� ����ؾ���
		Set<String> keyset = ht.keySet(); // ht�� ����� ��� Ű�� Set �÷������� ����
		Iterator<String> keyiterator = keyset.iterator(); // �ݺ����� Ű �����ؼ� ����
		while(keyiterator.hasNext()) { // ����
			String k = keyiterator.next(); // ���� ��� �о��
			String v = ht.get(k); // k(Ű)�� v(��) ������
			System.out.println("Ű: "+k+"---> ��: "+v);
			
		}
	}

}
