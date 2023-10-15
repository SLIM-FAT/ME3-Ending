package Mehrbod.MassEffect.ending;
import static Mehrbod.MassEffect.ending.Master.*;
public abstract class Enemy {
    protected int HP;
    protected int MAX_HP;
    protected int MAX_DAMAGE;
    protected int HIT_CHANCE = 75;

    protected int getHealth(){
        return HP;
    }
    protected void gettingDamage(int damage){
        if(damage >= HP) die();
        else {
            HP -= damage;
        }
    }



    private void die() {
        HP = 0;
        System.out.println("You killed " + this.getClass().getSimpleName());
        Fight.fightsNotOver = false;
    }
}
