import java.util.ArrayList;

class Event implements java.io.Serializable {
   /** Fields */
   private String title;
   private String description;
   private boolean isComplete=false;
   /** Constructors */
   Event() {
   
   }
   /** */
   Event(String title, String description) {
      this.title = title;
      this.description = description;
   }
   /** Methods */
   public void complete() {
      isComplete=true;
   }
   public void editTitle(String newTitle) {
      title=newTitle;
      return;
   }
   public void editDescription(String newDescription) {
      description=newDescription;
      return;
   }
   public String getTitle() {
      return title;
   }
   public String getDescription() {
      return description;
   }
   public String toString() {
      System.out.println("Title: " + title);
      System.out.println("~Description: " + description);
      if(isComplete) {
         System.out.println("~[x]Finished");
         return "\n";
      }
      else
         System.out.println("~[ ]Incomplete");
         return "\n";
   }
}

public class Events implements java.io.Serializable {
   /** Fields */
   ArrayList<Event> e = new ArrayList<Event>();
   
   /** Constructors */
   Events() {
      //..
   }
   /** Methods */
   public void addEvent(String title, String description) {
      Event item = new Event(title, description);
      e.add(item);
      return;
   }
   public Event getEvent(int index) {
      return e.get(index);
   }
   public void list() {
      for(int i=0; i<e.size(); i++) {
         System.out.print("~~i=" + i + " ");
         System.out.print(e.get(i));
      }
      return;
   }
}