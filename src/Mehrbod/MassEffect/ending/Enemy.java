package Mehrbod.MassEffect.ending;
import static Mehrbod.MassEffect.ending.Master.*;

/**
 *  The abstract class for the enemies. Each enemy class extends this class.
 *
 * @author  Mehrbod Mehrabi
 */
public abstract class Enemy {
    protected int HP; //Stores enemies health
    protected int MAX_HP; //shows the maximum health of the enemy.
    protected int MAX_DAMAGE; //show how much damage enemies can deal.
    protected int HIT_CHANCE = 75; //For now not usable. I will prop add a mechanism that can lower or higher their damage based on chance.

    /**
     * @return Enemy HP
     */
    protected int getHealth(){
        return HP;
    }

    /**
     * reduces the HP or kills the enemy if HP is 0.
     * @see #die()
     * @param damage
     */
    protected void gettingDamage(int damage){
        if(damage >= HP) die();
        else {
            HP -= damage;
        }
    }


    /**
     * Kills the enemy. can only be called from gettingDamage
     * also changes Fight.fightNotOver.
     */
    private void die() {
        HP = 0;
        System.out.println("You killed " + this.getClass().getSimpleName());
        Fight.fightsNotOver = false;
    }
}
