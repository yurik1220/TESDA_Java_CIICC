import java.util.Scanner;

public class Task7 {
    static double add(double num1, double num2){
        return num1 + num2;
    }
    static double subtract(double num1, double num2){
        return num1 - num2;
    }
    static double divide(double num1, double num2){
        return num1 / num2;
    }
    static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char userInput;

        while (true) {
            System.out.println("+ (Addition)");
            System.out.println("- (Subtraction)");
            System.out.println("/ (Division)");
            System.out.println("* (Multiplication)");
            System.out.print("Choose operation: ");
            userInput = scanner.next().charAt(0);

            if (userInput == '+' || userInput == '-' || userInput == '/' || userInput == '*') {
                break;
            } else {
                System.out.println("Invalid Input, try again.\n");
            }
        }

        while (true) {
            System.out.print("Enter your first number: ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid number, try again.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter your second number: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid number, try again.");
                scanner.next();
            }
        }

        switch(userInput){
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    scanner.close();
                    return;
                }
                result = divide(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            default:
                result = 0;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
