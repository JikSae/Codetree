import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        char[] arr = a.toCharArray();

        int n = arr.length;

        if (n >= 2) {
            arr[1] = 'a';
            arr[n - 2] = 'a';
        }

        System.out.println(new String(arr));
    }
}