//Modify the program to evaluate an expression entered by the user.
package src.PracticeTest;

import java.util.Scanner;
public class ExpressionEvaluation1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int num1 = input.nextInt();

        System.out.println("Enter the second number :");

        int num2 = input.nextInt();

        int total = num1*num2;

        System.out.println("Result is = " + total);


    }
}
