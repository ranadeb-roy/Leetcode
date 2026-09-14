/* 
pattern 20

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;

        // upper pattern
        for (int i = 1; i <= n; i++) {

            // left triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // middle spaces
            for (int j = (n - i) * 2; j >= 1; j--) {
                System.out.print("  ");
            }

            // right triangle
            for (int l = (n - i + 1); l <= n; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower pattern
        for (int i = 1; i <= n - 1; i++) {

            // left triangle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("* ");
            }

            // middle spaces
            for (int j = (n - i) * 2; j <= (n * 2) - 1; j++) {
                System.out.print("  ");
            }

            // right triangle
            for (int l = n - i; l >= 1; l--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
