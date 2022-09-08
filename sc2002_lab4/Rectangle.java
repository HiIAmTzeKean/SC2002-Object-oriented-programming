package sc2002_lab4;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		this(0,0);
	}
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getArea() {
		return length*breadth;
	}
}
