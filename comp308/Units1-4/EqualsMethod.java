//: EqualsMethod.java
// textbook exercise
// Demonstrates the use of the equals() method for
// comparing objects (contents)

public class EqualsMethod {
   public static void main(String[] args) {
      Integer n1 = new Integer(47);
      Integer n2 = new Integer(47);
      // n1.equals(n2) returns true as expected
      // because equals() is configured to compare
      // the contents of the objects.
      System.out.println(n1.equals(n2));
   }
}

/* TEST PLAN
 * ~~Expected Output~~
 * true
 * <End of Output>
 * ~~Actual Output~~
 * Results display as expected.
*/