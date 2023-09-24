import challenge_15.DateDiff;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class calculateDateDiffTest {

    @Test
    public void calculateDiff_1(){

        int diff = DateDiff.calculateDateDiff("01/01/2023", "02/01/2023");
        System.out.println(diff);
        assertEquals(diff,1);

    }

    @Test
    public void calculateDiff_2(){

        int diff = DateDiff.calculateDateDiff("01/07/2023", "02/01/2023");
        System.out.println(diff);
        assertEquals(diff,180);

    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "El formato de fecha es inválido")
    public void calculateDiff_3() {
        int diff = DateDiff.calculateDateDiff("12/31/2023", "02/01/2023");
    }
}
