package day_00;

public class StaticBinding {
	
	void m1() {
		System.out.println("m1-x");
	}
	
	void m2() {
		System.out.println("m2-x");
	}

	public static void main(String[] args) {
		
		StaticBinding x = new StaticBinding();
		x.m1();
		x.m2();

	}

}
