package Mehrbod.MassEffect.ending;
import java.util.concurrent.TimeUnit;

/**
 * This Class basically runs the game. This class initializes the player,
 * has a waiting method that puts a delay between each line,
 * determines if the game has ended and terminates the game.
 * @author  Mehrbod Mehrabi
 */
public abstract class Master {

    // I'm using a new constructor to not have to create my character everytime.
    // This line will be deleted in the final build
    protected static final Player player = new Player("mehrbod","soldier", "colonist");
    /**
     * The game input that will be used to determine which choice player has chosen.
     * Tt is created only once in {@link Master} and can be called anywhere since it's static.
     */
    static Input input; // The game input that will be used

    /**
     * This method does nothing. Instead, it initializes the player and input classes above.
     */
    public static void init() {

    }

    public static void endGame(){
        System.out.println("Would you like to start over?");
        System.out.println("(1)YES / (2)NO");
        input = new Input(2);
        switch (input.playerChoice){
            case(1):
                new Story();
                break;
            case (2):
                System.out.println("You are a ... a ... a PUSSY! (in Walter Jr voice)");
        }
    }

    /**
     * This method receives time in second and delay the next dialog using {@link TimeUnit}.
     * @throws RuntimeException
     * @param time Wait time in seconds.
     */
    public static void waiting(long time){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException("what the fuck is this? RuntimeException?");
        }
    }


}