import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        String customerName;
        int age;
        String drinkType;
        String drinkSize;
        int quantity;
        double price = 0;
        double total;
        double finalTotal;
        String orderSize;
        int orderNumber;
        int luckyNumber;

        System.out.println("===== JAVA CAFE =====");
        System.out.println("DRINKS     PRICE");
        System.out.println("Coffee     120");
        System.out.println("Latte      150");
        System.out.println("Matcha     180");
        System.out.println("Choco      120");
        System.out.println("Sizes: Small 0, Medium +20, Large +40\n");

        // User input
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter drink: ");
        drinkType = scanner.nextLine();

        // Base price
        switch (drinkType.toLowerCase()) {
            case "coffee", "choco" -> price = 120;
            case "latte" -> price = 150;
            case "matcha" -> price = 180;
            default -> System.out.println("Invalid choice");
        }

        System.out.print("Enter size: ");
        drinkSize = scanner.nextLine();

        if (drinkSize.equalsIgnoreCase("Medium")) {
            price += 20;
        } else if (drinkSize.equalsIgnoreCase("Large")) {
            price += 40;
        }

        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        // Subtotal
        total = price * quantity;
        finalTotal = total;

        // Senior/bulk discount
        if (age >= 60) {
            if (quantity >= 5 && total >= 700) {
                finalTotal = total * 0.7; // 30% off
                orderSize = "Large Order";
            } else {
                finalTotal = total * 0.8; // 20% off
                orderSize = "Small Order";
            }
        } else {
            orderSize = (quantity >= 5) ? "Large Order" : "Small Order";
        }

        // Lucky number discount (applied on top of any existing discount)
        luckyNumber = random.nextInt(0, 6); // 0–5
        if (luckyNumber == 3) {
            finalTotal -= 50;
            System.out.println("Lucky number hit! Extra ₱50 off!");
        }

        // Receipt
        System.out.println("\n===== RECEIPT =====");
        orderNumber = random.nextInt(1, 9999);
        System.out.println("Order No: " + orderNumber);
        System.out.println("Customer: " + customerName.toUpperCase());
        System.out.println("Customer Code: " + customerName.substring(0, 3));
        System.out.println("Drink: " + drinkType);
        System.out.println("Size: " + drinkSize);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order type: " + orderSize);

        System.out.printf("Subtotal: %.2f\n", total);
        if (finalTotal < total) {
            System.out.printf("Discount: %.2f\n", total - finalTotal);
        }
        System.out.printf("Final Total: %.2f\n", finalTotal);
    }
}
