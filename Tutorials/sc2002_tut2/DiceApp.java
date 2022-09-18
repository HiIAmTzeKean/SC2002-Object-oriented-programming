package tutorials.sc2002_tut2;

import java.util.Scanner;

public class DiceApp {

	public static void main(String[] args) {
		// alternatively you can create 1 dice to save memory space
		// consider event where you got 100 dice
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press <key> to roll the first dice");
		sc.next();
		d1.setDiceValue();
		System.out.printf("Current value is %d\n", d1.getDiceValue());

		System.out.println("Press <key> to roll the second dice");
		sc.next();
		d2.setDiceValue();
		System.out.printf("Current value is %d\n", d2.getDiceValue());
		System.out.printf("Your total number is %d\n",d1.getDiceValue()+d2.getDiceValue());
		sc.close();
	}

}
