public class Drink {
	private double cost;
	private String name;
	public Drink(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	public double getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
}