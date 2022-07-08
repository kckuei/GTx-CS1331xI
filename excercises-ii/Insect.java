public class Insect {
  // instance variables
  private double weight;
  private int x;
  private int y;

  // static constants/variables
  // note: public constants dont violate encapsulation because they can't be
  // modified
  public static final int DEFAULT_X = 0;
  public static final int DEFAULT_Y = 0;
  public static final double DEFAULT_WEIGHT = 0;
  public static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;
  private static int population = 0;
  private static final String[] FACTS = {
      "The two main groups of insects are winged and wingless",
      "There are more than 1 million inspect species",
      "Insects are cold-blooded",
      "Spiders are not considered insects"
  };

  // constructor
  public Insect(double weight, int x, int y) {
    this.weight = weight;
    this.x = x;
    this.y = y;
    population++;
  }

  public Insect(double weight) {
    this(weight, DEFAULT_X, DEFAULT_Y);
  }

  public Insect() {
    this(DEFAULT_WEIGHT);
  }

  // methods
  public double getWeight() {
    return weight;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public static int getPopulation() {
    return population;
  }

  public void setX(int x) {
    if (isLegalXY(x)) {
      this.x = x;
    }
  }

  public void setY(int y) {
    if (isLegalXY(y)) {
      this.y = y;
    }
  }

  public static boolean isLegalXY(int newXY) {
    return (newXY >= 0) ? true : false;
  }

  public void eat(double amount) {
    System.out.println("Nibble Nibble");
    weight = weight + amount;
  }

  public void move(int newX, int newY) {
    double distance = calculateDistance(x, y, newX, newY);
    if (distance > 0) {
      x = newX;
      y = newY;
      weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
      System.out.printf("Moved %.2f units\n", distance);
    } else
      System.out.println("Staying put");
  }

  // static methods
  // note: static methods belong to class, but not specific instance/object of a
  // class
  private static double calculateDistance(double x1, double y1,
      double x2, double y2) {
    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
  }

  public static String produceRandomFact() {
    int index = (int) (Math.random() * ((FACTS.length - 1) + 1));
    return FACTS[index];
  }

  public String toString2() {
    return this.toString() + ", weight: " + weight + ", x: " + x + ",y: " + y;
  }

  // test method
  public static void main(String[] arg) {
    System.out.println("Insect population: " + population);
    Insect insect1 = new Insect();
    System.out.println("Insect population: " + population);
    Insect insect2 = new Insect();
    System.out.println("Insect population: " + population);
    Insect buzz1 = new Insect(10, 100, 90);
    System.out.println("Insect population: " + population);
    Insect buzz2 = new Insect(4, -300, 400);
    System.out.println("Insect population: " + population);

    buzz1.move(1, 10);
    buzz2.move(-300, 400);

    System.out.println(Insect.DIST_WEIGHT_LOSS_FACTOR);
    System.out.println(DIST_WEIGHT_LOSS_FACTOR);

    System.out.println(produceRandomFact());
  }
}
