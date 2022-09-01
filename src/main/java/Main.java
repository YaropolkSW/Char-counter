import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Cache cache = new Cache();
        final CharCounter cc = new CharCounter(cache);
        final Formatter formatter = new Formatter();
        final Scanner scanner = new Scanner(System.in);
        String line;

        System.out.print("Введите строку: ");

        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")){
            final Map<Character, Integer> map = cc.countOfUniqueCharacters(line);

            final String result = formatter.format(line, map);
            System.out.println(result.trim());
            System.out.print("Введите новую строку: ");
        }
    }
}
