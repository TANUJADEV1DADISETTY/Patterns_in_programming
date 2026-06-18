// Patterns
//2. Pattern 10
/*
    * 
    * * 
    * * * 
    * * * *
    * * * * *
    * * * * 
    * * *
    * * 
    * 
*/

import java.util.Scanner;

public class pattern10 {
    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
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
