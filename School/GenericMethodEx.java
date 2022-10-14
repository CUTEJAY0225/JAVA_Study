class GenericClass<T>{ // ���׸� Ÿ���� Ŭ����
	private T tparam;
	public T getTparam() { // ��ȯ�� T
		return tparam;
	} 
	public void setTparam(T tparam) { //��ȯ�� ��� T �Ⱦ�
		this.tparam = tparam;
	}
}
class Utility{        // ��ȯ��         // �޼ҵ� �̸� // ���� �Ű����� Ÿ�� T
	public static <T> GenericClass<T> gmove(T t){
		GenericClass<T> gt = new GenericClass<>(); // �ν��Ͻ� Ŭ������ ��ü ���� �� ���
		gt.setTparam(t); // tparam�� �� �������
		return gt;
	}
}
public class GenericMethodEx {
	public static void main(String[] args) {
		GenericClass<String> gmex1 = Utility.gmove("�ڹ� 2"); // ��� 1: Ÿ�� ��� ����
		String strValue = gmex1.getTparam();
		System.out.println("ù��° ȣ�� ���: "+strValue);
		
		GenericClass<Integer> gmex2 = Utility.<Integer>gmove(200);
		int intValue = gmex2.getTparam();
		System.out.println("�ι�° ȣ�� ���: "+intValue);
	}

}
