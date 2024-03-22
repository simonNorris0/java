//:Agenda.java
// A personal agenda
// Requires: Date.java
//           Events.java
// Serialization imports
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// De-serialization imports
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;

/** */
class Calendar implements java.io.Serializable {
   /** Fields */
   private int year;
   private Date[] calendar;
   private boolean leapYear=false;
   /** Constructors */
   Calendar(int year) {
      // to index [Date]calendar
      int k=0;
      this.year=year;
      if(year%4==0) {
         leapYear=true;
         calendar = new Date[366];
      } else 
         calendar = new Date[365];
      // initialize all the Date objects in calendar
      while(k<calendar.length) {
         for(int i = 1; i<13; i++) {
            switch(i) {
               case 2: //28 days or 29 if leapYear
                       if(leapYear) {
                        for(int j=1;j<30;j++) {
                           calendar[k] = new Date(year, i, j);
                           k++;
                        }
                        break;
                       }
                       for(int j=1;j<29;j++) {
                           calendar[k] = new Date(year, i, j);
                           k++;
                       }
                       break;
               case 4:
               case 6:
               case 9:
               case 11: //30 days
                        for(int j=1;j<31;j++) {
                           calendar[k] = new Date(year, i, j);
                           k++;
                        }
                        break;
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12: //31 days
                        for(int j=1;j<32;j++) {
                           calendar[k] = new Date(year, i, j);
                           k++;
                        }
                        break;
         }
       }
     } // end of Date[] calendar initialization
   }
   /** Methods */
   public int pollIndex(int month, int day) {
      // offset by 1, array indices start at 0
      // but the range represented by day is [1-365(366)]
      day -=1;
      switch(month) {
         case 12: day += 30;
         case 11: day += 31;
         case 10: day += 30;
         case 9: day += 31;
         case 8: day += 31;
         case 7: day += 30;
         case 6: day += 31;
         case 5: day += 30;
         case 4: day += 31;
         case 3: if(leapYear)
                    day += 29;
                 else
                    day += 28;
         case 2: day += 31;
         case 1: 
         default: break;  
      }
      return day;
   }
   
   public Date getDate(int index) {
      return calendar[index];
   }
   
   public Date getDate(int month, int day) {
      return calendar[this.pollIndex(month, day)];
   }
}

public class Agenda extends Calendar {
   /** Fields */
   private Date currentDate; 
   
   /** Constructors */
   Agenda(int year) {
      super(year);
      return;
   }
   /** Methods */
   /** serialization */
   public static void save(Agenda a) {
      try {
         FileOutputStream fileOut = new FileOutputStream("agenda.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(a);
         out.close();
         fileOut.close();
         System.out.println("save succesful");
         return;  
      } catch (IOException i) {
         i.printStackTrace();
         System.out.println("save unsuccesful");
         return;
      }
   }
   /** de-serialization */
   public static Agenda load() {
      Agenda a = null;
      try {
         FileInputStream fileIn = new FileInputStream("agenda.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         a = (Agenda) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("load succesful");
         System.out.println();
         return a;
      } catch (IOException i) {
         i.printStackTrace();
         System.out.println("load unsuccesful");
         return a;
      } catch (ClassNotFoundException c) {
         c.printStackTrace();
         System.out.println("load unsuccesful");
         return a;
      }
   }
   //test
   public static void main(String[] args) {
      //Agenda test = new Agenda(2024);
      //test.currentDate = test.getDate(03, 22);
      //System.out.println(test.currentDate);
      //test.currentDate.addEvent("one", "makin a list");
      //test.currentDate.addEvent("two", "and checkin it twice");
      //test.currentDate.addEvent("three", "gonna find out");
      //test.currentDate.list();
      //!
      //save(test);
      //Agenda test = load();
      //test.currentDate.list();
      return;
   }
   
}