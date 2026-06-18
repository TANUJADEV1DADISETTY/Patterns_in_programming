//1. Pattern 8
/*
        *
      * * *
    * * * * *    
  * * * * * * *

*/

import java.util.Scanner;

public class pattern8 {
    public static void pattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
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
