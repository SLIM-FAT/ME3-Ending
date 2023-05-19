package Mehrbod.MassEffect.ending;

import static Mehrbod.MassEffect.ending.Master.*;

public class Story {

    public Story(){
        init();
        prologue();
        actone();
    }
    public static void prologue(){
        System.out.println("""
                “Wake up!”
                “We did it.”
                “We did.”
                “It’s quite a view.”
                “Best seats in the house.”
                “God… Feels like years since I just sat down”
                “I think you earned a rest.”
                “You did well son. I am proud of you.”
                “Thank you sir. Anderson? Stay with me.”
                “You need to wake up.”
                “Wake up!”
                """);
    }
    public static void actone() {
        System.out.println("""
                You looked awful. You were bleeding, beat up and unconscious. The elevator brought you to this room. If you can even call it a room.
                “Wake up!”
                I said as I stood above you.
                """);
        String ans = "";

        //while (ans.equals("")) {
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
        ans = "";

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
}
