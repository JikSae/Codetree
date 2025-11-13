import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 100; i++)
        {
            int a = scan.nextInt();

            if(a == 0)
            {
                break;
            }
            System.out.println(a);
        }
    }
}