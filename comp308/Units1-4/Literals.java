//: Literals.java
// Textbook example
// Demonstrates the use of special characters
// to associate the correct type to a literal
// in situations that are ambiguous to the compiler.

public class Literals {
   public static void main(String[] args) {
      int i1 = 0x2f; // Hexadecimal (lowercase)
      System.out.println("i1: " + Integer.toBinaryString(i1));
      int i2 = 0X2F; // Hexadecimal (uppercase)
      System.out.println("i2: " + Integer.toBinaryString(i2));
      int i3 = 0177; // Octal (leading zero)
      System.out.println("i3: " + Integer.toBinaryString(i3));
      char c = 0xffff; // max char hex value
      System.out.println("c: " + Integer.toBinaryString(c));
      byte b = 0x7f; // max byte hex value
      System.out.println("b: " + Integer.toBinaryString(b));
      short s = 0x7fff; // max short hex value
      System.out.println("s: " + Integer.toBinaryString(s));
      // A trailing character after a literal value establishes its type
      long n1 = 200L; // long suffix
      long n2 = 200l; // long suffix (but can be confusing)
      long n3 = 200;
      float f1 = 1;
      float f2 = 1F; // float suffix
      float f3 = 1f; // float suffix
      double d1 = 1d; // double suffix
      double d2 = 1D; // double suffix
      // (Hex and Octal also work with long)
      
      // ***   ~~BINARY LITERALS~~
      
      // There is no literal representation for binary numbers
      //  in C, C++, or Java.
      // Use toBinaryString() methods in Integer and Long classes.
      // ***
   }
}

/** Test Plan
* Expected output:
* i1: 101111
* i2: 101111
* i3: 1111111
* c: 1111111111111111
* b: 1111111
* s: 111111111111111
* <End of Output>
* Actual output:
* Results display as expected.
*/