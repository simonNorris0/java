/** class Date */
// Requires: Events.java
// https://cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
public class Date implements java.io.Serializable {
   /** Fields */
   /** untested beyond reasonable modern dates */
   private int year;
   /** 1-12 */
   private int month;
   /** 1-31 : this is the day of the MONTH
                      not the day of the year */
   private int day;
   /** century (1987 has C=19)           */
   private int C;
   /** (1987 has Y = 87 except Y = 86 for Jan & Feb) */
   private int Y;
   /** weekday (0=Sunday,...,6=Saturday) */
   private int W;
   private String name;
   /** for nameMe() */
   private String[] daysOfWeek = 
      {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
   /** */
   private Events todo = new Events();
   /** Constructors */
   Date() {
      //..
   }
   /** year=xxxx ; month=1-12 ; day = 1-31 */
   // https://cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
   Date(int year, int month, int day) {
      //!Debug
      //!System.out.println("*" + month + " " + day);
      this.year=year;
      this.month=month;
      this.day=day;
      //to find C for the year..
      C=year;
      while(C>100)
         // removes fractional part and rightmost digit each time
         // once C is less than 100, we have the 2 leftmost digits
         // aka what the nameMe() formula asks for C
         C/=10;
      //to find Y for the year.. just extract the last 2 digits with mod100
      Y=year;
      // gotta use that abs() with this method
      Y= Math.abs(Y)%100;
      // ** need to subtract 1 for jan and feb as well
      if(month==1 || month==2)
         Y-=1;
      nameMe();
   }
   
   /** Methods */
   //https://cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
   private void nameMe() {
      // I dont think its necessary to floor(Y/4) or C/4 in Java, integer division truncates
      //W = (k + floor(2.6m - 0.2) - 2C + Y + floor(Y/4) + floor(C/4))mod7
      // m is month (1 = March, ..., 10 = December, 11 = Jan, 12 = Feb) 
      // Treat Jan & Feb as months of the preceding year
      int m = month-2;
      // feb(month==2) becomes 0, needs to be 12
      if(m==0)
         m=12;
      W = Math.abs((day + (int)Math.floor(2.6*m-0.2) - 2*C + Y + Y/4 + C/4) % 7);
      name = daysOfWeek[W];
      return;
   }
   
   // Events/Event methods
   public Events getEvents() {
      return todo;
   }
   public Event getEvent(int index) {
      return todo.getEvent(index);
   }   
   public void addEvent(String title, String description) {
      todo.addEvent(title, description);
      return;
   } 
   public void list() {
      todo.list();
   }
   
   
   public String toString() {
      return name + " " + year + "-" + month + "-" + day;
   }
   
}