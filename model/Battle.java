package model;

import view.*;

public class Battle {
    private NPC npc;
    private Player player;
    private boolean fighting;

    public class Battle(NPC npc, Player player){
        this.npc = npc;
        this.player = player;
    }

    public void start(){
        while(fighting){
            //ask user input
            //attack
            //if health > 0 -> continue
        }
    }
    
}
