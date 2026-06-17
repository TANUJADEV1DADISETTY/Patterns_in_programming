//1. Pattern 4
/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

import java.util.Scanner;

public class pattern4 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            int ele = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(ele + " ");
                ele++;
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
