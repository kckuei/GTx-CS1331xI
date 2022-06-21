import java.util.Scanner;

public class Calculator {

  public static void add(int a, int b) {
    System.out.printf("Answer: %d", a + b);
  }

  public static void subtract(int a, int b) {
    System.out.printf("Answer: %d", a - b);
  }
  
  public static void multiply(double a, double b) {
    System.out.printf("Answer: %.2f",a * b);
  }

  public static void divide(double a, double b) {
    System.out.printf("Answer: %.2f", a / b);
  }
  
  public static void alphabetize(String a, String b) {
    if (a.compareTo(b) < 0) {
      System.out.printf("Answer: %s comes before %s alphabetically", a, b);
    }
    else if (a.compareTo(b) > 0) {
      System.out.printf("Answer: %s comes before %s alphabetically", b, a);
    }
    else {
      System.out.printf("Answer: Chicken or Egg");
    }
  }

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
  
    System.out.println("List of operations: add subtract multiply divide alphabetize");
    
    System.out.println("Enter an operation:");
    String operation = input.next();
    
    operation = operation.toLowerCase();
    
    // if operation invalid, shoudl exit before request input
    // need faily gracefully if invalid input type
    
    switch (operation) {
    	case "add":
    	  System.out.println("Enter two integers:");
    	  int a = input.nextInt();
    	  int b = input.nextInt();
    	  add(a, b);
    	  break;
    	case "subtract":
    	  System.out.println("Enter two integers:");
    	  int a1 = input.nextInt();
    	  int b1 = input.nextInt();
    	  subtract(a1, b1);
    	  break;
    	case "multiply":
    	  System.out.println("Enter two doubles:");
    	  double a2 = input.nextDouble();
    	  double b2 = input.nextDouble();
    	  multiply(a2, b2);
    	  break;
    	case "divide":
    	  System.out.println("Enter two doubles:");
    	  double a3 = input.nextDouble();
    	  double b3 = input.nextDouble();
    	  if (b3 != 0) {  	
	    divide(a3, b3);
	  } 
	  else {
	    System.out.println("Invalid input entered. Terminating...");
	  }
    	  break;
    	case "alphabetize":
    	  System.out.println("Enter two words:");
    	  String a4 = input.next();
    	  String b4 = input.next();
    	  alphabetize(a4, b4);
    	  break;
    	default:
    	  System.out.println("Invalid input entered. Terminating...");
    	  break;
    }
  
  }

}
