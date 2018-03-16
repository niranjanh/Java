/*

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

*/



import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int flag =0;
        /*
        String B = A.reverse();
        
        if(A == B)
        {
          System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
         */
        if( A.length() > 1)
        {
        for(int i = 0; i < (A.length()/2) -1;i++)
        {
            if(A.charAt(i) == A.charAt(A.length()-i-1))
            {
                flag = 1;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        }
        else
        {
            flag = 1;
        }
        
        
        if(flag == 1)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
       
        
    }
}
