package sc2002_lab4;

import java.util.Scanner;

public class Triangle extends Shape{
	private int base;
	private int height;
	public Triangle(int height, int base) {
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		this(0,0);
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	public double getArea() {
		return 0.5d * base * height;
	}
	public double getHypotenuse() {
		return Math.sqrt(Math.pow(base,2) + Math.pow(height, 2));
	}
	public void setDimensions(){
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Radius: ");
		setHeight(s.nextInt());
		setBase(s.nextInt());
	}
	public String getName(){
		return "Triangle";
	}
	public void print(){
		System.out.printf("height = %d, base = %d\n",getHeight(), getBase());
	}
}
