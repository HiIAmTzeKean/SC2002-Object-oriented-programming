package sc2002_lab4;

public class Sphere {
	// Sphere is not a 2D shape
	// Sphere has 2D properties
	private Circle c = new Circle();
	public Sphere(int radius) {
		c.setRadius(radius);
	}
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(c.getRadius(),2);
	}
	public int getRadius() {
		return c.getRadius();
	}
}
