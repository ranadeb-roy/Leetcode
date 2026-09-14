/* 
pattern 18

E
D E
C D E
B C D E
A B C D E

*/

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print((char)(ch + j - 1) + " ");
            }
            
            System.out.println();
        }
    }
}
