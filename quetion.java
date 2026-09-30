import java.util.Scanner;

public class quetion {

    /* average */

    // public static void average(int a, int b, int c) {
    // int ave = (a + b + c) / 3;

    // System.out.println("Average number : " + ave);
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the first number");
    // int a = sc.nextInt();

    // System.out.println("Enter the seocond number");
    // int b = sc.nextInt();

    // System.out.println("Enter the third number");
    // int c = sc.nextInt();

    // average(a, b, c);

    // sc.close();
    // }

    /* Sum of all odd number */

    // public static void SumOddNumber(int n) {

    // int sum = 0;

    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // }
    // }
    // System.out.println("Sum of All Odd number : " + sum);
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the number");
    // int n = sc.nextInt();

    // SumOddNumber(n);

    // sc.close();
    // }

    /* greater number */

    // public static int greaterNumber(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the first number");
    // int a = sc.nextInt();

    // System.out.println("Enter the second number");
    // int b = sc.nextInt();

    // System.out.println("Greater number : " + greaterNumber(a, b));

    // sc.close();
    // }

    /* circumference of a circle */

    // public static void circumference(float r) {
    // float cir = 2 * (22 / 7) * r;
    // System.out.println("Citcumference of a circle : " + cir);
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the radius");
    // float r = sc.nextFloat();

    // circumference(r);

    // sc.close();
    // }

    /* A Person is eligible to vote or not */

    // public static void eligible(int age) {
    // if (age >= 18) {
    // System.out.println("This person is eligible to vote");
    // } else {
    // System.out.println("This person is not eligible to vote");
    // }
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter your current age");
    // int age = sc.nextInt();

    // eligible(age);

    // sc.close();
    // }

    /* Power question */

    public static int calculatePawoer(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int power = calculatePawoer(a, b);
        System.out.println("power of a and b : " + power);

        sc.close();
    }

}
