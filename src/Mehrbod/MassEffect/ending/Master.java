package Mehrbod.MassEffect.ending;
import java.util.concurrent.TimeUnit;

//TODO: Documentation for Master.
/**
 * This Class basically runs the game.
 * @
 * @author  Mehrbod Mehrabi
 */
public abstract class Master {

    // I'm using a new constructor to not have to create my character everytime.
    // This line will be deleted in the final build
    protected static final Player player = new Player("mehrbod","soldier", "colonist");
    static Input input;
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
    public static void waiting(long time){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException("what the fuck is this? RuntimeException?");
        }
    }


}