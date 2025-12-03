//Write a Java program to swap two variables.
package src.PracticeTest;

public class SwapVariables {
    public static void main(String[] args){

        int a, b, temp;

        a = 15;
        b = 25;

        System.out.println("Before swapping : a, b = " + a + ", " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a, b = " + a + ", " +b);
    }
}
