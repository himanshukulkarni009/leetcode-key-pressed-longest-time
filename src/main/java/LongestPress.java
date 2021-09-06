import java.util.HashMap;
import java.util.Map;

public class LongestPress {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        Map<Character, Integer> timeTracker = new HashMap<>();

        String[] chars = keysPressed.split("");

        if(releaseTimes.length >= 1)
            timeTracker.put(chars[0].charAt(0), releaseTimes[0]);

        for (int i = 1; i < releaseTimes.length; i++) {


        }

        return 'a';
    }
}
