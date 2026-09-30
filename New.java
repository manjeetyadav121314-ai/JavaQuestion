import java.util.Scanner;

public class New {
    // public static int frequency(String word, char target) {
    //     int count = 0;
    //     for (int i = 0; i < word.length(); i++) {
    //         char ch = word.charAt(i);
    //         if (ch == target) {
    //             count = count + 1;
    //         }
    //     }
    //     return count;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the your Word : ");
    //     String word = sc.nextLine();

    //     System.out.print("Enter the your target : ");
    //     char target = sc.next().charAt(0);

    //     int result = frequency(word, target);

    //     System.out.println("Count : " + result);
    //     sc.close();
    // }

    public static void upperletterCount(String word) {
        int count = 0;
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                count = count + 1;
            }
        }
        System.out.println("Count : " + count);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your word : ");
        String word = sc.nextLine();

        upperletterCount(word);
        sc.close();
    }
}
