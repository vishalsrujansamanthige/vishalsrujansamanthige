import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        caculator();
    }

    static void caculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first number: ");
        double a = scanner.nextDouble();
        System.out.print("Input your second number: ");
        double b = scanner.nextDouble();
        System.out.print("Input your operator number: ");
        String operator = scanner.next();
        scanner.close();
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                System.out.println("Sum is = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Difference is = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Product is = " + result);
                break;
            case "/":
                if (b != 0) result = a / b;
                System.out.println("Quotient is = " + result);
                break;
            default:
                System.out.println("Invalid input,only arthimetic operations allowed,try again");
        }

    }
}
