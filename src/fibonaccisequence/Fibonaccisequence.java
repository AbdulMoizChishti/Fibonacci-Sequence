/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisequence;

import java.util.Scanner;
public class Fibonaccisequence {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj=new Scanner (System.in);
        System.out.println("Enter number of terms:");
    int nterms=obj.nextInt();
    int n1,n2,count;n1=0;n2=1;count=0;
    
    if (nterms<=0){
        System.out.println("please enter a positive number:");
    }
    else if (nterms==1){
        System.out.println("Fibonacci sequence upto"+ nterms+":");
        System.out.println(n1);
    }
    else{
   System.out.println("Fibonacci sequence:");
   while (count < nterms){
       System.out.print(n1+ " ");
       int nth = n1 + n2;
       n1 = n2;
       n2 = nth;
       count ++;
    }
    }
        System.out.println("");
    }
    
}
