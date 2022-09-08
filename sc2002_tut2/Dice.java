package sc2002_tut2;

import java.util.Random;
public class Dice {
	private int valueOfDice;
	public Dice () {
		
	}
	public void setDiceValue () {
		// We can create a random object
		Random r = new Random();
		this.valueOfDice = r.nextInt(6)+1;
		// or we can use the math class to generate random object
	}
	public int getDiceValue () {
		return valueOfDice;
	}
	public void printDiceValue() {
		System.out.printf("Current Value is %d\n", this.valueOfDice);
	}
}
