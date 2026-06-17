import java.util.Scanner;

public class pattern14 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
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
