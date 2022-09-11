import java.util.Scanner;
public class VendingMachine {
	private Drink [] drinkArr = new Drink [3];
	private Scanner sc = new Scanner (System.in);
	public VendingMachine() {
		drinkArr[0] = new Drink("Beer", 3.00d);
		drinkArr[1] = new Drink("Coke", 1.00d);
		drinkArr[2] = new Drink("Green Tea", 1.00d);
	}
	public double selectDrink() {
		System.out.println("============ Vending Machine ========");
		for (Drink i: drinkArr) {
			System.out.printf("| 1. Buy %s ($%.2f)     |\n",i.getName(),i.getCost());
		}
		System.out.println("=====================================");
		System.out.println("Please enter selection:");
		int answer = sc.nextInt();
		return drinkArr[answer-1].getCost();
	}
	public double insertCoins(double drinkCost) {
		System.out.println("============ Coins Input ============");
		System.out.println("| Enter 'Q' for ten cents input     |");
		System.out.println("| Enter 'T' for twenty cents input  |");
		System.out.println("| Enter 'F' for fifty cents input   |");
		System.out.println("| Enter 'N' for a dollar input      |");
		System.out.println("=====================================");
		double total=0d;
		char coin;
		while (total<drinkCost) {
			coin = sc.next().charAt(0);
			switch (coin) {
			case 'Q':
				total+=0.10d;
				break;
			case 'T':
				total+=0.20d;
				break;
			case 'F':
				total+=0.50d;
				break;
			case 'N':
				total+=1d;
				break;
			default:
				System.out.println("Invalid input, try again!!");
				break;
			}
			System.out.printf("Coins inserted: %.2f\n",total);
		}
		return total;
	}
	public void checkChange(double amount, double drinkCost) {
		System.out.printf("Change: $ %.2f\n",amount-drinkCost);
	}
	public void printReceipt() {
		System.out.println("Please collect drink");
		System.out.println("Thank you !!");
	}
}
