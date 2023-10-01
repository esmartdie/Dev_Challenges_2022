import challenge_34.LostNumbers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class LostNumbersTest {

    @Test
    public void lostNumberTest(){

        int[] arrayInput = new int[]{2, 5, 7, 9};
        int[] lostNumbers = LostNumbers.lostNumbers(arrayInput);
        int[] expectedLostNumbers = new int[]{3, 4, 6, 8};

        Assert.assertArrayEquals(expectedLostNumbers, lostNumbers);
    }

    @Test
    public void incorrectInputTest() {
        int[] arrayInput = new int[]{2, 5, 5, 9}; // Contains duplicates

        LostNumbers lostNumbersCalculator = new LostNumbers();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            lostNumbersCalculator.lostNumbers(arrayInput);
        });
    }
}
