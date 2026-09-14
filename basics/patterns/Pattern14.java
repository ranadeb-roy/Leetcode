/* 
pattern 14

A
A B
A B C
A B C D
A B C D E

*/

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';      // start with this char in every iteration

            for (int j = 1; j <= i; j++) {

                // increment the character after printing, this will work as char stores ASCII values and not the character itself
                System.out.print((ch++) + " ");
            }

            System.out.println();
        }
    }
}
