// Longest Palindromic Substring Using Manacher's Algorithm
// time - 8 ms
// space - 44.72 MB

import java.util.Scanner;
class Solution {
    public String longestPalindrome(String s) {
        // handle edge cases
        if (s.length() < 2) return s;

        // creating the transformed string
        StringBuilder sb = new StringBuilder();
        sb.append("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append('$');

        // transformed string
        String t = sb.toString();

        // creating the p[i] array to store the radius of the palindrome centered at each character
        int[] p = new int[t.length()];

        // creating center and right boundary of the current palindrome
        int c = 0;
        int r = 0;

        // starting the main loop which starts from 1 to t.length() - 2
        for (int i = 1; i < t.length() - 1; i++) {
            // mirror of the current index
            int m = 2 * c - i;

            // if current index is within the right boundary
            if (i < r) {
                p[i] = Math.min(p[m], r - i);
            } else {
                p[i] = 0;
            }

            // left and right pointers to expand the palindrome centered at i
            int left = i - (1 + p[i]);
            int right = i + (1 + p[i]);

            while (t.charAt(left) == t.charAt(right)) {
                p[i]++;
                left--;
                right++;
            }

            // update c and r if i + p[i] (current right boundary) is greater than r (previous right boundary)
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
        }
        
        // update the longest palindrome found so far
        int maxLen = 0;
        int maxCenter = 0;
        for (int j = 1; j < p.length - 1; j++) {
            if (p[j] > maxLen) {
                maxLen = p[j];
                maxCenter = j;
            }
        }

        // // get the center for the original string
        // int originalCenter = (maxCenter - 1) / 2;
        
        // get the start index of the longest palindrome in the original string
        int start = (maxCenter - maxLen) / 2;
        
        // return the longest palindromic substring
        return s.substring(start, start + maxLen);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.longestPalindrome(s));
        sc.close();
    }
}