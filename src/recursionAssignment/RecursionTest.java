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
  @After
  public void afterTest(){
    // some steps to perform after tests are run
  }
  */    
}
