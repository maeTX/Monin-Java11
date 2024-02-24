public class Task1 {
    public static void main(String[] args) {
        int a = 5; // Пример значения для a
        int b = 3; // Пример значения для b
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }
    }
}