import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        sc.close();

        System.out.println();

        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println(a + " is biggest number");
            } else {
                System.out.println(b + " is biggest number");
            }
        }
    }
}
