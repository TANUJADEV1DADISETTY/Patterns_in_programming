//1. Pattern 4
/*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
*/

import java.util.Scanner;

public class pattern5 {
    public static void pattern(int n) {
        int ele = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ele + " ");
            }
            ele++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
