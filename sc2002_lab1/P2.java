package sc2002_lab1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		int salary = 0;
		int merit = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.printf("Salary: ");
			salary = sc.nextInt();
			System.out.printf("Merit: ");
			merit = sc.nextInt();
			
			// Sanity check on salary range
			if (salary < 500 || salary > 899) {
				System.out.println("Salary out of range");
				sc.close();
				return;
			}
			
			if (salary >= 500 && salary < 600) {
				// Grade C
				System.out.println("Grade C");
			}
			else if (salary >= 600 && salary <= 649 && merit < 10) {
				// Grade C
				System.out.println("Grade C");
			}
			else if (salary >= 600 && salary < 700) {
				// Grade B
				System.out.println("Grade B");
			}
			else if (salary >= 700 && salary <= 799 && merit < 20) {
				// Grade B
				System.out.println("Grade B");
			}
			else {
				// Grade A
				System.out.println("Grade A");
			}
		}
	}
}
