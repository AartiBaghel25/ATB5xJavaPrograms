//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package src.PracticeTest;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter third number: ");
        int num3 = in.nextInt();

        System.out.println("Enter fourth number: ");
        int num4 = in.nextInt();

        System.out.println("Enter fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of five number is: " + (num1 + num2 + num3 + num4 + num5) / 5);
    }

}
