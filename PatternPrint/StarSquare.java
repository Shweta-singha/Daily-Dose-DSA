package PatternPrint;

import java.util.Scanner;

public class StarSquare
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scn.nextInt();

        //System.out.println("Enter Columns");
        //int y = scn.nextInt();

        for (int i =1; i<=x; i++) //rows
        {
            for(int j = 1; j<=x; j++) //cols
            {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}

