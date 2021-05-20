package recursionAssignment;

public class Recursion {

  /*
  * A test method to check if our test class functions
  * 
  * @return true
  * @author: Andy Guo
  */
  public static boolean testMethod() {
    return true;
  }


  /*
  * A method that returns the number of "hi"s within a given string
  * 
  * @param str  The input string
  * @return an integer representing the number of "hi"s
  * @author: Andy Guo
  */
  public static int countHi(String str) {
    // Base case: variable length of 2
    if (str.length() == 2) {
      // If those 2 chars make "hi", return 1
      if (str.equals("hi")) {
        return 1;
      }

      // If they don't make "hi", return 0
      return 0;
    }

    return 0;
  }

}
