package view;

public class Display{
    public void getDirections() {
        for(int i = 0; i < 100; i++) System.out.println();
        System.out.println("--- Where do you want to go? ---");
        System.out.println("1. North.....(n)");
        System.out.println("2. South.....(s)");
        System.out.println("3. West......(w)");
        System.out.println("4. East......(e)");
    }
    
    public void printBoard(String[][] board){
        for(int i = 0; i < 100; i++) System.out.println();
        
        for(String[] row : board){
            for(String loc : row){
                System.out.print(loc);
            }
            System.out.println();
        }
    }

    public void enemyAppeared(){
        System.out.println("An enemy has appeared!");
    }

    public void showBattleInfo(int playerHp, int enemyHp) {
        System.out.println("You have " + playerHp + " while enemy has " + enemyHp + "hp");
    }
    
    public void attackInfo(String c1, String c2, int dmg){
        System.out.println(c1 + " has attacked " + c2 + " and caused " + dmg + " damage.");
    }

    public void successfulBattle(String s){
        System.out.println("You have successfully defeated " + s);
    }
}
