package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintenanceCost;
	private List<Apartment> apartments = new ArrayList<>();;
	
	public Building(double maintenanceCost, List<Apartment> apartments) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}
	
	public double getProfit() {
		double sum = 0;
		for(Apartment a : apartments)
			sum += a.getRent();
		return sum - maintenanceCost;
	}
}
