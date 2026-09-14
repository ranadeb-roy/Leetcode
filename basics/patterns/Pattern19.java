/* 
pattern 19

* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *

*/

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;

        // upper pattern
        for (int i = 1; i <= n; i++) {

            // left pattern
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("* ");
            }

            // middle spaces
            for (int k = (n - i + 1) * 2; k <= (n * 2) - 1; k++) {
                System.out.print("  ");
            }

            // right pattern
            for (int l = i; l <= n; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower pattern
        for (int i = 1; i <= n; i++) {

            // left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // middle spaces
            for (int k = (n - i) * 2; k >= 1; k--) {
                System.out.print("  ");
            }

            // right triangle
            for (int l = i; l >= 1; l--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
