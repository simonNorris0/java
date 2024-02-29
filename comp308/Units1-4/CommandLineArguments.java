//: comp308/CommandLineArguments.java

/** Exercise 10 Thinking in Java 4th Edition, Bruce Eckel
 * Prints three arguments taken from the command line.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @author Simon Norris
 * @author https://github.com/simonNorris0
 * @version 1.0
*/
public class CommandLineArguments {
   /** Entry point to class & application. 
    * @param args array of String arguments
    * @throws exceptions No exceptions thrown
   */
   public static void main(String[] args) {
      if (args.length > 0) {
         for (int i=0; i < args.length; i++)
            System.out.println(args[i]);
      // no command line arguments entered
      } else {
         System.out.println("No arguments entered.");
      }
   }
}

/** TEST PLAN
* Input:
* Java CommandLineArguments Apple Banana Orange
*
* Expected Output:
* Apple
* Banana
* Orange
* <End of Output>
* 
* Results:
* Expected 100% accuracy
*/