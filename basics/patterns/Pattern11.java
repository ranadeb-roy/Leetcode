/* 
pattern 11

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // if i is odd start with 1 else start with 0
            int flag = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");

                // after each iteration flag change 0/1 
                flag = (flag + 1) % 2;
            }

            System.out.println();
        }
    }
}
