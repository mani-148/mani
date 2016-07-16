/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class positive {
    public static void main(String[] args) {
        int n;
        Scanner a=new Scanner(System.in);  
        n=a.nextInt();
        if(n==0)
            System.out.println(" number is zero");
        if(n>0)
            System.out.println("number is positive");
        if(n<0)
            System.out.println("number is negative");
               
        
        
    }
    
}
