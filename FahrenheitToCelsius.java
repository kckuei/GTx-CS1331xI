import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
    
    	final int MAX_TEMP = 140;
    	final int MIN_PARK_TEMP = 70;
    	final int MAX_PARK_TEMP = 90;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();      
        while (fahrenheit >= MAX_TEMP) {
        	System.out.print("Error: The Fahrenheight value must be lower than " + MAX_TEMP);
        	fahrenheit = input.nextInt();   
        } 
  
        
        System.out.print("Enter a day of the week: ");
        String day = input.next();        
        
        System.out.print("Enter your preferred Celsius label (Celsius, Centigrade, or C):");
        String cText = input.next();        

        double celsius = (5.0/9) * (fahrenheit - 32);
        
        System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
        System.out.printf("%s %-11s %,.2f\n", day, cText+":", celsius);
        

        if ((fahrenheit >= 70) && (fahrenheit <= 90)) {
            System.out.println("Yay! Go to park.");
        }
        else {
            System.out.println("Stay home where there’s wi-fi and learn 1331 online");
        }
    }
}
