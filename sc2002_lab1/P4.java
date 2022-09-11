package sc2002_lab1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int alpha = 1;
		sc.close();
		if (height == 0) {
			System.out.println("Error Input!!");
			return;
		}
		
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=i; j++) {
				if (alpha == 1) {
					System.out.print("AA");
					alpha = 0;
				}
				else {
					System.out.print("BB");
					alpha = 1;
				}
			}
			System.out.print("\n");
		}
		
	}

}
