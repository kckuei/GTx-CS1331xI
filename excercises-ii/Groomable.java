public interface Groomable {
    /* example of an interface construct

    interface provides a way of enforcing that a class defines one or more methods
    
    can think of interfaces as analogous to contracts; if class implements interface, it is bound to a contract represented by a set of abstract methods 

    interface construct offers us a way of creating and using
    classes that share similar kinds of behaviors but do not necessarily 
    have meaningful inheritance relationships.

    note: Modfiers like public and abstract can be ommitted in an interface as they are implied.
    */
    
    public void groom();
}