/*

Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where ), you can perform one of the following moves:

Move Backward: If cell i-1  exists and contains a 0 , you can walk back to cell i-1.
Move Forward:
If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap  contains a zero, you can jump to cell i+leap.
If you're standing in cell n-1 or the value of i+leap>n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index  i to index i+1,i-1 , or i+leap  as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.

Given leap and game, complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls). 
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .

Output Format

Return true if you can win the game; otherwise, return false.

Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
*/

import java.util.*;

public class Solution {
    public static boolean canWin(int[] game,int leap,int i) {
        // Return true if you can win the game; otherwise, return false.
         if (i < 0 || game[i] == 1) {
        return false;
    } else if (i + 1 >= game.length || i + leap >= game.length) {
        return true;
    }
        
    game[i] = 1; // marks as visited

    /* Recursive Cases */
    return canWin(game, leap, i + leap) || 
           canWin(game, leap, i + 1) || 
           canWin(game, leap, i - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            int i = 0;

            System.out.println( (canWin(game,leap,i)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
