import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // sc.close();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}