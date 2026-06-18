//pattern 19
/* 
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

import java.util.Scanner;

public class pattern19 {
    public static void pattern(int n) {
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                for (int j = 0; j <= n - i - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= n - i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n - (i - n) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - (i - n) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("*");
                }
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
