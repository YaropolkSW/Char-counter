import java.util.Map;

public class Formatter {
    public String format(final String line, final Map<Character, Integer> map) {
        final StringBuilder result = new StringBuilder(line + "\n");
        for (final Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append("\"" + entry.getKey() + "\" - " + entry.getValue() + "\n");
        }
        return result.toString();
    }
}
