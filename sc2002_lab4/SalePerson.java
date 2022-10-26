package sc2002_lab4;

class SalePerson implements Comparable<SalePerson> {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson (String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	public String toString() {
		return lastName + "," + firstName + ":" + totalSales;
	}
	public boolean equals(SalePerson o) {
		if (o.getFirstName() == this.firstName &&
			o.getLastName() == this.lastName)
			return true;
		return false;
	}
	public int compareTo(SalePerson o) {
		if (o.getTotalSales() > this.totalSales)
			return -1;
		if (o.getTotalSales() < this.totalSales)
			return 1;
		if (o.getLastName().compareTo(this.lastName)>0)
			return -1;
		return 1;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getTotalSales() {
		return this.totalSales;
	}
}
