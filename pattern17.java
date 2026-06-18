//1. Pattern 17
/*
        A
      A B A
    A B C B A
  A B C D C B A
*/

import java.util.Scanner;

public class pattern17 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ele = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ele);
                ele++;
            }
            char res = (char) (ele - 2);
            for (int j = i; j > 0; j--) {
                System.out.print(res);
                res--;
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
