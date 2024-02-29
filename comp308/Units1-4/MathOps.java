//: comp308/MathOps.java
// textbook example
// Demonstrates the mathematical operators
import java.util.*;

public class MathOps {
   public static void main(String[] args) {
      // ** default seed is the current time, thus producing different
      //  results each time the program is run.
      //  By providing a seed (an initialization value that will
      //  **always produce the same sequence**) the SAME RANDOM NUMBERS
      //  will be generated each time the program is executed 
      //  SO THE OUTPUT IS VERIFIABLE.
      // Create a seeded random number generator:
      Random rand = new Random(47);
      int i, j, k;
      // Choose value from 1 to 100:
      j = rand.nextInt(100) + 1;
      System.out.println("j: " + j);
      k = rand.nextInt(100) + 1;
      System.out.println("k: " + k);
      i = j + k;
      System.out.println("j + k: " + i);
      i = j - k;
      System.out.println("j - k: " + i);
      i = k / j;
      System.out.println("k / j: " + i);
      i = k * j;
      System.out.println("k * j: " + i);
      i = k % j;
      System.out.println("k % j: " + i);
      j %= k;
      System.out.println("j %= k: " + j);
      // Floating-point number tests:
      float u, v, w; // Applies to doubles, too
      v = rand.nextFloat();
      System.out.println("v: " + v);
      w = rand.nextFloat();
      System.out.println("w: " + w);
      u = rand.nextFloat();
      System.out.println("u: " + u);
      u = v + w;
      System.out.println("v + w: " + u);
      u = v - w;
      System.out.println("v - w: " + u);
      u = v * w;
      System.out.println("v * w: " + u);
      u = v / w;
      System.out.println("v / w: " + u);
      // The following also works for char, byte, short,
      //  int, long, and double:
      u += v;
      System.out.println("u += v: " + u);
      u -= v;
      System.out.println("u -= v: " + u);
      u *= v;
      System.out.println("u *= v: " + u);
      u /= v;   
      System.out.println("u /= v: " + u);
      } // end of main
      
} // end of source

/* TEST PLAN
* Expected Output:
* j: 59
* k: 56
* j + k: 115
* j - k: 3
* k / j: 0
* k * j: 3304
* k % j: 56
* j %= k: 3
* v: 0.5309454
* w: 0.0534122
* u: 0.16020656
* v + w: 0.5843576
* v - w: 0.47753322
* v * w: 0.028358962
* v / w: 9.940527
* u += v: 10.471473
* u -= v: 9.940527
* u *= v: 5.2778773
* u /= v: 9.940527
* <End of Output>
* Actual Output:
* Results display as expected.
*/