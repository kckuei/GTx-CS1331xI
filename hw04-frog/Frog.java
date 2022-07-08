public class Frog  {

  // instance variables
  private String name;
  private int age;
  private double tongueSpeed;
  private boolean isFroglet;
  
  // constatic/static variables
  private static String species = "Rare Pepe";
  private static int DEFAULT_AGE = 5;
  private static double DEFAULT_TONGUESPEED = 5;
  
  
  // constructors
  public Frog(String name, int age, double tongueSpeed) {
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
  }
  public Frog(String name, double ageInYears, double tongueSpeed) {
    this(name, (int)(ageInYears*12) , tongueSpeed);
  }
  public Frog(String name) {
    this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
  }
  
  // methods
  public void grow(int months) {
    // update the age and tonguespeed based on age
    while (months > 0) {
      this.age += 1;
      if (this.age < 12) {
        this.tongueSpeed += 1;
      }
      if (this.age > 30) {
        if (tongueSpeed > 5) {
          this.tongueSpeed -= 1;
        }
      }
      months -= 1;
    }
    // update froglet state based on age
    if (this.age > 1 && this.age < 7) {
      this.isFroglet = true;
    } else {
      this.isFroglet = false;
    }
  }
  
  public void grow() {
    grow(1);
  }
  
  public void eat(Fly fly) {
    if (!fly.isDead()) {
      if (tongueSpeed > fly.getSpeed()) {
        if (fly.getMass() >= 0.5 * age) {
          grow(1);
        }
        fly.setMass(0);
      }
      else {
        fly.grow(1);
      }
    }
  }
  
  public String toString() {
    if (isFroglet) {
      return "My name is " + name + " and I’m a rare froglet! I’m " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
    }
    else {
      return "My name is " + name + " and I’m a rare frog. I’m " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
    }
  }
  
  public String getSpecies() {
    return this.species;
  }
  
  public void setSpecies(String species) {
    this.species = species;
  }
  

  public static void main(String[] args) {
    Frog froggy = new Frog("Froggy");
    Frog frogger = new Frog("Frogger");
    froggy.grow();
    froggy.grow(10);

    System.out.println(froggy.species);    
    System.out.println(frogger.species);
    Frog.species = "pepe la fey";
    froggy.species = "pepe la popp";
    System.out.println(froggy.species);    
    System.out.println(frogger.species);
  }
  
  
}
