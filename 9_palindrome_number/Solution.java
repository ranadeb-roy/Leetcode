// 9. Palindrome Number
// time - 5 ms
// space - 46.2 MB 
/*
Using while loop to store the values from the back one by one.
And then comparing the original number with the reversed number.
*/
import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        if (rev == x) return true;
        return false;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println(sol.isPalindrome(x));
        sc.close();
    }
}