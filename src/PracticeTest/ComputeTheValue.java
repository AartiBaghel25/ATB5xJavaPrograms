package src.PracticeTest;

import java.util.Scanner;

public class ComputeTheValue {
    public static void main(String[] args){
        int n;
        char s1, s2,s3;

        Scanner in = new Scanner(System.in);

        System.out.print("Input Number: ");
        n = in.nextInt();

        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

    }
}
