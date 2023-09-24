import challenge_14.NarcissistNumber;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NarcissistNumberTest {

    @Test
    public void isAArmstrongNumber_1(){

        boolean nn = NarcissistNumber.isAnArmstrongNumbert(153);
        assertEquals(nn, true);

    }

    @Test
    public void isAArmstrongNumber_2(){

        boolean nn = NarcissistNumber.isAnArmstrongNumbert(165);
        assertEquals(nn, false);

    }

    @Test
    public void isAArmstrongNumber_3(){

        boolean nn = NarcissistNumber.isAnArmstrongNumbert(370);
        assertEquals(nn, true);

    }
}
