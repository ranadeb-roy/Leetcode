// 6. ZigZag Conversion
/*
Brute force solution:
Creating a 2d array that stores the chars in zigzag order and then read it in string
 */
import java.util.Scanner;
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows == 1 || len <= numRows) return s;
        char[][] zigzag = new char[numRows][len];
        int row = 0, col = 0, dir = 1;  // dir = 1 means down, dir = -1 means up
        for (int i = 0; i < len; i++) {
            zigzag[row][col] = s.charAt(i);
            if (dir == 1) {
                if (row == numRows - 1) {
                    dir = -1;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    dir = 1;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len; j++) {
                if (zigzag[i][j] == '\0') continue;
                sb.append(zigzag[i][j]);
            }
        }
        String result = sb.toString();
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
