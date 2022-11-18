import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        solution(reader);
        reader.close();
    }

    private static void solution(BufferedReader reader) throws IOException {
        String str;
        String[] array;
        System.out.println("Введите набор чисел через пробел в одну строку");
        str = reader.readLine();
        array = str.split(" ");
        for (String tmp : array){
            if (isDigit(tmp)){
                if (Integer.parseInt(tmp)%3 == 0){
                    System.out.println(tmp);
                }
            }
        }
    }

    private static boolean isDigit(String tmp) {
        for (int i = 0; i < tmp.length(); i++) {
            if (!(Character.isDigit(tmp.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
