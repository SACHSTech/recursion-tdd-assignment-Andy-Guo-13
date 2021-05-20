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

    // Recursive case

    // Declaring variables
    int hiNumber = 0;
    String firstTwoChar;

    // Take the first two characters in the string
    firstTwoChar = str.substring(0, 2);

    // If they are "hi", make hiNumber = 1
    if (firstTwoChar.equals("hi")) {
      hiNumber = 1;
    }

    // The amount of "hi"s in str is equal to:
    // The amount of "hi"s in the first two characters PLUS
    // The amount of "hi"s in str without the first character
    return hiNumber + countHi(str.substring(1));
  }

}
