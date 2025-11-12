import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        String grade = "";

        for(int i = score; i<=100; i++)
        {
            if(i >= 90)
            {
                grade = "A";
            }
            
            else if(i >= 80)
            {
                grade = "B";
            }
        
            else if(i >= 70)
            {
                grade = "C";
            }
        
            else if(i >= 60)
            {
                grade = "D";
            }
        
            else
            {
                grade = "F";
            }

            System.out.printf("%s ", grade);
        }
        
    }
}