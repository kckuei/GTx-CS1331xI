public class SomeOtherProgram {
  public static void main(String[] args) {
   // Call external methods
    String[] lullabies = {"Wheels on the Bus", "Twinkle, Twinkle Little Star", 
                          "Itsy Bitsy Spider", "Swing Low Sweet Chariot", 
                          "Amazing Grace"};
    System.out.println(ArraySearch.searchStringArray("Amazing Grace", lullabies));
    System.out.println(ArraySearch.searchStringArray("Humpty Dumpty", lullabies));
    
    
    // Let's also test our overloaded methods
    System.out.println(ArraySearch2.searchArray("Humpty Dumpty", lullabies));
    
    int[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
    System.out.println(ArraySearch2.searchArray(90, weekHighs));
    
    // Note, println is actually an overloaded method!
    System.out.println("90"); //calls println(String)
    System.out.println(90); //calls println(int)
    System.out.println(90L); //calls println(long)
    System.out.println(90.0F); //calls println(float)
    System.out.println(90.0); //calls println(double)
    System.out.println('9'); //calls println(char)
    System.out.println(true); //calls println(boolean)
  }
}
