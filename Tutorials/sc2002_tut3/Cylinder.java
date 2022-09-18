package sc2002_tut3;

public class Cylinder extends Circle {
    private int height;
    public Cylinder (int radius, int height) {
        super(radius);
        this.height= height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public String toString () {
        super.toString();
        return String.format("Heigt is: %d", height);
    }
    public double area() {
        return super.area()*height + super.area()*super.getRadius();
    }
    public double volume() {
        return super.area() * height;
    }
}