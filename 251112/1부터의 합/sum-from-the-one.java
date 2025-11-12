import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int count = 0;
        int hap = 0;

        for(int i = 1; i < 5000; i++)
        {
            hap += i;
            count++;
            if(a <= hap)
            {
                break;
            }
        }
        System.out.println(count);
    }
}