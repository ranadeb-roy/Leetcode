/* 
pattern 8

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/

public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // leading spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }

            // left triangle
            for (int k = 1; k <= 5 - i + 1; k++) {
                System.out.print("* ");
            }

            // right triangle
            for (int l = 1; l <= 5 - i; l++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
