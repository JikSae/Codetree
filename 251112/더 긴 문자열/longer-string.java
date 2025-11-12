import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        int A = a.length();
        int B = b.length();


        if(A < B)
        {
            System.out.printf("%s %d", b, B);
        }
        else if(A == B)
        {
            System.out.println("same");
        }
        else
        {
            System.out.printf("%s %d", a, A);
        }


    }
}