package tutorials.sc2002_tut3;

public class Circle extends Point {
    private int radius;
    public Circle (int radius){
        super();
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public String toString() {
        super.toString();
        return String.format("Radius is: %d", radius);
    }
    public double area() {
        return 2*Math.PI*radius;
    }
}