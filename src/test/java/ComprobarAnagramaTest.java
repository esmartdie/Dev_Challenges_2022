import challenge_1.ComprobarAnagrama;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComprobarAnagramaTest {
    @Test
    public void testAreAnagrams() {
        // Caso de prueba 1: palabras que son anagramas
        boolean result1 = ComprobarAnagrama.anagramCheck("listen", "silent");
        Assert.assertTrue(result1);

        // Caso de prueba 2: palabras que no son anagramas
        boolean result2 = ComprobarAnagrama.anagramCheck("hello", "world");
        Assert.assertFalse(result2);

        boolean result3 = ComprobarAnagrama.anagramCheck ("aaabbb", "ababab");
        Assert.assertTrue(result3);
    }
}
