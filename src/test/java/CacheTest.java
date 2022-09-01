import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CacheTest {
    private final Cache cache = new Cache();
    private final CharCounter cc = new CharCounter(cache);

    @Test
    public void shouldCashResults() {
        final String hello = "hello";

        cc.countOfUniqueCharacters(hello);
        Assertions.assertTrue(cache.isLineSame(hello));
    }
}
