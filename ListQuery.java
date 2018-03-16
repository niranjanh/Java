/*
For this problem, we have q types of queries you can perform on a List:

Insert y at index x:

Insert
x y
Delete the element at index x:

Delete
x
Given a list,L ,N of  integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N  (the initial number of elements in L). 
The second line contains N space-separated integers describing L. 
The third line contains an integer, Q (the number of queries). 
The  2.Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> l = new ArrayList<Integer> ();
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int i = 0;i<n;i++)
        {
            int data = s.nextInt();
            l.add(i,data);
        }
        
        /*
        while(s.hasnext)
        {
        int data = s.nextInt();
          l.add(data);
        }
        */
        
        int q = s.nextInt();
        for(int i = 0 ; i< q ; i++)
        {
            String query = s.next();
            if(query.equals("Insert"))
            {
                int index = s.nextInt();
                int value = s.nextInt();
                
                l.add(index,value);
            }
            else                //   (query.equals("Delete"))
            {
                int d_index = s.nextInt();
                l.remove(d_index);
                //l.add(index,0);
            }
            
            //q--;
        }
        s.close();
        for(Integer i : l)
        {
            System.out.print(i+" ");
        }
    }
}



