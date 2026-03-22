package PatternPrint;

import java.util.Scanner;

public class alphareverse
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter x");

        int x = scn.nextInt();

        for(int i=1; i<=x ; i++)
        {
            for(int j=1; j<=x+1-i; j++)
            {
                System.out.print((char)(j+64));
            }

            System.out.println();
        }
    }
}
