import java.util.Scanner;

public class function {

    // public static void printName(String name) {
    // System.out.println(name);
    // }

    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // printName(name);
    // sc.close();
    // }

    /* Sum */

    // public static void calculateSum(int a, int b) {
    //     int sum = a + b;
    //     System.out.println("Sum of 2 number : "+ sum);
    // }

    // public static void main(String[] agrs) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     int a = sc.nextInt();
    //     System.out.println("Enter the number");
    //     int b = sc.nextInt();

    //     calculateSum(a, b);

    //     sc.close();
    // }

    /* mul */

    // public static int calculateProduct(int a,int b) {
    //     int mul = a*b;
    //     return mul;
    // }
    // public static void main(String[] agrs) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     int a = sc.nextInt();

    //     System.out.println("Enter the number");
    //     int b = sc.nextInt();

    //     int mul = calculateProduct(a, b);
    //     System.out.println("Product of 2 number : " + mul);

    //     sc.close();
    // }

    /* factorial */

    public static void calculateFactorial(int n) {

        if(n<0) {
            System.out.println("Invaild Value");
        }
        else if(n==0) {
            System.out.println("1");
        }

        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial*i;
        }
        System.out.println("factorial number : " + factorial);
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        calculateFactorial(n);

        sc.close();

    }
}
