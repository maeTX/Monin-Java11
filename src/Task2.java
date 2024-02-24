import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки (a)
        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();

        // Ввод второй строки (b)
        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }
}