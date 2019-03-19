package in.joshuaaust;

public class Main {

    public static void main(String[] args) {

        // order of initialization
        Chicken little = new Chicken();
        System.out.println(little.name);
        System.out.println();

        // integer literals
        IntegerLiterals.printLiterals();
        System.out.println();

        // legal variable names
        LegalVariableNames.printLegalValues();
        System.out.println();

        // default initialization
        DefaultInitialization.printDefaultValues();
        System.out.println();

    }
}
