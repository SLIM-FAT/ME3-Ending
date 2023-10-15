package Mehrbod.MassEffect.ending;

import java.util.Scanner;
import static Mehrbod.MassEffect.ending.Master.*;

/**
 *
 */
public class Player {
    protected String name = "";
    protected String history = "";
    protected String profile = "";
    protected int player_MAXHP;
    protected int player_HP;
    protected int player_Dmg = 12;

    /**
     *
     */
    public Player(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
        Welcome to alliance military database.
        Classified information requested ...
        Secure connection confirmed. 
        Please enter your name: 
        """);
        String name = "";
        while(name.equals("")) name = scanner.nextLine();
        System.out.println("Warning! Data corruption detected. Please reconstruct profile");
        System.out.println("Hello, "+name+" Shapard! Please enter your military specialization: ");
        this.name = name;
        String profile ="";
        while(profile.equals("")) {
            System.out.println("Valid options are Soldier, Engineer, Adept, Infiltrator, Sentinel, and Vanguard. ");
            switch (profile = scanner.nextLine().toLowerCase()) {
                case ("soldier"):
                    this.profile = "soldier";
                    break;
                case ("engineer"):
                    this.profile = "engineer";
                    break;
                case ("adept"):
                    this.profile = "adept";
                    break;
                case ("infiltrator"):
                    this.profile = "infiltrator";
                    break;
                case ("sentinel"):
                    this.profile = "sentinel";
                    break;
                case ("vanguard"):
                    this.profile = "vanguard";
                    break;
                default:
                    System.out.println("Please choose of of the valid options.");
                    profile = "";
                    break;
            }
        }
            System.out.println("Military specialization completed. \n");
            System.out.println("Please enter pre-service history: ");
            System.out.println("""
                    SPACER: Both of your parents were in the Alliance military. 
                    Your childhood was spent on ships and stations as they transferred from posting to posting, 
                    never staying in one location for more than a few years. 
                    Following in your parents’ footsteps, you enlisted at the age of eighteen.
                    """);
            System.out.println("""
                    EARTHBORN: You were an orphan raised on the streets of the great megatropolises covering Earth. 
                    You escaped the life of petty crime and underworld gangs by enlisting
                    with the Alliance military when you turned eighteen.
                    """);
            System.out.println("""
                    COLONIST: You were born and raised on Mindoir, a small border colony
                    in the Attican Traverse. When you were sixteen slavers raided Mindoir, 
                    slaughtering your family and friends. 
                    You were saved by a passing Alliance patrol, 
                    and you enlisted with the military a few years later.
                    """);
            String history = "";
            while(history.equals("")) {
                switch (history = scanner.nextLine().toLowerCase()) {
                    case ("earthborn"):
                        this.history = "Earthborn";
                        break;
                    case ("spacer"):
                        this.history = "Spacer";
                        break;
                    case ("colonist"):
                        this.history = "Colonist";
                        break;
                    default:
                        System.out.println("Valid options are Spacer, Earthborn and Colonist.");
                        history = "";
                        break;
                }
            }

            System.out.println("Profile reconstruction complete.");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("*********************************** PROLOGUE ***********************************");
        System.out.println("\n");
        System.out.println("\n");
    }

    public int getPlayer_HP() {
        return player_HP;
    }
    private void die() {
        player_HP = 0;
        System.out.println("YOU DIED!");
        System.out.println(this.getClass().getSimpleName() + " killed you!");
        endGame();
    }
    protected void omnigel(int healPoints){
        if (player_HP + healPoints > player_MAXHP) player_HP = player_MAXHP;
    }

}