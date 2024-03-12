import java.io.*;
import java.util.*;

public class MakeTextFile {
   /** private static void nLines(int n)
       writes n lines into a text file    */
   private static void nLines(int n) {
      try {
         File newFile = new File("TextFile.txt");
         if (newFile.createNewFile()) {
            System.out.println("File Created: " + newFile.getName());
            try {
               FileWriter fileWrite = new FileWriter("TextFile.txt");
               /** @param n @see nLines */
               for(int i=1; i<n+1; i++)
                  fileWrite.write("line " + i + "\n");
               fileWrite.close();
               System.out.print("Succuessfully wrote to the file.");
               return;
            } catch (IOException e) {
               System.out.println("An i/o error occured");
               e.printStackTrace();
               return;            
            }
         } else
             System.out.println("File already exists. Please rename old file first.");
             return;
      } catch (IOException e) {
         System.out.println("An i/o error occured");
         e.printStackTrace();
         return;
      }
   }
   /** private static void nLinesBlanks(int n)
       writes n lines into a text file with blanks
       throughout                                  */
   private static void nLinesBlanks(int n) {
      Random randomBlanks = new Random(79); // seeded, just remove for 'randomness'
      try {
         File newFile = new File("TextFile.txt");
         if (newFile.createNewFile()) {
            System.out.println("File Created: " + newFile.getName());
            try {
               FileWriter fileWrite = new FileWriter("TextFile.txt");
               /** @param n @see nLines */
               for(int i=1; i<n+1; i++) {
                  if(randomBlanks.nextDouble() < 0.15000) {
                     fileWrite.write(" " + "\n");
                  } else {
                     fileWrite.write("line " + i + "\n");
                  }
               }
               fileWrite.close();
               System.out.print("Succuessfully wrote to the file.");
               return;
            } catch (IOException e) {
               System.out.println("An i/o error occured");
               e.printStackTrace();
               return;            
            }
         } else
             System.out.println("File already exists. Please rename old file first.");
             return;
      } catch (IOException e) {
         System.out.println("An i/o error occured");
         e.printStackTrace();
         return;
      }
   }
   /** */
   public static void main(String[] args) {
      //nLines(1000000);
      nLinesBlanks(1000000);
      return;
   }
}