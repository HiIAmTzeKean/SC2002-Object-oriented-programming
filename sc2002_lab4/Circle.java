package sc2002_lab4;

import java.util.Scanner;

public class Circle extends Shape {
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
	public int getRadius() {
		return radius;
	}
	public void setDimensions(){
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Radius: ");
		this.radius = s.nextInt();
	}
	public String getName(){
		return "Circle";
	}
	public void print(){
		System.out.printf("radius = %d\n",getRadius());
	}
}
