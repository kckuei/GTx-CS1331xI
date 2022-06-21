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
    
    if (!(operation.equals("add") || operation.equals("subtract") || operation.equals("multiply") || operation.equals("divide") || operation.equals("alphabetize") )) {
      System.out.println("Invalid input entered. Terminating...");
      return;
    }
    
    
    switch (operation) {
    	case "add":
          System.out.println("Enter two integers:");
          int a = input.nextInt();
          int b = input.nextInt();
          if (a.
          add(a, b);
    	  break;
    	case "subtract":
          System.out.println("Enter two integers:");
          int c = input.nextInt();
          int d = input.nextInt();
    	  subtract(c, d);
    	  break;
    	case "multiply":
          System.out.println("Enter two doubles:");
          double e = input.nextDouble();
          double f = input.nextDouble();
    	  multiply(e, f);
    	  break;
    	case "divide":
          System.out.println("Enter two doubles:");
          double g = input.nextDouble();
          double h = input.nextDouble();
    	  if (h != 0) divide(g, h);
	  else System.out.println("Invalid input entered. Terminating...");
    	  break;
    	case "alphabetize":
          System.out.println("Enter two words:");
          String s1 = input.next();
          String s2 = input.next();
    	  alphabetize(s1, s2);
    	  break;
    	default:
    	  System.out.println("Invalid input entered. Terminating...");
    	  break;
    }
  
  }

}
