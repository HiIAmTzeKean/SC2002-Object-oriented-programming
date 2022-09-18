package tutorials.sc2002_tut2;

import java.util.Scanner;
public class CircleApp {

	public static void main(String[] args) {
		int ans=0;
		double rad;
		Circle c = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("==== Circle Computation ====");
		System.out.println("|1. Create a new circle    |");
		System.out.println("|2. Print Area             |");
		System.out.println("|3. Print Circumference    |");
		System.out.println("|4. Quit                   |");
		System.out.println("Choose option (1-3):");
		while (ans != 4) {
			ans = sc.nextInt();
			switch (ans) {
			case 1:
				System.out.println("Enter the radius to computer the area and circumference:");
				rad = sc.nextDouble();
				c = new Circle(rad);
				System.out.println("A new circle is created");
				break;
			case 2:
				if (c==null) {
					System.out.println("Circle not created yet!!");
					return;
				}
				c.printArea();
				break;
			case 3:
				if (c==null) {
					System.out.println("Circle not created yet!!");
					return;
				}
				c.printCircumferene();
				break;
			case 4:
				System.out.println("Thank you!!");
				return;
			default:
				System.out.println("Invalid input!!");
				return;
			}
		}
		sc.close();
	}

}
