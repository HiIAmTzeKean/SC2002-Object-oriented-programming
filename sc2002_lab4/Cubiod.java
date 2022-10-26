package sc2002_lab4;

public class Cubiod extends Shape{
	private Rectangle r = new Rectangle();
	private int depth;
	public Cubiod(int length, int breadth, int depth) {
		r.EnterDimensions();
		this.depth = depth;
	}
	public double getArea() {
		return r.getArea() * depth;
	}
	public void print(){
		
	}
	public String getName(){
		return "Cubiod";
	}
}
