import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");//user input
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder(word);//insert user input in SB

        sb.reverse();//reverse the word
        String reversedWord = sb.toString();//convert the SB into a string

        if(word.equals(reversedWord)){
            System.out.println("The input string is a palindrome");
        }
        else {
            System.out.println("The input string is NOT a palindrome");
        }
    }
}
