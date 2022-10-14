class MyMath{
	long add(long a, long b) {return a+b;}
	long subtranct(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a,double b) {return a/b;}
}
public class MyMathTest {
	public static void main(String[] args) {
		MyMath mn = new MyMath(); //mymath °´Ã¼ »ý¼º
		long result1 = mn.add(5L, 3L);
		long result2 = mn.subtranct(5L, 3L);
		long result3 = mn.multiply(5L,3L);
		double result4 = mn.divide(5L, 3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}
