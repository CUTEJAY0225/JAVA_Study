class Car{
	String color;
	String geartype;
	int door;
	
	Car(){}
	
	Car(String c, String g, int d){
		color = c;
		geartype = g;
		door = d;
	}
}
public class carTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "White";
		c1.geartype = "Auto";
		c1.door = 4;
		
		Car c2 = new Car("White", "Auto", 4); // �̷��� �ѹ��� �ʱ�ȭ ����
	}

}
