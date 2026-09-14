/* 
pattern 16

A
B B
C C C
D D D D
E E E E E

*/

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';      // start with this char in every iteration

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
            ch++;
        }
    }
}
