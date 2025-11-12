import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int hap = 0;

        for(int i = a; i <= b; i++)
        {
            if(i % 2 == 1)
            {
                continue;
            }
            hap += i;
        }
        System.out.println(hap);
    }
}