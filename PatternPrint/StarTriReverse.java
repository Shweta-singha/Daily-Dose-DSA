package PatternPrint;

import java.util.Scanner;

public class StarTriReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=1; i<=n ; i++)   //rows (i=1 to n - n is total number of rows)
        {
            for(int j=1; j<=n+1-i ; j++)   //cols (1 to i - current row num)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
