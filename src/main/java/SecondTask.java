import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        do {
            str = scanner.nextLine();
            str = str.trim();
            if (!(str.equals("Вячеслав"))){
                System.out.println("Нет такого имени");
            }
        }
        while (!(str.equals("Вячеслав")));

        System.out.println("Привет, Вячеслав");
        scanner.close();
    }
}
