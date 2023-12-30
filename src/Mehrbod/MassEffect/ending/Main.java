package Mehrbod.MassEffect.ending;

// Allows access to the Story class. Not required but keeping it case.
import static Mehrbod.MassEffect.ending.Master.*;

/**
 * The entry point of the project. Probably won't be needed in the future.
 * runs {@link Story}.
 * <b>Note</b> Java 17 is the minimum version required.
 * @author  Mehrbod Mehrabi
 */
public abstract class Main {

    public static void main(String[] args) {
        new Story();
        // Don't fear the reapers
    }
}