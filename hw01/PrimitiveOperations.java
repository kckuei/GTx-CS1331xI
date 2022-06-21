public class PrimitiveOperations {
	public static void main(String[] arg) {
		int x = 4;
		double y = 10.1;
		System.out.println(x);
		System.out.println(y);
		
		double z = x*y;
		System.out.println(z);
		
		double w = (double) x;
		System.out.println(w);
		
		char myChar = 'W';
		System.out.println(myChar);
		
		myChar = (char)((int) myChar + 32);
		System.out.println(myChar);
	}
}
