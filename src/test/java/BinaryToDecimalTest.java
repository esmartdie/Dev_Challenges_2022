import challenge_38.BinaryToDecimal;
import org.junit.Assert;
import org.junit.Test;


public class BinaryToDecimalTest {

    @Test
    public void binaryToDecimal(){

        int binaryExample = 10011;
        int exampleToDecimal = BinaryToDecimal.binaryToDecimal(binaryExample);
        Assert.assertEquals(19, exampleToDecimal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinaryToDecimalInvalidInput() {
        BinaryToDecimal.binaryToDecimal(12);
    }

}
