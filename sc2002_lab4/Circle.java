package sc2002_lab4;

public class Circle {
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public Circle() {
		this(0);
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double getParameter() {
		return 2 * Math.PI * radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
