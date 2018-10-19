package lession8.labs.prob1j;

import java.util.function.Supplier;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is for part i, ii
		Supplier<Double> rand = ()->Math.random(); 
		System.out.println(rand.get());
		// This is for part iii	
		MathRandom mr = new MathRandom();
		GenerateRandom gr = mr. new GenerateRandom();
		System.out.println(gr.get());
		
	}

	class GenerateRandom implements Supplier<Double> {

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}
		
	}
}
