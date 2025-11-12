import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(int j = size-1; j >= 0; j--)
        {
            if(arr[j] % 2 == 0)
            {
                System.out.printf("%d ", arr[j]);
            }

        }
    }
}