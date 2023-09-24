import org.testng.annotations.Test;

import static challenge_23.Gcd_Lcd.calculateGCD;
import static challenge_23.Gcd_Lcd.calculateLCM;
import static org.testng.Assert.assertEquals;

public class GCD_LCDTest {

    @Test
    public void calculateGCDTest(){

        int gcd = calculateGCD(56, 180);
        assertEquals(4, gcd);

    }

    @Test
    public void calculateLCDTest(){

        int lcd = calculateLCM(56, 180);
        assertEquals(2520, lcd);

    }

}
