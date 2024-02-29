//: EqualsMethod2.java
// textbook exercise
// Demonstrates the default behavior of equals()
// (to compare references) and the necessity of
// overriding equals() for your own classes
// in order to compare object contents

class Value {
   int i;
}

public class EqualsMethod2 {
   public static void main(String[] args) {
      Value v1 = new Value();
      Value v2 = new Value();
      v1.i = v2.i = 100;
      // returns false, just like v1 == v2 would
      // because unless equals() is overridden in
      // a class definition, the default behavior
      // is to compare references just like the
      // == operator
      System.out.println(v1.equals(v2));
   }
}

/* TEST PLAN
 * ~~Expected Output:~~
 * false
 * <End of Output>
 * ~~Actual Output:~~
 * Result display as expected.
*/