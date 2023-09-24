import challenge_8.FromDecimalToBinary;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class buildBinaryNumberTest {

    @Test
    public void fromDecimalToBinaryTest(){

        int decimal=387;
        int binary = FromDecimalToBinary.buildBinaryNumber(decimal);
        assertEquals(binary, 110000011);

    }
}
