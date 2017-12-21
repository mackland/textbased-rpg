package model;

import view.*;

public class Battle {
    private Creature creature;
    private Player player;
    private Display display;
    private boolean fighting;

    public Battle(Player player, Creature creature, Display display){
        this.creature = creature;
        this.player = player;
        this.display = display;
    }

    public void start(){
        fighting = true;
        while(fighting){
            display.showBattleInfo(player.getHealth(), creature.getHealth());
            int attack = player.attack();
            creature.updateHealth(-attack);
            display.attackInfo(player.getName(), creature.getName(), attack);
            if(creature.getHealth() <= 0){
                display.successfulBattle(creature.getName());
                fighting = false;
            } 
            //ask user input
            //attack
            //if health > 0 -> continue
        }
    }
    
}
