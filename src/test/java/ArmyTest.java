import challenge_36.GoodArmy;
import challenge_36.SauronArmy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmyTest {

    @Test
    public void testGoodArmyPower() {
        GoodArmy goodArmy = new GoodArmy(5, 15, 25, 35, 45);
        int expectedPower = 5 * 1 + 15 * 2 + 25 * 3 + 35 * 4 + 45 * 5;
        assertEquals(expectedPower, goodArmy.goodArmyPower(goodArmy.getGoodArmyMap()));
    }

    @Test
    public void testSauronArmyPower() {
        SauronArmy sauronArmy = new SauronArmy(10, 20, 30, 40, 50);
        int expectedPower = 10 * 2 + 20 * 2 + 30 * 2 + 40 * 3 + 50 * 5;
        assertEquals(expectedPower, sauronArmy.sauronArmyPower(sauronArmy.getSauronArmyMap()));
    }
}
