//Reverse words in a string
package src.PracticeTest;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a String: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        System.out.print("Reverse Words: ");
        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
