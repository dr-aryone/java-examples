package in.joshuaaust;

public class CatchAndThrow {

    public static void catchWithRuntimeException() throws ShesGonnaBlowException {
        try {
            throw new ShesGonnaBlowException();
        } catch (RuntimeException r) {
            System.out.println("caught it inside a RuntimeException catch!");
        }
    }

    public static void catchWithThrowable() {
        try {
            throw new ShesGonnaBlowException();
        } catch (Throwable t) {
            System.out.println("caught it inside a Throwable catch!");
        }
    }

}
