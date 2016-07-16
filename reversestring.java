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
public class reversestring {
    public static void main(String[] args) {
        String String;
        Scanner Sc=new Scanner(System.in) ;
        String =Sc.nextLine();
      String reverse = new StringBuffer(String).reverse().toString();
     
      System.out.println(reverse);
    
   }
}
        
        
    
    
  
