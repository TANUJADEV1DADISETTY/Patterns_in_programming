// Patterns
//2. Pattern 2
/*
    * 
    * * 
    * * * 
    * * * *
    * * * * *
*/

import java.util.*;

public class pattern2 {

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
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
