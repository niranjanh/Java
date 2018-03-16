/*
Prime number using BigInteger
Input Format

A single line containing an integer,  (the number to be checked).

Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
       
      in.close();
      // Write your code here.
       
       boolean prime = n.isProbablePrime(1);
       
       if(prime)
           System.out.println("prime");
       else
           System.out.println("not prime");
   }
}
