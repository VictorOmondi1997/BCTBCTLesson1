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

public class Demo2 {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        
        String userName,correctName = "BCT Y2S2";
        
        
        System.out.println("Enter the userName:");
        System.out.println("Enter the userName:");
        userName = sc.nextLine();
        
        if(userName.equals(correctName)){
            System.out.println("Correct Username😄");
        } else{
            System.out.println("Username incorect \n Try Again:");
            main(s);
        }    
    }
}
