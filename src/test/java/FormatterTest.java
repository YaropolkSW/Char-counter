import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class FormatterTest {
    private final Formatter formatter = new Formatter();

    @Test
    public void shouldFormatMap() {
        final String testLine = "hello";
        final Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('e', 1);
        testMap.put('h', 1);
        testMap.put('l', 2);
        testMap.put('o', 1);
        final String pattern = ".*\\n" +
                "\".{1}\" - \\d+\\n" +
                "\".{1}\" - \\d+\\n" +
                "\".{1}\" - \\d+\\n" +
                "\".{1}\" - \\d+\\n";
        Assertions.assertTrue(Pattern.matches(pattern, formatter.format(testLine, testMap)));
    }
}
