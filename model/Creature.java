package model;

public class Creature {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int damage;
    private int potions; 
    public int currentX;
    public int currentY;

    public Creature(int mH, int cH, int dmg, int potions, String name) {
        this.maxHealth = mH;
        this.currentHealth = cH;
        this.damage = dmg;
        this.potions = potions;
        this.name = name;
    }

    public int getDamage(){
        return damage;
    }

    public void updateHealth(int dHP) {
        this.currentHealth = this.currentHealth + dHP;
    }

    public int getHealth(){
        return currentHealth;
    }

    public String getName(){
        return name;
    }
}
