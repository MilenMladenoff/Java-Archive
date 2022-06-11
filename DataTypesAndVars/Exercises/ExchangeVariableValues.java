package DataTypesAndVars.Exercises;

public class ExchangeVariableValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before:");
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
        int temporary = a;
        a = b;
        b = temporary;
        System.out.println("After:");
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
    }
}
