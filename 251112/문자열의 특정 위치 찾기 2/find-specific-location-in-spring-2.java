import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);
        String target = scan.next();
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        int count = 0;

        for (String s : arr) {
            if (s.length() >= 4) {
                if (s.charAt(2) == target.charAt(0) || s.charAt(3) == target.charAt(0)) {
                    System.out.println(s);
                    count++;
                }
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}