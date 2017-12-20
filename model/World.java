package model;

public class World{
    public int[][] a = new int[10][10];
    
    public void setUp(){
        a[1][1] = 1;
        a[1][2] = 1;
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
