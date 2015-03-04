/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingchallenges.threenplusone;

import java.io.IOException;
import static programmingchallenges.threenplusone.FirstOne.count;

/**
 *
 * @author Joseph
 */
public class RunnableFirstOne implements Runnable{
    static String ReadLn(int maxLength){
        byte line[] = new byte[maxLength];
        int length = 0;
        int input = -1;
        try{
            while(length < maxLength){
                input = System.in.read();
                if((input < 0)||(input == '\n'))break;
                line[length++] += input;
            }
            if((input<0)&&(length==0))return null;//end of file
            return new String(line,0,length);
            
        }catch(IOException e){
            return null;
        }
    }
    public static void main(String[] args){
        RunnableFirstOne myWork = new RunnableFirstOne();
        myWork.run();
    }
    @Override
    public void run(){
        new ThreeTimesPlusOne().run();
    }
    /**
     * Inner class that holds the work
     */
    class ThreeTimesPlusOne implements Runnable{
        @Override
        public void run(){
            //here implement code
            countTimes(22);
        }
    /**
     * Main method that does the calculation
     * @param number number to be accounted for
     */
    private void countTimes(int number){
        System.out.println(number);
        while(number!=1){
        if(number%2 == 0){
            number= number/2;
        System.out.println(number);
            
            count++;
        }
        else{
            number = (number*3)+1;
        System.out.println(number);
            count++;
        }
    }
        if(number ==1) count++;//add one once we reach 1

    }        
        //here to insert classes
    }
}
