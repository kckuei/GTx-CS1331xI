public class Bad2 {
    // division by zero, floats don't give division by zero error
    public static void main(String[] args) {
        int a = 1331;
        int b = 0;
        System.out.println("Welcome to \nCS 1331!");
        double c = (double) a / b;
        System.out.println("c is equal to: " + c);
    }
}
