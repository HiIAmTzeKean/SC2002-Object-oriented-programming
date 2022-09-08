package sc2002_lab4;

public class Cubiod {
	private Rectangle r = new Rectangle();
	private int depth;
	public Cubiod(int length, int breadth, int depth) {
		r.setBreadth(breadth);
		r.setLength(length);
		this.depth = depth;
	}
	public double getSurfaceArea() {
		return r.getArea() * depth;
	}
}
