//: operators/Equivalence.java
// textbook exercise
// Demonstrates that the relational operators
// != and == compare object references when
// used to compare objects (not the contents of
// the object)

public class Equivalence {
   public static void main(String[] args) {
      Integer n1 = new Integer(47);
      Integer n2 = new Integer(47);
      // both Integer objects have the same value
      // but n1 == n2 returns false
      System.out.println(n1 == n2);
      // and n1 != n2 returns true ...
      System.out.println(n1 != n2);
      // this is because n1 == n2 compares the two
      // object references in n1 and n2 (which are
      // two different values) and not the contents 
      // of the objects. 
   }
}

/* TEST PLAN
 * ~~Expected Output~~:
 * false
 * true
 * <End of Output>
 * ~~Actual Output~~:
 * Results display as expected.
*/