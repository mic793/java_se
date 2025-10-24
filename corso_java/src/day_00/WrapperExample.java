package day_00;

public class WrapperExample {
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf(42);// Creazione di un oggetto Integer
        int intValue = intWrapper.intValue();// Estrazione del valore

        Double doubleWrapper = Double.valueOf(3.14);
        double doubleValue = doubleWrapper.doubleValue();

        Character charWrapper = Character.valueOf('A');
        char charValue = charWrapper.charValue();

        Boolean boolWrapper = Boolean.valueOf(true);
        boolean boolValue = boolWrapper.booleanValue();

        System.out.println("Valore int: " + intValue);
        System.out.println("Valore double: " + doubleValue);
        System.out.println("Valore char: " + charValue);
        System.out.println("Valore boolean: " + boolValue);
    }
}
