package PatternPrint;

import java.util.Scanner;

public class Alphanum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  //even row -> alphabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            } else {   //odd rows -> numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}

