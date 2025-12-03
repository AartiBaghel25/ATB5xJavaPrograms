//Write a Java program and compute the sum of an integer's digits.
package src.PracticeTest;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer: ");

        long n = input.nextLong();

        System.out.println("The sum of digits is: " + sumDigits(n));

    }

    public static long sumDigits(long n){
        long sum = 0;

        while (n != 0){
            sum = sum + (n % 10);
            n /= 10;
        }
        return sum;
    }
}
