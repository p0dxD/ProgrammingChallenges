/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingchallenges.minesweeper;
import programmingchallenges.template.Main;
/**
 *
 * @author Joseph
 */
public class Minesweeper implements Runnable{
     public static void main(String args[])  // entry point from OS
    {
        Main myWork = new Main();  // Construct the bootloader
        MyStuff execute = new MyStuff();
        execute.run();
    }   
    @Override
    public void run() {
        new MyStuff().run();
    }
    
}
class MyStuff implements Runnable{
    int matrix[][];
    int row, column;
    @Override
    public  void run(){
        	// Your program here
        System.out.println("Test");
        }
    public void create(int n, int m){
        row = n;
        column = m;
        matrix = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                matrix[i][j] = '.';
            }
        }
    }
    /**
     * Displays the array with everything set up 
     */
    public void Display(){
        System.out.println("\nThe matrix is: ");
        for(int i = 0; i < row; i++){
            for(int j= 0; j < column; j++){
                System.out.println(""+matrix[i][j]);
            }
        }
    }
    // You can insert more classes here if you want.
}
