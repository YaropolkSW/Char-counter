import java.util.Map;

public class Formatter {
    public void format(final String line, final Map<Character, Integer> map) {
        System.out.println(line);
        for (final Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
        }
    }
}
