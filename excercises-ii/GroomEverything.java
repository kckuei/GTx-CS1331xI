public class GroomEverything {
    // example with interfaces
    // goal of creating a single array that could hold all kinds of groomable objects
    // objects may not share inheritance but all have a groom method
    // we declare a set of abstract methods that we expect a group of classes to define in their own way; once we compile the interface, we get a class file that represents a new type

    public static void main(String[] args) {
      // creates an array of interface objects that all have their own implementation of groom
      Groomable[] groomer = {
            new Wolf(17.01, 3), 
            new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
            new Wolf(16, 5),
            new Poodle("pixy", 4, "Top shelf", "Only the best"),
            new Car("Yuhina", "Spark", 2037)
      };
    
      // for each interface object, groom it
      for (Groomable c : groomer) {
        c.groom();
      }
    }
}