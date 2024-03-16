//package net.daemonworks.geometry;

public class Line {
   private Point a, b;
   
   // a line with no breadth
   // aka one point (0, 0)
   public Line() {
      this.a = new Point();
      this.b = new Point();
   }
   
   public Line(Point a, Point b) {
      this.a = a;
      this.b = b;
   }
   // methods for analyzing a line
   public double length() {
      return a.distance(b);
   }
   
   public double slope() {
      double dx = a.dx(b);
      double dy = a.dy(b);
      return dy / dx;
   }
   // methods for interacting with other lines
   
   /** Add two lines and store the result in 
       the calling line.                       */
   public void add(Line l) {
      a.add(l.a);
      b.add(l.b);
      return;
   }
   /** Subtract two lines and store the result
       in the calling line.                     */
   public void subtract(Line l) {
      a.subtract(l.a);
      b.subtract(l.b);
      return;
   }
   
   // misc. utility methods
   public String toString() {
      return "a: " + a.toString() +
         " b: " + b.toString();
   }
   
   // setters/getters
   public Point geta() {
      return a;
   }
   public Point getb() {
      return b;
   }
   public void seta(Point a) {
      this.a = a;
      return;
   }
   public void setb(Point b) {
      this.b = b;
      return;
   }
}