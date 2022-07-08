public class Fly {

  // instance variables
  private double mass;
  private double speed;
  
  // static/constant variables
  private static final double DEFAULT_MASS = 5;
  private static final double DEFAULT_SPEED = 10;
  
  // constructors
  public Fly(double mass, double speed) {
    this.mass = mass;
    this.speed = speed;
  }
  public Fly(double mass) {
    this(mass, DEFAULT_SPEED);
  }
  public Fly() {
    this(DEFAULT_MASS, DEFAULT_SPEED);
  }
  
  // methods
  public double getMass() {
    return this.mass;
  }
  
  public double getSpeed() {
    return this.speed;
  }
  
  public void setMass(double mass) {
    this.mass = mass;
  }
  
  public void setSpeed(double speed) {
    this.speed = speed;
  }
  
  public String toString() {
    if (this.mass == 0) {
      return "I'm dead, but I used to be a flay with a speed of " + String.format("%.2f", this.speed) + ".";
    }
    else {
      return "I'm a speedy fly with " + String.format("%.2f", this.speed) + " speed and " + String.format("%.2f", this.mass) + " mass.";
    }
  }
  
  public void grow(int addedMass) {
    while (addedMass > 0) {
      if (mass < 20) {
          speed += 1;
      } 
      else {
        speed -= 0.5;
      }
      mass += 1;
      addedMass -= 1;
    }
  }
  
  public boolean isDead() {
    if (this.mass == 0) {
      return true;
    }
    return false;
  }
  
  
  public static void main(String[] args) {
    Fly fly1 = new Fly();
    Fly fly2 = new Fly(13);
    Fly fly3 = new Fly(10,2);
    
    System.out.println(fly1.toString());
    System.out.println(fly2.toString());   
    System.out.println(fly3.toString());
    
    fly3.grow(10);
    System.out.println(fly3.toString());
    fly3.grow(10);
    System.out.println(fly3.toString()); 
  }
  
}
