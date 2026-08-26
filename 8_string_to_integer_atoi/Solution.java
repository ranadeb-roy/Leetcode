// 8. String to Integer (atoi)
// time - 1ms
// space - 43.99MB
/* 
1. Check for whitespaces and skip them.
2. Check for sign (+ or -)
3. Store the digits until a non-digit char is found
4. Handle overflow and underflow cases
*/

import java.util.Scanner;
public class Solution {
    public int myAtoi(String s) {
        int len = s.length();

        // return if the string is empty
        if (len == 0) return 0;

        // taking long to avoid integer overflow
        long result = 0;
        
        int i = 0;      // index to traverse the string
        int sign = 1;   // sign of the number

        // skip leading whitespaces
        while (i < len && s.charAt(i) == ' ') i++;

        // check for sign
        if (i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // convert digits to integer
        while (i < len && Character.isDigit(s.charAt(i))) {
            result = (result * 10) + (s.charAt(i) - '0');

            // check for overflow and underflow
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to integer: ");
        String s = sc.nextLine();
        Solution solution = new Solution();
        int result = solution.myAtoi(s);
        System.out.println(result);
        sc.close();
    }
}
