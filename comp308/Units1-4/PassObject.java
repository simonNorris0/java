//: comp308/PassOperators.java
// textbook example
// Aliasing during method calls

class Letter {
   char c;
}

public class PassObject {
   // appears to be making a copy of its argument Letter y
   //  inside the scope of the method.
   // But once again, a *refernce is being passed*
   static void f(Letter y) {
      // so this line is *actualy changing the object outside of f()
      //  (Letter x)
      y.c = 'z';
   }
   public static void main(String[] args) {
      Letter x = new Letter();
      x.c = 'a';
      // x.c: a
      System.out.println("1: x.c: " + x.c);
      // calling f(x) changes x, despite scope, because a reference
      //  to x is being passed to f()
      f(x);
      // x.c: z
      System.out.println("2: x.c: " + x.c);
   }
}

/** TEST PLAN
*  Expected Output:
* 1: x.c: a
* 2: x.c: z 
* <End of Output>
* Actual Output:
* Results display as expected
* 100% accuracy expected
*
*/
