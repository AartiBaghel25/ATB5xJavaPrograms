package src.PracticeTest;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = in.nextInt();

        if(n % 2 == 0){
            System.out.println("This is even number");
        }else {
            System.out.println("This is odd number");
        }
    }
}
