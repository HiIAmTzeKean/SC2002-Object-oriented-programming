

public class VendingMachineApp {
	public static void main (String [] arg) {
		VendingMachine vm = new VendingMachine();
		double drinkCost = vm.selectDrink();
		double amountInserted = vm.insertCoins(drinkCost);
		vm.checkChange(amountInserted, drinkCost);
		vm.printReceipt();
	}
}
