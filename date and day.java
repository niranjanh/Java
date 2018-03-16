/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Input Format

A single line of input containing the space separated month, day and year, respectively, in  MM.DD.YYYY format.

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY

*/



public class Solution {
   // public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        
        //Calendar rightNow = Calendar.getInstance();
        
        public static String getDay(String a,String b, String c)
        {
            int a1 = Integer.parseInt(a);      //Integer.toString(a);
            int b1 = Integer.parseInt(b);      //Integer.toString(b);
            int c1 = Integer.parseInt(c);      //Integer.toString(c);
            
            int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
            int days2[] = {31,29,31,30,31,30,31,31,30,31,30,31};
            
            String[] weekDays = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
            
          
                int c11 = (c1-1)/4;
                   //(c1-1) = (c1-1-c11-1)
                
               int i=0;
            int b12 = 0;
            if(c1 % 4 == 0 || c1 % 400 == 0)
            {
                for(i = 0; i < b1-1; i++)
                {
                   b12 = b12 + days2[i];
                }
            }
            else
            {
                for(i = 0; i < b1-1; i++)
                {
                   b12 = b12 + days[i];
                }
            }
            c1 = c1-c11-1;
            int day = (c11*366 + c1*365 + b12+ a1) % 7;
            if(day == 0)
            {
                day =7;
            }
            return (weekDays[day-1]);
        }
   