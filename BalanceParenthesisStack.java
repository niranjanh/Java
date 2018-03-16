/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true


*/


import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
       
      while (sc.hasNext()) {
         String input=sc.next();
           //Complete the code
        Stack<Character> st = new Stack<>();
          for(int i = 0 ; i<input.length();i++)
          {
              if(!st.isEmpty())
              {
                  switch(input.charAt(i))
                     {
                        case '}' : if(st.peek() == '{')   //.equals('{')
                                     st.pop();
                           break;
                        case ')' : if(st.peek() == '(')  //.equals('(')
                                     st.pop();
                            break;
                        case ']' : if(st.peek() == '[')   //.equals('[')
                                       st.pop();
                           break;
                       default : st.push(input.charAt(i));
                           
                     }
              }
              else
                 st.push(input.charAt(i));
             }
             System.out.println(st.isEmpty());
          }
       
}
}
