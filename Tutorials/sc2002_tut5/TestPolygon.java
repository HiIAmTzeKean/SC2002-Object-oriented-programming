package tutorials.sc2002_tut5;

public class TestPolygon {
    public static void main(String args []) {
        // Polygon p = new Polygon();
        Rectangle r =  new Rectangle();
        Triangle t = new Triangle();
        //r.printArea();
        printArea(r);
        printArea(t);
    }
    // public void printArea(Rectangle r){
    //     System.out.println("Area of Rectangle is: " + r.calArea());
    // }
    // public void printArea(Triangle t) {
    //     System.out.println("Area of Triangle is: " + t.calArea());
    
    public static void printArea(Polygon p) {
         System.out.println("Area of " + p.name + " is: " + p.calArea());
    }
}
