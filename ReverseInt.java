//Problem: https://leetcode.com/problems/reverse-integer/

import java.util.Scanner;


class ReverseInt {
    public static void main(String[] args) {
    
    int length; //length of the input
    int spot; //the digit position
    long numint; // convert input into int
    int ldigit; //last digit of the input
    int zeronum=0;//number of zeros at the end of the input
    
    Scanner input = new Scanner(System.in);
    	

    
        System.out.println("Enter a number: "); 
        String num = input.nextLine();// user input 
        input.close();	
       
        

        try{ //test whether user type in integer
            numint = Long.parseLong(num);
        }
        catch (Exception mismatch){
           System.out.println("Please enter an integer.");
           return;
        }
        
        length = num.length(); //input number length
       
        System.out.println("");
        
        System.out.println("Number reversed:");
        
        
 
        if (numint > 0){ //case when user input is positive
        
        ldigit  = Integer.parseInt(num.substring(length-1)); //convert last digit into integer
        
         
        if (ldigit !=0){ //when last digit is not zero
            
        for (spot=length; spot>0; spot--){
            
        System.out.print(num.substring(spot-1,spot)); //printing out reversed number    
            }//end of for loop
        }
        
        if (ldigit == 0 ){ //when last digit is zero
        
        for (spot=length;spot>0;spot--)    { 
            if (Integer.parseInt(num.substring(spot-1,spot))!=0){
                break;       //break when the digit turns into non-zero
            }
         
         zeronum++;//number of zeroes add up
        }
        
        for (spot=length-zeronum;spot>0;spot--){ 
            
        System.out.print(num.substring(spot-1,spot));  //print out digit without the zero
            
            }  //end of for loop
        }
        }
        
        
        
        
        if (numint <0){//case when the user input is negative
            
        ldigit  = Integer.parseInt(num.substring(length-1));
        System.out.print("-"); //print out negative sign 
        
        if (ldigit !=0 )    { // when last digit is not zero
        
        
        for (spot=length; spot>1; spot--){
        
        System.out.print(num.substring(spot-1,spot)); //printing out reversed number    
        }//end of for loop
        
        }
        
        
        if (ldigit == 0 ){ //when last digit is zero
        for (spot=length;spot>0;spot--)    { 
            if (Integer.parseInt(num.substring(spot-1,spot))!=0){
                break;       //break when the digit turns into non-zero
            }
         
         zeronum++;//number of zeroes add up
         } //end of for loop   
        
        for (spot=length-zeronum;spot>1;spot--){ 
        
           
            
        System.out.print(num.substring(spot-1,spot));  //print out digit without the zero
            
        }//end of for loop      
        }
        
        
        }
        
        
        

        
    }
}
