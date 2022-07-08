public class AveragerForEach {
  public static void main(String[] args) {
    double[] weekHighs = {80, 80, 75, 69, 72, 74, 90};
    
    double highSum = 0;
    for (double dayHigh : weekHighs) {
      highSum += dayHigh;
    }
    double averageHighs = highSum / weekHighs.length;
    System.out.println("Average is: " + averageHighs);
  }
}
