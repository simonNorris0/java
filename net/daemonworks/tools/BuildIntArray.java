package net.daemonworks.tools;

/**
   BuildIntArray.java
   @author simonNorris0
   @author Simon Norris
   @date March 12, 2024
   @version V1.0
   
   <h3> Purpose </h3>
   Using the range() method:
   Return an array of n integers, also initializes
   the array with array[0] = 1, ..., array[n-1] = n
   The purpose of this class is to simplify using the
   foreach syntax with an array of integers. It's
   aggrivating to initialize an array with a traditional
   for statement everytime I want to foreach with a
   range of integers.
   
   Utilize the optional "-r" String argument to
   initialze the array in reverse order. i.e, for
   n = 50, ints[0] == 50 and ints[49] == 1
    
*/
public class BuildIntArray {
   /** supports the public methods in this class */
   private static int[] buildArray(int n) {
      int[] ints = new int[n];
      return ints;
   }
   /** public static int[] range(int n) 
       @param int n == array size, n => 0 
       returns ints[]:
       an int array with n elements, 
       ranging arithmeticaly with step=1 from: 
       ints[0] = 1, ... ints[n-1] = n              
       @args String 
       takes one arg at the moment, the String "-r":
       -r flag initializes the elements of the  array 
       with the reversed range. i.e, 100 -> 1,
       rather than 1 -> 100                            */
   public static int[] range(int n, String... args) {
      int[] ints = buildArray(n);
      for (String flags: args) {
         /** -r flag initializes ints[] with the reverse range */
         if (flags =="-r") {
            for(int i=0, j=n; i<n; i++, j--)
               ints[i]=j;
            return ints;
         }
         //.. more options
         
      } // end of var args for statement
      // default: forward, 1 -> n range
      for(int i=0, j=1; i<n; i++, j++)
         ints[i]=j;
      return ints;
   } // end range()

} // end class BuildIntArray