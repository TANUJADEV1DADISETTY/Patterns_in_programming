//1. Pattern 18
/*  
  E
  D E
  C D E
  B C D E
  A B C D E
*/

import java.util.Scanner;

public class pattern18 {
    public static void pattern(int n) {
        char ele = (char) (65 + (n - 1));
        for (int i = 0; i < n; i++) {
            char res = ele;
            for (int j = 0; j <= i; j++) {
                System.out.print(res + " ");
                res++;
            }
            System.out.println();
            ele--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
