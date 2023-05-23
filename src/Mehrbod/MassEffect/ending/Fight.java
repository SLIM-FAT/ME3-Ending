package Mehrbod.MassEffect.ending;

import static Mehrbod.MassEffect.ending.Master.*;

import Mehrbod.MassEffect.ending.Input;

import java.util.List;

public class Fight {

    private Enemy enemy;

    boolean fightsNotOver = true;
    int headChance = 50;
    int bodyChance = 85;

    //boolean isHit;

    public void add(Enemy newEnemy) {
        enemy = newEnemy;
    }

    public void playerCombat(){


    }
    public void npcCombat(){


    }

    public void runFight() {
        System.out.println("---------- ENTERING COMBAT -----------");
        //

        while(fightsNotOver){
            System.out.println("What do you want to do?");
            System.out.println("1. Shoot " + enemy.getClass().getSimpleName() + "'s head");
            System.out.println("2. Shoot " + enemy.getClass().getSimpleName() + "'s body");
            input = new Input(2);
            switch (input.playerChoice){
                case(1):
                    if(isHit(headChance))
                    enemy.dealingDamage(player.player_Dmg*2);
                    else
                        System.out.println("You missed!");
                    break;
                case (2):
                    if(isHit(bodyChance))
                        enemy.dealingDamage(player.player_Dmg);
                    else
                        System.out.println("You missed!");
                    break;
            }
        }
    }

    private boolean isHit(int chance){
        int rand = (int) Math.floor(Math.random() *(100 + 1));
        if(rand > chance) return false;
        else return true;
    }
}