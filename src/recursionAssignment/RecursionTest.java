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
  * Testing case where there is only 1 letters
  */
  @Test
  public void Testcounthi9() {
    assertEquals(0, Recursion.countHi("x"));
  }

  /*
  * Testing case with empty string
  */
  @Test
  public void TestcountHi10() {
    assertEquals(0, Recursion.countHi(""));
  }

  /*
  * Longer string
  */
  @Test
  public void TestcountHi11() {
    assertEquals(6, Recursion.countHi("akhijs;kldhisjf;ekwhaljhivhhilewk;hijfkwhehi;ivh;"));
  }

  /*
  * Even longer strings
  */
  @Test
  public void TestcountHi12() {
    assertEquals(9, Recursion.countHi("ih;asfh;oiewahf;ihae;fiha;hf;ahe;fwahe;oifha;fdh;ash;oifhwae;fha;shidfh;oiwaeihihf;ah;fdah;oiefh;iahef;oihiwe;fha;ihihe;ifhihi;aiehf;iah;eiha;efh;ahf;ih;iehfa;ihih;iefhiahhlfihiahelfihhlhaeifaleihlihfe"));
  }



  // changePi

  /*
  * Initial test for changePi
  */
  @Test
  public void TestchangePi1() {
    assertEquals("xxx", Recursion.changePi("xxx"));
  }

  /*
  * Test base case for changePi
  */
  @Test
  public void TestchangePi2() {
    assertEquals("xx", Recursion.changePi("xx"));
  }

  /*
  * Test another bae case for changePi
  */
  @Test
  public void TestchangePi3() {
    assertEquals("3.14", Recursion.changePi("pi"));
  }

  /*
  * Test recursive case for changePi
  */
  @Test
  public void TestchangePi4() {
    assertEquals("x3.14", Recursion.changePi("xpi"));
  }

  /*
  * Another recursive case for changePi
  */
  @Test
  public void TestchangePi5() {
    assertEquals("3.14x", Recursion.changePi("pix"));
  }

  /*
  * Two "pi"s
  */
  @Test
  public void TestchangePi6() {
    assertEquals("3.14x3.14", Recursion.changePi("pixpi"));
  }

  /*
  * Another test with two "pi"s
  */
  @Test
  public void TestchangePi7() {
    assertEquals("3.143.14", Recursion.changePi("pipi"));
  }
  
  /*
  * Reversing letters in "pi"
  */
  @Test
  public void TestchangePi8() {
    assertEquals("i3.14p", Recursion.changePi("ipip"));
  }

  /*
  * Testing for 1 character
  */
  @Test
  public void TestchangePi9() {
    assertEquals("x", Recursion.changePi("x"));
  }

  /*
  * Testing empty string
  */
  @Test
  public void TestchangePi10() {
    assertEquals("", Recursion.changePi(""));
  }

  /*
  * More complicated strings
  */
  @Test
  public void TestchangePi11() {
    assertEquals("akfewf3.14a;kljwefrwjw;lekjr3.14;akjef;lkjeaf3.14kajlk;kfhgkjwehfae3.14;akje;3.14;kawfe", Recursion.changePi("akfewfpia;kljwefrwjw;lekjrpi;akjef;lkjeafpikajlk;kfhgkjwehfaepi;akje;pi;kawfe"));
  }

  /*
  * Even more complicated string
  */
  @Test
  public void TestchangePi12() {
    assertEquals("fka3.14j;slkejf;akje;akwe;ne3.14wa;fjwhaelgjhwaej3.143.14flsnv;kjanrawj3.14erjwale 3.14j;iae;o ih2;3oir y2toi ;3 ha;3wh ;gaj3;hrfje3.14h h ;ihfa3.14 3;ih3.14;fh4ghaw;gih;4h;kj;alkdse4", Recursion.changePi("fkapij;slkejf;akje;akwe;nepiwa;fjwhaelgjhwaejpipiflsnv;kjanrawjpierjwale pij;iae;o ih2;3oir y2toi ;3 ha;3wh ;gaj3;hrfjepih h ;ihfapi 3;ihpi;fh4ghaw;gih;4h;kj;alkdse4"));
  }



  // stringClean

  /*
  * Initial test for stringClean
  */
  @Test
  public void TeststringClean1() {
    assertEquals("xyz", Recursion.stringClean("xyz"));
  }

  /*
  * Test base case for stringClean
  */
  @Test
  public void TeststringClean2() {
    assertEquals("xy", Recursion.stringClean("xy"));
  }

  /*
  * Different base csae test
  */
  @Test
  public void TeststringClean3() {
    assertEquals("x", Recursion.stringClean("xx"));
  }

  /*
  * Recursive test for stringClean
  */
  @Test
  public void TeststringClean4() {
    assertEquals("xy", Recursion.stringClean("xxy"));
  }

  /*
  * Another recursive test for stringClean
  */
  @Test
  public void TeststringClean5() {
    assertEquals("yx", Recursion.stringClean("yxx"));
  }

  /*
  * Three of a kind test
  */
  @Test
  public void TeststringClean6() {
    assertEquals("x", Recursion.stringClean("xxx"));
  }

  /*
  * Testing 2 sets of pairs
  */
  @Test
  public void TeststringClean7() {
    assertEquals("xyx", Recursion.stringClean("xxyxx"));
  }

  /*
  * Another test for 2 sets of pairs
  */
  @Test
  public void TeststringClean8() {
    assertEquals("xy", Recursion.stringClean("xxyy"));
  }

  /*
  * Testing 1 character
  */
  @Test
  public void TeststringClean9() {
    assertEquals("x", Recursion.stringClean("x"));
  }  

  /*
  * Testing empty string
  */
  @Test
  public void TeststringClean10() {
    assertEquals("", Recursion.stringClean(""));
  }

  /*
  * Testing longer strings
  */
  @Test
  public void TeststringClean11() {
    assertEquals("abejfjfjejejcjcjcejejef", Recursion.stringClean("aabbejfjfjjjejjeeejcjcjjcejjejef"));
  }

  /*
  * Even longer strings
  */
  @Test
  public void TeststringClean12() {
    assertEquals("djdjdjdjejejejcjcsdldlelelelclckckdke;gjgj3i3i3icmcmemsmcmememcmcmekekdks", Recursion.stringClean("ddjdjdjdjjjjejejjjejjjcjjjcccccccssdlddllleleeelellclckckdkke;;;gjgj3i3i3icmcmmemmsmcmmmememcmcmekeekkdks"));
  }


  /*
  @After
  public void afterTest(){
    // some steps to perform after tests are run
  }
  */    
}
