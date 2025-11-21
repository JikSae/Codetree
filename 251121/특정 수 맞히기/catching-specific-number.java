import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            int a = scan.nextInt();

            if(a == 25)
            {
                System.out.println("Good");
                break;
            }

            if(a < 25)
            {
                System.out.println("Higher");
                continue;
            }

            else
            {
                System.out.println("Lower");
                continue;
            }
        }
    }
}