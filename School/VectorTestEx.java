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
		
		// EmpInfo �޼��忡 �Ű����� ���� ������� // ��üȭ ���Ѽ� �־����
		vector.add(new EmpInfo("ȫ�浿", "010-3221-6789", "���� ����"));
		vector.add(new EmpInfo("������", "010-2019-0225", "��� ȭ����"));
		vector.add(new EmpInfo("������", "010-0214-1997", "���� ������"));
		
		System.out.println("������ ũ��: "+vector.size()); // size(): ������ ũ�� ��ȯ 
		System.out.println("������ ���� �뷮: "+vector.capacity()); // capacity(): ������ ���� �뷮 ��ȯ
		
		vector.remove(2); // �ε��� 2�� �ִ°� ���� 3��°��
		System.out.println();
		for(int i=0; i<vector.size(); i++) {
			EmpInfo info = vector.get(i); // get(): �ε����� ����� ��ü ��ȯ
			System.out.println(info.name+"\t"+info.tel+"\t"+info.address);
		}
	}

}
