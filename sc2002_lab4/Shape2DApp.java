package sc2002_lab4;

public class Shape2DApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		Triangle t = new Triangle(25,20);
		Rectangle r = new Rectangle(50,20);
		
		System.out.printf("Total area: %.2f\n",
				c.getArea()+t.getArea()+r.getArea());
	}

}
