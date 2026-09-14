/* 
pattern 22

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/

public class Pattern22 {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n * 2 - 1; i++) {
            
            for (int j = 0; j < n * 2 - 1; j++) {

                int top = i;
                int left = j;
                int right = (n * 2 - 2) - j;
                int bottom = (n * 2 - 2) - i;

                int v = n - (min(min(top, bottom), min(left, right)));

                System.out.print(v + " ");

            }

            System.out.println();
        }
    }
}
