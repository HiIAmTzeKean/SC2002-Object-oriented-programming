package sc2002_lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0, custID, seatID;
		Plane p = new Plane();
		
		System.out.println("(1) Show number of empty seats ");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		
		while (ans!=7) {
			while(true) {
				System.out.printf("Enter the number of your choice: ");
				try {
					ans = sc.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("***Input must be a number");
					sc.nextLine();
				}
			}
			
			switch (ans) {
			case 1:
				p.showNumEmptySeats();
				break;
			case 2:
				p.showEmptySeats();
				break;
			case 3:
				p.showAssignedSeats(true);
				break;
			case 4:
				p.showAssignedSeats(false);
				break;
			case 5:
				System.out.println("Assigning Seat ..");
				System.out.print("Please enter SeatID: ");
				custID = sc.nextInt();
				System.out.print("Please enter Customer ID: ");
				seatID = sc.nextInt();
				p.assignSeat(custID, seatID);
				break;
			case 6:
				System.out.print("Enter SeatID to unassign customer from: ");
				seatID = sc.nextInt();
				p.unAssignSeat(seatID);
				break;
			case 7:
				return;
			default:
				return;
			}
		}
		sc.close();
	}
}
