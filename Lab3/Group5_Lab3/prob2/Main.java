package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Building> buildingsOwned = new ArrayList<>();
		Apartment _101 = new Apartment(500);
		Apartment _102 = new Apartment(500);
		Apartment _103 = new Apartment(500);
		Apartment _104 = new Apartment(1000);
		List<Apartment> aptList = Arrays.asList(new Apartment[]{_101, _102, _103, _104});
		Building b = new Building(100, aptList);
		
		//add building to list
		buildingsOwned.add(b);
		
		
		Apartment _201 = new Apartment(800);
		Apartment _202 = new Apartment(800);
		Apartment _203 = new Apartment(1000);
		aptList = Arrays.asList(new Apartment[]{_201, _202, _203});
		b = new Building(500, aptList);
		
		//add building to list
		buildingsOwned.add(b);
		
		System.out.println("Total monthly profit for first building is : $" + buildingsOwned.get(0).getProfit());
		System.out.println("Total monthly profit for second building is : $" + buildingsOwned.get(1).getProfit());
	}
}
