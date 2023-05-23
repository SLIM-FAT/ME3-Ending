package Mehrbod.MassEffect.ending;

import Mehrbod.MassEffect.ending.Enemies.Husk;

import static Mehrbod.MassEffect.ending.Master.*;

public class Story {

    public Story(){
        init();
        //prologue();
       // actOne();
        actTwo();
    }
    public static void prologue(){

        waiting(3);

        System.out.println("“Wake up!”");
        waiting(1);
        System.out.println("“We did it.”");
        waiting(1);
        System.out.println("“We did.”");
        waiting(1);
        System.out.println("“It’s quite a view.”");
        waiting(1);
        System.out.println("“Best seats in the house.”");
        waiting(2);
        System.out.println("“God… Feels like years since I just sat down”");
        waiting(1);
        System.out.println("“I think you earned a rest.”");
        waiting(1);
        System.out.println("“You did well son. I am proud of you.”");
        waiting(1);
        System.out.println("“Thank you sir. Anderson? Stay with me.”");
        waiting(1);
        System.out.println("“You need to wake up.”");
        waiting(1);
        System.out.println("“Wake up!”");
        waiting(1);
    }
    public static void actOne() {
        System.out.println("""
                You looked awful. You were bleeding, beat up and unconscious. The elevator brought you to this room. If you can even call it a room.
                “Wake up!”
                I said as I stood above you.
                """);

        System.out.println("""
                1) Who are you? Where am I?
                2) Did the Normandy make it?
                3) Why are the reapers still fighting?
                """);
        input = new Input(3);
        switch (input.playerChoice) {
            case (1):
                System.out.println("I am the catalyst. You are in the center of the Citadel. \n");
                break;
            case (2):
                System.out.println("I don’t know. I am the Catalyst but I don’t control the reapers directly.\n I cannot see what each individual reaper is doing or seeing. \n");
                break;
            case (3):
                System.out.println("Because I’m the Catalyst and the reapers haven't been destroyed… yet. \n");
                break;
        }

        System.out.println("""
                You looked past me. From here you could see everything. The biggest war anyone has ever seen. You stopped for a minute.
                I couldn't figure out what you were thinking. You finally said:
                “You are the catalyst. Does this mean you are the reason people are dying?”
                “Yes I am.”
                “But why? After all these years. Why? I did everything I could to stop you but I never understood why the reapers are doing this.”
                “Does it really matter now?”
                """);


        System.out.println("""
                1) No. I just want to stop the reapers and bring peace to the galaxy.
                2) It matters. Every soldier needs a cause. I want to know what all this suffering was for.
                """);
        input = new Input(2);
        switch (input.playerChoice) {
            case (1) -> System.out.println("Ok then. \n");
            case (2) -> System.out.println("I'm not sure you are ready for it but Survival. \n");
        }

    }

    public static void actTwo(){

        System.out.println("you see a Husk rushing towards you what do you do? \n");
        System.out.println("""
                1) Let it kill you and end this suffering.
                2) Get your pistol and shoot the Husk.
                """);
        //System.out.println(player.name);

        input = new Input(2);
        switch (input.playerChoice) {
            case (1):
                System.out.println("The husk run towards you. With no hesitation it attacks you relentlessly. There is no emotion. " +
                        "Like its machines controlling it, it just does what is supposed to do. It eats your body alive. Rips you muscle and bones. Its a terrible death. \n");
                System.out.println("YOU DIED!");
                endGame();
                break;
            case (2):
                System.out.println("haven't written anything yet");
                Fight combat = new Fight();
                combat.add(new Husk());
                combat.runFight();
                break;
        }
    }
}
