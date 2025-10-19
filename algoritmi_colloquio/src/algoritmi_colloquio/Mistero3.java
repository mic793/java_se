package algoritmi_colloquio;

public class Mistero3 {

	public static void main(String[] args) {
		
		String one = "one";
		String two = "two";
		String One = new String(one);
		String Two = two;
		
		System.out.println(one);
		System.out.println(One);
		System.out.println(System.identityHashCode(One) + " riferimenti di memoria diversi + " + System.identityHashCode(One));
		
		if(one == One) {
			System.out.println("Java is fun!");
		}if(one.equals(One) == true) {
			System.out.println("Programming needs practice");
		}if(one == Two){
			System.out.println("OOP is the way!");
		}if(two.equals(Two) == true) {
			System.out.println("Explore the world of Java.");
		}
		

	}

}
