package sc2002_lab4;

public class Cylinder {
	private Circle c = new Circle();
	private int height;
	public Cylinder(int radius, int height) {
		this.height = height;
		c.setRadius(radius);
	}
	public double getSurfaceArea() {
		return 2*c.getArea() + c.getParameter() * height;
	}
}
