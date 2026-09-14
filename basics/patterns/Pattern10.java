/* 
pattern 10

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        // upper triangle
        for (int i = 1; i <= n; i++) {

            // left triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower triangle
        for (int i = 1; i <= n - 1; i++) {

            // left triangle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
