/* 
pattern 17

        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A

*/

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = i; j <= n - 1; j++) {
                System.out.print("  ");
            }

            // left triangle
            for (int k = 1; k <= i; k++) {
                System.out.print((char)(ch + k - 1) + " ");
            }

            // right triangle
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char)(ch + l - 1) + " ");
            }
            
            System.out.println();
        }
    }
}
