package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
/*
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;
*/

import recursionAssignment.Recursion;

public class RecursionTest {

  /*
  @Before
  public void beforeTest(){
    // some steps to perform before tests are run
  }
  */
  
  /**
   * An initial test
   * Testing run command
   */
  @Test
  public void TestInitial() {
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE);
    // assertTrue(TESTBOOLEAN);
    assertEquals(true, Recursion.testMethod());
  }
    
  // add more tests

  // countHi

  /*
  * Initial test for countHi
  */

  @Test
  public void TestcountHi1() {
    assertEquals(0, Recursion.countHi("xxx"));
  }

  /*
  * Test base case for countHi
  */
  @Test
  public void TestcountHi2() {
    assertEquals(0, Recursion.countHi("xx"));
  }

  /*
  * Test another bae case for countHi
  */
  @Test
  public void TestcountHi3() {
    assertEquals(1, Recursion.countHi("hi"));
  }

  /*
  * Test a recursive case for countHi
  */
  @Test
  public void TestcountHi4() {
    assertEquals(1, Recursion.countHi("xhi"));
  }

  /*
  * Another recursive test case
  */
  @Test
  public void TestcountHi5() {
    assertEquals(1, Recursion.countHi("hix"));
  }

  /*
  * Testing for 2 hi's
  */
  @Test
  public void TestcountHi6() {
    assertEquals(2, Recursion.countHi("hihi"));
  }

  /*
  * More test for 2 hi's
  */
  @Test
  public void TestcountHi7() {
    assertEquals(2, Recursion.countHi("hixhi"));
  }

  /*
  * Reversing the letters for hi
  */
  @Test
  public void TestcountHi8() {
    assertEquals(1, Recursion.countHi("ihih"));
  }
    
  /*
  @After
  public void afterTest(){
    // some steps to perform after tests are run
  }
  */    
}
