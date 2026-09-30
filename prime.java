import java.util.Scanner;

public class prime {
    public static int primeNumber(int n) {

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int prime = primeNumber(n);
        System.out.println(prime);
        sc.close();
    }
}
