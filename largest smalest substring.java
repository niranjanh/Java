/*

We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string,s , and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Input Format

The first line contains a string denoting s. 
The second line contains an integer denoting k.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel

Explanation 0

String  "welcometojava" has the following lexicographically-ordered substrings of length k=3 :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
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
