import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while(a <= b)
        {
            System.out.printf("%d ", a);
            if(a % 2 == 0)
            {
                a += 3;
                continue;
            }

            if(a % 2 == 1)
            {
                a = a * 2;
                continue;
            }

            if(a > b)
            {
                break;
            }
        }



        
    }
}