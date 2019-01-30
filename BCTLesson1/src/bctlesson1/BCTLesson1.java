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

public class BCTLesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        int yob, cyr, age;
        
        System.out.println("=================================");
        System.out.println("Enter your name: ");
        name = input.nextLine();
        
        System.out.println(name + " When were you born?: ");
        yob = input.nextInt();
        
        System.out.println("Enter Current Year: ");
        cyr = input.nextInt();
        
        age = cyr - yob;
        
        System.out.println(name + " you are " + age + " year old ");
        
        System.out.println("=================================");
        
        if(age<18){
            System.out.println(name + " underage");
        } else{
            System.out.println(name + " of age");
        }
    }
    
}
Vv