//1. Pattern 15
/*
    A B C D
    A B C
    A B
    A
    
*/

import java.util.Scanner;

public class pattern15 {
    public static void pattern(int n) {
        for (int i = n; i >= 0; i--) {
            char ele = 'A';
            for (int j = 1; j <= i; j++) {
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
