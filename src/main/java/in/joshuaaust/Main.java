package in.joshuaaust;

public class Main {

    public static void main(String[] args) {

        // attempt to cause garbage collection
        GarbageCollectible.doShenanigans();
        System.out.println();

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

        // checked exceptions with an unchecked catch (such as RuntimeException) force the checked
        // exceptions to be caught outside the function's try statement
        try {
            CatchAndThrow.catchWithRuntimeException();
        } catch (ShesGonnaBlowException s) {
            System.out.println("caught outside with a ShesGonnaBlowException catch!");
        }

        // checked exceptions can be caught with a Throwable catch
        CatchAndThrow.catchWithThrowable();

        // varargs
        VarArgsExample.multiply(5, 5); // 25
        VarArgsExample.multiply(2, 2, 2, 2, 2, 2); // 64

    }
}
