import org.junit.Assert;
import org.junit.Test;

public class LongestPressTest {

    @Test
    public void testLongest() {
        LongestPress solution = new LongestPress();

        char result = solution.slowestKey(new int[]{9, 29, 49, 50}, "cbcd");

        Assert.assertEquals('c', result);

    }
}
