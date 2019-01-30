/*
 * Ayoob Atcha
 * Student ID: 991512971
 * SYST10199 - Web Programmer
 */
package reviewarray;

import java.util.Scanner;

/**
 *
 * @author ayoob
 */
public class ReviewArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner (System.in);
        System.out.println("Please enter a word in ");
        String word = myInput.nextLine();
        int wordLength = word.length();
        char [] wordPer = new char [wordLength];  
        for(int i = wordLength-1; i >=0;i--){
            wordPer[i]= word.charAt(i);
            System.out.println (wordPer[i]);
            System.out.println ("HI");

            
        }
        
    }
    
}
