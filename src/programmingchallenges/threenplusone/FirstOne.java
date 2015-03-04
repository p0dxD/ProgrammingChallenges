/**
 * This is the first attempt at answering
 * the first question found in 
 * programming-challenges.com
 */
package programmingchallenges.threenplusone;

import java.util.Scanner;

/**
 * @since March 03, 2015
 * @author Jose 
 */
public class FirstOne {
    static int count = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, n;
        System.out.println("Please input starting point: ");
        i = input.nextInt();
        System.out.println("Please input ending point: ");
        n = input.nextInt();
        for(; i <= n;i++){
            countTimes(i);
        }
        System.out.println("answer: "+count);
    }
    /**
     * Main method that does the calculation
     * @param number number to be accounted for
     */
    private static void countTimes(int number){
        while(number!=1){
        if(number%2 == 0){
            number= number/2;
            count++;
        }
        else{
            number = (number*3)+1;
            count++;
        }
    }
        if(number ==1) count++;//add one once we reach 1

    }
    /**
     * 
     * @return result with correct iterations
     */
    private int getResult(){
        return count;
    }
}
