package lesson9.labs.prob14;

public class Main {

	public static void main(String[] args) {
		MySingletonLazy msl = MySingletonLazy.getInstance();
		MySingletonLazy msl2 = MySingletonLazy.getInstance();
		MySingletonLazy msl3 = MySingletonLazy.getInstance();
		MySingletonLazy msl4 = MySingletonLazy.getInstance();
		
		msl.msg = "Group 5"; //msl changes msg value in singleton
		
		System.out.println("Hash codes are the same!");
		System.out.println(msl.hashCode());
		System.out.println(msl2.hashCode());
		System.out.println(msl3.hashCode());
		System.out.println(msl4.hashCode());
		
		System.out.println(msl4.msg); //msl4 outputs Group 5 which was changed by msl
	}

}
