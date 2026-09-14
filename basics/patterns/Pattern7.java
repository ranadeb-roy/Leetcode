/* 
pattern 7

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/

public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // leading spaces
            for (int j = i; j <= 5 - 1; j++) {
                System.out.print("  ");
            }

            // left triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // right triangle
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
