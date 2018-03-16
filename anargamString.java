/*

Two strings,a  and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting a. 
The second line contains a string denoting b.

Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
*/



import java.io.*;
import java.util.*;

public class Solution {
       static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length())
        {
           
            char[] arrA = a.toLowerCase().toCharArray();
            char[] arrB = b.toLowerCase().toCharArray();
            Arrays.sort(arrA);
            Arrays.sort(arrB);
           
            boolean ans = Arrays.equals(arrA, arrB);
            
            
            return ans;
        }
        else
            return false;
    }
	public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
