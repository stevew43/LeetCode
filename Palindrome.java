
//Problem: https://leetcode.com/problems/palindrome-number/

import java.util.ArrayList;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
    
    long numint = 0; // input as an integer
    int length = 0; // integer length
    int spot = 0; //spot of the input
    int spot2=0; //spot for the reveresed input

    
    ArrayList <String> pal  = new ArrayList<String>(); //input as a list
    ArrayList <String> palrev  = new ArrayList<String>(); // input a a list after reverse
        
    Scanner input = new Scanner(System.in);
    	

    
        System.out.println("Enter a number: "); 
        String num = input.nextLine();// user input 
        input.close();	
    
        numint = Long.parseLong(num);
        
        
        
    if (numint < 0){ //when input is negative
        
        System.out.println("Not a Palindrome.");
    }
    
    if (numint > 0){
        

        length = num.length();
        
        for (spot=0; spot<length; spot++){
            
        pal.add(num.substring(spot,spot+1)); //add input into the list    
            }//end of for loop       
         
         
        for (spot2=length; spot2>0; spot2--){
            
        palrev.add(num.substring(spot2-1,spot2)); //add the reversed number into the list    
            }//end of for loop
       
        
        if (pal.equals(palrev)){ //when two lists equal to each other
            System.out.println("It is a Palindrome!");
        }
        
        
        if (!pal.equals(palrev)){ //when not equal to each other
            System.out.println("Not a Palindrome.");
        }
            
        }
        
        
    }
    
        
        
    }

