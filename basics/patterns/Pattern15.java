/* 
pattern 15

A B C D E
A B C D
A B C
A B
A

*/

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';      // start with this char in every iteration

            for (int j = 1; j <= n - i + 1; j++) {

                // increment the character after printing, this will work as char stores ASCII values and not the character itself
                System.out.print((ch++) + " ");
            }

            System.out.println();
        }
    }
}
