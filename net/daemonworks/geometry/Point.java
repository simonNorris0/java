//package net.daemonworks.geometry;

public class Point {
   private double x, y;
   
   public Point() {
      x = 0.0f;
      y = 0.0f;
   }
   
   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   // methods for interacting with another Point..
   public double dx(Point b) {
      double dx = b.x - this.x;
      return dx;
   }
   
   public double dy(Point b) {
      double dy = b.y - this.y;
      return dy;
   }
   
   public double distance(Point b) {
      // d = sqroot((b.x - a.x)^2 + (b.y - a.y)^2)
      double d;
      d = Math.sqrt(Math.pow(b.x - this.x, 2) + 
         Math.pow(b.y - this.y, 2));
      return d;
   }
   /** adds Point b to Point a and stores
       the result in Point a.            */
   public void add(Point b) {
      x += b.x;
      y += b.y;
      return;
   }
   /** subtracts Point b from Point a
       and stores the result in Point a  */
   public void subtract(Point b) {
      x -= b.x;
      y -= b.y;
      return;
   }
   // misc. utility methods
   public String toString() {
      return "(" + x + ", " + y + ")";
   }
   // setters / getters
   public double getx() {
      return x;
   }
   public double gety() {
      return y;
   }
   public void setx(double x) {
      this.x = x;
      return;
   }
   public void sety(double y) {
      this.y = y;
      return;
   }
}