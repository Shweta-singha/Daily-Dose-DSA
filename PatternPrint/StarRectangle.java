package PatternPrint;

import java.util.Scanner;

public class StarRectangle
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows ");
        int m = sc.nextInt();

        System.out.print("Enter cols ");
        int n = sc.nextInt();
         for(int i = 1; i<=m; i++) //rows
         {
             for(int j = 1; j<=n; j++) //cols
             {
                 System.out.print("@ ");
             }

             System.out.println();
         }
    }
}

/*
rows = number of line ; (m rows)
cols = how much in each line; (n cols)
 */
