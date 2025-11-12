import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int a = 0;
        int b = 0;

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();

            if(arr[i] % 3 == 0)
            {
                a++;
            }

            if(arr[i] % 5 == 0)
            {
                b++;
            }

            else
            {
                continue;
            }
        }
        System.out.printf("%d %d", a, b);
    }
}