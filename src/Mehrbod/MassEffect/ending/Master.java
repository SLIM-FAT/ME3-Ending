package Mehrbod.MassEffect.ending;


/**
 *
 */
public abstract class Master { // This is the class that runs the game basically.

    protected static final Player player = new Player();
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
                System.out.println("You are a ... a ... a PUSSY! (in Walter Jr voice");
        }
    }


}