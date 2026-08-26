// 6. ZigZag Conversion
/*
Creating a StringBuilder array to hold the characters for each row.
 */
import java.util.Scanner;
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows == 1 || len <= numRows) return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        // initialization required for each of the StringBuilder objects in array
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int row = 0, dir = 1;  // dir = 1 means down, dir = -1 means up

        for (int i = 0; i < len; i++) {
            sb[row].append(s.charAt(i));
            if (dir == 1) {
                if (row == numRows - 1) {
                    dir = -1;
                    row--;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    dir = 1;
                    row++;
                } else {
                    row--;
                }
            }
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += sb[i].toString();
        }

        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(sol.convert(s, numRows));
        sc.close();
    }
}
