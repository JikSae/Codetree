import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int hap = 0;

        for(int i = 1; i <= a; i++)
        {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
            {
                hap = hap + 1;
            }
        }
        System.out.println(hap);
    }
}