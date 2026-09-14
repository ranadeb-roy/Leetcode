/* 
pattern 12

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

*/

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // middle spaces
            for (int k = (n - i) * 2; k >= 1; k--) {
                System.out.print("  ");
            }

            // right triangle
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}
