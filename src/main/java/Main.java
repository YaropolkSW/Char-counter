import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final CharCounter cc = new CharCounter();
        final Formatter formatter = new Formatter();
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");

        final String line = scanner.nextLine();
        final Map<Character, Integer> map = cc.countOfUniqueCharacters(line);

        formatter.format(line, map);
    }
}
