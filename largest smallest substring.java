
/*
Given a string, s , and an integer,  k , complete the function so that it 
finds the lexicographically smallest and largest substrings of length .
*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = ""; //= s.substring(0,k);
        String largest =""; //= s.substring(0,k);
        
        //String sm1 ="";
        //String lrg1 ="";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //System.out.println(s.length());   //13 
        if(s.length() > k)
        {
        for(int i = 0; i < (s.length() - k);i++)
        {
            if(i == 0)
            {
              // la2 = sm2 = s.substring(0,k);
                largest = smallest = s.substring(0,k);
               //la2 = s.substring(0,k);
            }   // i = s.length();
            
            String sm1 = s.substring(i+1,i+k+1);
           // System.out.println(sm1); 
            //String sm2 = s.substring(i+1,i+k+1);
            
            if(sm1.compareTo(smallest) < 0)
            {
                smallest = sm1;
                //sm1 = smallest;
            }
           
            String la1 = s.substring(i+1,i+k+1);
            //String lrg2 = s.substring(i+1,i+k+1);
            
            if(la1.compareTo(largest) > 0)
            {
                largest = la1;
            }
            
        }
        }
        else
        {
            smallest = s;
            largest = s;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
