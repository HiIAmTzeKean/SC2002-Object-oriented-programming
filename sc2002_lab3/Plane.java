package sc2002_lab3;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[12];
	private int numEmptySeat;
	public Plane () {
		this.numEmptySeat = seat.length;
		// for loop to create PlaneSeat object
		for (int i=1; i<=seat.length; i++) {
			seat[i-1] = new PlaneSeat(i);
		}
	}
	private PlaneSeat[] sortSeat() {
		//sort according to custID
		PlaneSeat [] copy = new PlaneSeat[12];
		int start = 0, j;
		
		for (int i=0; i<seat.length; i++) {
			// if assign, insertion sort
			if (seat[i].isOccupied() == true) {
				// insertion sort here
				j=start;
				if (j==0) copy[j] = seat[i];
				else {
					copy[j] = seat[i];
					while (j>0 && copy[j].getCustomerID() < copy[j-1].getCustomerID()) {
						copy[j] = copy[j-1];
						j--;
					}
					copy[j] = seat[i];
				}
				start++;
			}
		}
		return copy;
	}
	public void showNumEmptySeats() {
		System.out.printf("There are %d empty seats\n", this.numEmptySeat);
	}
	public void showEmptySeats() {
		System.out.println("The following seats are empty");
		for (int i=0; i<seat.length; i++) {
			if (seat[i].isOccupied()==false)
				System.out.printf("SeatID %d\n", seat[i].getSeatID());
		}
	}
	public void showAssignedSeats(boolean bySeatId) {
		System.out.println("The seat assignments are as follow:");
		
		if (bySeatId) {
			for (int i=0; i<seat.length; i++) {
				if (seat[i].isOccupied())
					System.out.printf("SeatID %d assigned to CustomerID %d.\n",
							seat[i].getSeatID(), seat[i].getCustomerID());
			}
		}
		else {
			PlaneSeat[] copy = sortSeat();
			for (int i=0; i<seat.length; i++) {
				if (copy[i]!=null && copy[i].isOccupied())
					System.out.printf("SeatID %d assigned to CustomerID %d.\n",
							copy[i].getSeatID(), copy[i].getCustomerID());
			}
		}
	}
	public void assignSeat(int seatId, int cust_id) {
		if (this.numEmptySeat == 0) {
			System.out.println("Seat already assigned to a customer.");
			return;
		}
		else if (seatId<1 || seatId>12) {
			System.out.println("Seat out of range.");
			return;
		}
		for (int i=0; i<seat.length; i++) {
			if (seat[i].getSeatID() == seatId)
				if (seat[i].isOccupied() == false) {
					seat[i].assign(cust_id);
					System.out.println("Seat Assigned!");
					numEmptySeat--;
					return;
				}
				else {
					System.out.println("Seat already assigned to a customer.");
				}
		}
		
	}
	public void unAssignSeat(int seatId) {
		
		if (this.numEmptySeat == seat.length || seat[seatId-1].isOccupied()==false) {
			System.out.println("Seat is not yet assigned.");
			return;
		}
		seat[seatId-1].unAssign();
		System.out.println("Seat Unassigned!");
		numEmptySeat++;
	}
}
