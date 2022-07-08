import java.util.Scanner;

public class Rhomba {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter d1: ");
    double d1 = input.nextDouble();
    System.out.println("Please enter d2: ");
    double d2 = input.nextDouble();
    double area = (d1 * d2) / 2.0;
    System.out.printf("Area = %.3f\n", area);
	}
}
