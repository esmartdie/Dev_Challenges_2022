import challenge_47.MostCommonVowel;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MostCommonVowelTest {
    @Test
    public void testMostCommonVowel() {
        MostCommonVowel vowelFinder = new MostCommonVowel();

        assertEquals('o', vowelFinder.calculateMostCommonVowel("Hólà, cómo estás?"));
        assertEquals('e', vowelFinder.calculateMostCommonVowel("Café con leche"));
        assertEquals('u', vowelFinder.calculateMostCommonVowel("Frühling"));
        assertEquals(' ', vowelFinder.calculateMostCommonVowel("HJGDFLKJ"));
    }
}
