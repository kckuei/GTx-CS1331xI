public class ArraySearch {

    // public: visibility modifier, enables calling in outside classes
    // static: whether method is accesible from class or instance
    public static boolean searchStringArray(String target, String[] array) {
	boolean result = false;
	for (String elem : array ) {
	    if (elem.equals(target) ) {
	        result = true;
	        break;
	    }
	}
	return result;
    }

    public static void main(String args[]) {
        String[] concepts = {"abstraction", "polymorphism", 
        		     "inheritance", "encapsulation"};
        
        System.out.println(searchStringArray("polymorphism",concepts));
        System.out.println(searchStringArray("static",concepts));
    }
}
