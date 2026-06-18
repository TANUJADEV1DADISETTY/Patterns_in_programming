//1. Pattern 16
/*
    A
    B B
    C C C
    D D D D 
    E E E E E
*/

import java.util.Scanner;

public class pattern16 {
    public static void pattern(int n) {
        char ele = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ele + " ");
            }
            System.out.println();
            ele++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
