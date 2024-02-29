//: Bool.java
// Textbook example
// Demonstrates relational and logical operators
import java.util.*;

public class Bool {
   public static void main(String[] args) {
   // ** initial seed provides the same sequence everytime
   //  the program is ran - producing the same/verifyable output **
   Random rand = new Random(47);
   int i = rand.nextInt(100);
   int j = rand.nextInt(100);
   
   System.out.println("i = " + i);
   System.out.println("j = " + j);
   System.out.println("i > j = " + (i > j));
   System.out.println("i < j = " + (i < j));
   System.out.println("i >= j = " + (i >= j));
   System.out.println("i <= j = " + (i <= j));
   System.out.println("i == j = " + (i == j));
   System.out.println("i != j = " + (i != j));
   // Treating an int as a boolean is not legal Java:
   //! print("i && j is " + (i && j));
   //! print("i || j is " + (i || j));
   //! print("!i is " + !i);
   
   // However, the following expressions produce boolean
   // values using relational comparisons, THEN use logical
   // operations on the boolean results
   System.out.println("(i < 10) && (j < 10) is "
      + ((i < 10) && (j < 10)) );
   System.out.println("(i < 10) || (j < 10) is "
      + ((i < 10) || (j < 10)) );
   }
}

/** TEST PLAN
* Expected Output:
* i = 58
* j = 55
* i > j = true
* i < j = false
* i >= j = true
* i <= j = false
* i == j = false
* i != j = true
* (i < 10) && (j < 10) is false
* (i < 10) || (j < 10) is false
* <End of Output>
* Actual Output:
* Results Display As Excepted
*/