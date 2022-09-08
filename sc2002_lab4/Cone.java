package sc2002_lab4;

public class Cone {
	private Circle c = new Circle();
	private Triangle t = new Triangle();
	public Cone(int radius, int height) {
		t.setHeight(height);
		t.setBase(radius);
		c.setRadius(radius);
	}
	public double getSurfaceArea() {
		return c.getArea() + Math.PI * c.getRadius() * t.getHypotenuse();
	}
}
