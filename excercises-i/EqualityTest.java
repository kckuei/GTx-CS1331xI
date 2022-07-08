public class EqualityTest {
	public static void main(String[] args) {
		//String x = new String("park"); // not alises
		String x = "park"; // are aliases, use the same const string pool
		String y = "park";
	
		if (x == y) {
			System.out.println("x and y are aliases");
		}
		if (x != y) {
			System.out.println("x and y are not aliases");
		}
		if (x.equals(y)) {
			System.out.println("x and y have the same contents");
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	}
}
