package Mehrbod.MassEffect.ending;


/**
 *
 */
public abstract class Master { // This is the class that runs the game basically.

    protected static final Player player = new Player();
    static Input input;

    public static void init() {

    }


    public static void fight1(){
        System.out.println("you see a Husk rushing towards you what do you do? \n");
        System.out.println("""
                1) Let it kill you and end this suffering.
                2) Get your pistol and shoot the Husk.
                """);
        input = new Input(3);
        switch (input.playerChoice) {
            case (1):
                System.out.println("The husk run towards you. With no hesitation it attacks you relentlessly. There is no emotion. " +
                        "Like its machines controlling it, it just does what is supposed to do. It eats your body alive. Rips you muscle and bones. Its a terrible death. \n");
                break;
            case (2):

                break;
        }

    }


}