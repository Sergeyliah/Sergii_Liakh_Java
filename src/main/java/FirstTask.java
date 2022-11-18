import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            while (x <= 7) {
                System.out.println("Введите число");
                x = scanner.nextInt();
            }
            System.out.println("Привет");
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Перезапустите программу");
        }
        scanner.close();
    }
}
