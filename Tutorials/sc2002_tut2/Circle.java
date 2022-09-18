package tutorials.sc2002_tut2;

class Circle {
	private double radius;
	private static final double PI = 3.14159;
	
	public Circle (double rad) {
		this.radius = rad;
	}
	public void setRadius (double rad) {
		this.radius = rad;
	}
	public double getRadius () {
		return radius;
	}
	public double area () {
		return PI * radius * radius;
	}
	public double circumference () {
		return 2 * PI * radius;
	}
	public void printArea() {
		System.out.printf("Area of circle:\n%.4f\n", this.area());
	}
	public void printCircumferene() {
		System.out.printf("Circumference of circle:\n%.4f\n", this.circumference());
	}
}
