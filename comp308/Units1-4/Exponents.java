//: Exponents.java
// Textbook exercise
// "e" means "10 to the power."

public class Exponents {
   public static void main(String[] args) {
   // Uppercase and lowercase �e� are the same:
   float expFloat = 1.39e-43f;
   expFloat = 1.39E-43f;
   System.out.println(expFloat);
   double expDouble = 47e47d; // �d� is optional
   double expDouble2 = 47e47; // Automatically double
   System.out.println(expDouble);
   }
}

/** Test Plan
* Expected Output:
* 1.39E-43
* 4.7E48
* <End of Output>
* Actual Output:
* Results display as expected.
*/