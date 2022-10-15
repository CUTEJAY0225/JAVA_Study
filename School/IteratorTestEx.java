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
		
		list.add(new EmpInfo("ȫ�浿", "010-3221-6789", "���� ����"));
		list.add(new EmpInfo("������", "010-2019-0225", "��� ���籸"));
	    list.add(new EmpInfo("������", "010-1997-0225", "���� ������"));
	    
	    Iterator<EmpInfo> it = list.iterator(); // ArrayList�� list�� ������ �� �ִ� ������ �ѱ�
	    while(it.hasNext()) { // ���� // Interator �������̽��� �ִ� �޼ҵ带 ���
	    	EmpInfo info = it.next();
	    	System.out.println(info.name+"\t"+info.tel+"\t");
	    }
	}

}
