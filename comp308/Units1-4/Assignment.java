//: comp308/Assignment.java
// textbook example
// Assignment with objects is just copying a reference

class Tank {
   int level;
}

public class Assignment {
   public static void main(String[] args) {
      Tank t1 = new Tank();
      Tank t2 = new Tank();
      t1.level = 9;
      t2.level = 47;
      System.out.println("1: t1.level: " + t1.level +
         ", t2.level: " + t2.level);
      // copy rvalue(t2) into lvalue(t1)
      t1 = t2;
      //  * but for ojects: COPY REFERENCE in rvalue(t2) and OVERWRITE THAT
      //   REFRENCE into lvalue(t1)
      System.out.println("2: t1.level: " + t1.level +
         ", t2.level: " + t2.level);
      t1.level = 27;
      // because t1 now points to the same Tank object as t2
      //  the value **t2.level will also be 27**
      System.out.println("3: t1.level: " + t1.level +
         ", t2.level: " + t2.level);
   }
}

/** TEST PLAN
*  Expected Output:
* 1: t1.level: 9, t2.level: 47
* 2: t1.level: 47, t2.level: 47
* 3: t1.level: 27, t2.level: 27
* <End of Output>
* Actual Output:
* Results display as expected
* 100% accuracy expected
*
*/