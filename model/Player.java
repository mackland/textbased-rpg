package model;

public class Player extends Creature {
    private String name;

    public Player(int mH, int cH, int dmg, int potions, String name){
        super(mH, cH, dmg, potions);
        this.name = name;
    }

    public void move(int dx, int dy){
        this.currentX = this.currentX + dx;
        this.currentY = this.currentY + dy;

        System.out.println("Player has moved to: [" + this.currentX + "," + this.currentY + "]");
    }
}
