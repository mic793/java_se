package day_00_es_06_aerodromo;

public class AeromobileTest {
	
	public static void main(String[] args) {
		
		//Aeromobile a = new Aeromobile("Aeromobile 1");
		//System.out.println(a);
		
		//Aliante al1 = new Aliante("Aeromobile 2", 10);
		//System.out.println(al);
		
		//AereoAMotore aerei = new AereoAMotore("Aeromobile 3", 5.9);
		//System.out.println(aerei);
		
		Aeromobile al1 = new Aliante("AL-001", 40);
		Aeromobile al2 = new Aliante("AL-002", 35);
		Aeromobile am1 = new AereoAMotore("AM-010", 180.0);
		Aeromobile am2 = new AereoAMotore("AM-011", 220.0);
        
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(am1);
        System.out.println(am2);

        // Confronti corretti (stesso tipo)
        System.out.println("al1 superiore ad al2? " + al1.compareTo(al2)); // true
        System.out.println("am1 superiore ad am2? " + am1.compareTo(am2)); // false

	}

}
