package lession8.labs.prob1h;

import java.util.function.Consumer;

public class Println {
	public void convert(){
		Consumer<String> consumer = (s)-> System.out.println(s);
        consumer.accept("Convert System.out.println() method to a lambda expression.");
    }
	
	public static void main(String[] args) {
		Println print = new Println();
		print.convert();
	}
}
