/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bctlesson1;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        
        int lowerLimit, upperLimit, testNumber;
        
        System.out.println("😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄");
        System.out.println("Welcome To The Game Of Numbers \n");
        System.out.println("Enter The Lower Limit Number:");
        lowerLimit = sc.nextInt();
        
        System.out.println("Enter The Upper Limit Number:");
        upperLimit = sc.nextInt();
        
        System.out.println("Enter A Number that is within Range");
        testNumber = sc.nextInt();
        if( testNumber>= lowerLimit &&  testNumber<= upperLimit){            
            if(testNumber%2 == 0){
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        } else{
            System.out.println("Number Out Of Range \n Try Again");
            main(s);
        }
        
        System.out.println("😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄");
  
    }
}
