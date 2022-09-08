package sc2002_lab1;

import java.util.Scanner;

public class P3 {
	public static void main (String [] args) {
		int start, end, increment;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Starting value: ");
		start = sc.nextInt();
		System.out.printf("Ending value: ");
		end = sc.nextInt();
		System.out.printf("Increment value: ");
		increment = sc.nextInt();
		sc.close();
		if (start>end)
		{
			System.out.printf("ERROR");
			return;
		}
		for_loop(start,end,increment);
		dowhile_loop(start,end,increment);
		while_loop(start,end,increment);
	}
	public static void for_loop(int start, int end, int increment) {
		System.out.println("US$       S$");
		System.out.println("------------");
		for (int i=start; i<end; i++) {
			System.out.printf("%d        %.2f\n",i,i*1.82);
		}
		System.out.println();
	}
	public static void while_loop(int start, int end, int increment) {
		System.out.println("US$       S$");
		System.out.println("------------");
		while (start<=end) {
			System.out.printf("%d       %.2f\n",start,start++*1.82);
		}
		System.out.println();
	}
	public static void dowhile_loop(int start, int end, int increment) {
		System.out.println("US$       S$");
		System.out.println("------------");
		do {
			System.out.printf("%d       %.2f\n",start,start++*1.82);
		}while (start<=end);
		System.out.println();
	}
}
