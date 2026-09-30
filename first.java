import java.util.Scanner;

public class first {
    // public static void StringName(String name) {

    // System.out.println("Your Name is " + name);
    // System.out.println("Name langth : " + name.length());

    // for(int i=0; i<name.length(); i++) {
    // System.out.println(name.charAt(i));
    // }
    // }
    // public static void main(String[] agrs) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name");
    // String name = sc.next();

    // StringName(name);
    // sc.close();
    // }

    // public static int countVowels(String word) {
    // int count = 0;
    // for (int i = 0; i < word.length(); i++) {
    // char ch = word.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // count++;
    // System.out.println(ch);
    // }
    // }
    // return count;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the your word : ");
    // String word = sc.nextLine();

    // int vowel = countVowels(word);
    // System.out.println("Count of vowels : "+ vowel);

    // sc.close();

    // }

    // public static void countVowels(String word) {
    // int count = 0;
    // for (int i = 0; i < word.length(); i++) {
    // char ch = word.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // count++;
    // System.out.println(ch);
    // }
    // }
    // System.out.println("Count of vowels : "+ count);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the your word : ");
    // String word = sc.nextLine();

    // countVowels(word);
    // sc.close();

    // }

    public static void stringCase(String firstName, String lastName, int m, int n) {

        System.out.println(
                "Your first name : " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
        System.out.println(
                "Your last name : " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());

        String first = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String last = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = first.concat(" ").concat(last);

        System.out.println("Your full name : " + fullName);

        if (m < fullName.length() && n <= fullName.length())
            System.out.println("index(" + m + "," + n + ") : " + fullName.substring(m, n));
        else
            System.out.println("error");

        System.out.println("Upper Case : " + fullName.toUpperCase());
        System.out.println("Lower Case : " + fullName.toLowerCase());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last Name : ");
        String lastName = sc.nextLine();

        System.out.print("Enter the starting index : ");
        int m = sc.nextInt();

        System.out.print("Enter the ending index : ");
        int n = sc.nextInt();

        System.out.println();

        stringCase(firstName, lastName, m, n);
        sc.close();
    }
}
