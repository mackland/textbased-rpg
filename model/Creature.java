package model;

public class Creature {
    private int maxHealth;
    private int currentHealth;
    private int damage;
    private int potions;
    
    private int currentX;
    private int currentY;
    public Creature(int mH, int cH, int dmg, int potions) {
        this.maxHealth = mH;
        this.currentHealth = cH;
        this.damage = dmg;
        this.potions = potions;
    }

    public int attack() {
        return damage;
    }

    public int getHealth(){
        return currentHealth;
    }
}
