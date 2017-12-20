package model;

public class World{
    public int[][] a = new int[10][10];
    
    public void setUp(){
        a[4][5] = 1;
        a[6][5] = 1;
        a[5][5] = 1;
        a[5][4] = 1;
        a[5][6] = 1;
    }

    public void printBoard(){
        for(int[] row : a){
            for(int loc : row){
                System.out.print(loc);
            }
            System.out.println();
        }
    }
}
