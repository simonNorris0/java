//: comp308/AutoInc.java
// textbook exercise
// Demonstrates the ++ and -- operators

public class AutoInc {
   public static void main(String[] args) {
      int i = 1;
      System.out.println("i: " + i);
      // *PREFIX:
      // increment is performed THEN value is reported
      System.out.println("++i: " + ++i); // Pre-increment
      // *POSTFIX:
      // value is reported BEFORE increment is performed
      System.out.println("i++: " + i++); // Post-increment
      System.out.println("i: " + i);
      // -1 then report i
      System.out.println("--i: " + --i); // Pre-decrement
      // report i (i=2) then perorm i-1
      System.out.println("i--: " + i--); // Post-decrement
      // report i (i=1)
      System.out.println("i: " + i);
   }
}
/* TEST PLAN
* ~~Expected Output~~
* i: 1
* ++i: 2
* i++: 2
* i: 3
* --i: 2
* i--: 2
* i: 1
* <End of Output>
* ~~Actual Output~~
* Results display as expected.
*/