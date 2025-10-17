package day_00;

public class MainTest {
	public static void main(String[] args) {
		int a = 5;
		m1(a);
	}

	public static void m1(int a) {

		m2(a); // chiama m2 usando la variabile a come parametro
		System.out.println(a);
	}

	public static void m2(int i) {
		i = 10;
	}
}
