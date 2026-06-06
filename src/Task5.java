import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        boolean valid = false;

        while(!valid){
            try {
                System.out.println("First Number: ");
                num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Second Number: ");
                num2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Third Number: ");
                num3 = Integer.parseInt(scanner.nextLine());
                scanner.close();

                valid = true;
            }catch (Exception e){
                System.out.println("Invalid Input");
            }
        }

        /*for(int i = 0; i<3; i++){
            System.out.print("Enter three numbers: ");

            if(i == 1){
                num1 = scanner.nextInt();
            } else if (i == 2) {
                num2 = scanner.nextInt();
            }else{
                num3 = scanner.nextInt();
            }
        }*/
        //num1 highest
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the highest number");
        }
        //num2 highest
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the highest number");
        }
        //num3 highest
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the highest number");
        }
        //equal
        else if (num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
