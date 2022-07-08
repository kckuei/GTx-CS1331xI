public class ArraySearch2 {
/* Method Overloading Example
-Need two or more versions that differ in their types, order and/or number of formal parameters. 
-I.e. two or more versions with same name but different signatures (in the inputs)
-Return types are not involved in the definition

-Valid overloading examples:
  static int two(int a, int b){return a+b;}
  static double two(double a, double b){return a+b;}

  static int three(int a,int b){return a+b;}
  tatic int three(int a,int b, int c){return a+b+c;}

*/


    public static boolean searchArray(String target,
                                  String[] array) {
        boolean result = false;
        for (String element : array) {
            if ((element != null) && (element.equals(target))) {
                result = true;
                break;
            }
        }
        return result;
    }
        
    public static boolean searchArray(int target,
                                      int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
