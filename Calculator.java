import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String divide(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Неможливо поділити на нуль";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть операцію:");
        System.out.println("1. Додавання");
        System.out.println("2. Віднімання");
        System.out.println("3. Множення");
        System.out.println("4. Ділення");

        System.out.print("Введіть номер операції (1,2,3,4): ");
        String choice = scanner.nextLine();

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case "1":
                System.out.println("Результат: " + add(num1, num2));
                break;
            case "2":
                System.out.println("Результат: " + subtract(num1, num2));
                break;
            case "3":
                System.out.println("Результат: " + multiply(num1, num2));
                break;
            case "4":
                System.out.println("Результат: " + divide(num1, num2));
                break;
            default:
                System.out.println("Невірний вибір");
        }

        scanner.close();
    }
}
