package sc2002_lab1;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.next();
		
		switch (choice) {
			case "A":
			case "a":
				System.out.println("Action movie fan");
				break;
			case "c":
			case "C":
				System.out.println("Comedy movie fan");
				break;
			case "d":
			case "D":
				System.out.println("Drama movie fan");
				break;
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}
