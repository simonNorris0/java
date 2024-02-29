//: ShortCircuit.java
// Textbook example
// Demonstrates short-circuiting behavior with
// logical operators

public class ShortCircuit {
   // Each test performs a comparison against the
   // argument and returns true or false.
   static boolean test1(int val) {
      System.out.println("test1(" + val + ")");
      System.out.println("result: " + (val < 1));
      return val < 1;
   }
   static boolean test2(int val) {
      System.out.println("test2(" + val + ")");
      System.out.println("result: " + (val < 2));
      return val < 2;
   }
   static boolean test3(int val) {
      System.out.println("test3(" + val + ")");
      System.out.println("result: " + (val < 3));
      return val < 3;
   }  
   public static void main(String[] args) {
      // The first test produced a true result, so the 
      // expression evaluation continues.
      // However, the second test produced a false result. 
      // Since this means that the whole expression
      // must be false, expression evaluation STOPS
      // 
      // This is short-circuiting. We can see in the
      // Test Plan output, test1(0) evaluates, test2(2)
      // evaluates, but test3(2) never evaluates and the
      // test is not executed and not printed.
      boolean b = test1(0) && test2(2) && test3(2);
      System.out.println("expression is " + b);
   }
}
/** TEST PLAN
* Expected output:
* test1(0)
* result: true
* test2(2)
* result: false
* expression is false
* <End of Output>
* Actual Output:
* Results display as expected.
*/