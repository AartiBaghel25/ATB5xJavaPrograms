//Reverse a string without using built-in functions.
package src.PracticeTest;

import java.util.Scanner;

public class ReverseStringWithoutBuiltIn {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = scanner.nextLine();

        int length = input.length();
        char[] letters = new char[length];

        for(int i= 0; i < length; i++){
            letters[i] = input.charAt(i);
        }

        System.out.print("Reverse String: ");
        for(int i = length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.println();
    }
}
