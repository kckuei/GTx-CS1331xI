public class InsectClient {
  public static void main(String args[]) {
    System.out.println(Insect.produceRandomFact());
    
    // example of overloading, invoking with different constructors
    Insect bug0 = new Insect();
    Insect bug1 = new Insect(31);
    Insect bug2 = new Insect(100, 1, 3);
    
    // we can access because it's public
    System.out.println(bug2.DIST_WEIGHT_LOSS_FACTOR);
    System.out.println(Insect.DIST_WEIGHT_LOSS_FACTOR);

    System.out.println(bug2.getWeight());
    System.out.println(bug2.getX());
    System.out.println(bug2.getY());
    System.out.println(bug2.getPopulation());

    // attribute getters
    System.out.println(bug1.getX());
    System.out.println(bug1.getY());
    
    // setter
    bug1.setX(10);
    bug1.setY(25);

    System.out.println(bug1.getX());
    System.out.println(bug1.getY());
    
    // Call our own string method; note that we can overwrite it if we wanted
    System.out.println(bug0.toString2()); 
    System.out.println(bug1.toString2());    
    System.out.println(bug2.toString2());    
    
    // calling print on an object invokes the toString() method
    System.out.println(bug0); 
    System.out.println(bug1);    
    System.out.println(bug2);   
    
  }
}
