package lesson9.labs.prob14;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance = null;
	public String msg;
	private MySingletonLazy() {
		msg = "Test 1";
	}
	
	public static MySingletonLazy getInstance() {
		instance = Optional.ofNullable(instance).orElse(new MySingletonLazy());
		return instance;
	};	
}
