package sc2002_lab4;

import java.util.Scanner;

public class Rectangle extends Shape{
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
	private void setLength(int length) {
		this.length = length;
	}
	private void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void setDimensions(){
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Lenght: ");
		setLength(s.nextInt());
		System.out.println("Input the Lenght: ");
		setBreadth(s.nextInt());
	}
	public double getArea() {
		return length*breadth;
	}
	public String getName(){
		return "Rectangle";
	}
	public void print(){
		System.out.printf("length = %d, breadth = %d\n",getLength(), getBreadth());
	}
}
