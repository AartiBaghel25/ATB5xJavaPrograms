package src.PracticeTest;
import java.util.Scanner;

public class DivisionOfTwoNumbersScanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");

        int a = input.nextInt();

        System.out.println("Enter the second number");

        int b = input.nextInt();

        int d = (a/b);

        System.out.println();

        System.out.println("The division of a and b is: " +d);
    }
}
