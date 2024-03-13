package net.daemonworks;

public class BuildIntArray {
   /** n == array size, n => 0 */
   public static int[] buildArray(int n) {
      int[] ints = new int[n];
      for(int i=0, j=0; i<n+1; i++, j++)
         ints[i]=j;
      return ints;
   }
}