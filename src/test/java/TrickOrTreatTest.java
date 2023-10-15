import challenge_43.Person;
import challenge_43.TrickOrTreat;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TrickOrTreatTest {

    @Test
    public void testChooseTreat() {
        TrickOrTreat trickOrTreat = new TrickOrTreat();
        Person[] persons = {
                new Person("Eve", 10, 160),
                new Person("Frank", 30, 180)
        };
        trickOrTreat.chooseTrickOrTreat(TrickOrTreat.Halloween.TREAT, persons);
    }

    @Test
    public void testCountTreats() {
        TrickOrTreat trickOrTreat = new TrickOrTreat();
        Person[] persons = {
                new Person("Eve", 10, 160),
                new Person("Frank", 30, 180)
        };
        int result = trickOrTreat.countTricksOrTreats(TrickOrTreat.Halloween.TREAT, persons);
        assertEquals(33, result);
    }

    @Test
    public void testChooseTrick() {
        TrickOrTreat trickOrTreat = new TrickOrTreat();
        Person[] persons = {
                new Person("Alice", 6, 120),
                new Person("Bob", 8, 140)
        };
        trickOrTreat.chooseTrickOrTreat(TrickOrTreat.Halloween.TRICK, persons);
    }

    @Test
    public void testCountTricks() {
        TrickOrTreat trickOrTreat = new TrickOrTreat();
        Person[] persons = {
                new Person("Alice", 6, 120),
                new Person("Bob", 8, 140),
                new Person("Peter", 11, 160)
        };
        int result = trickOrTreat.countTricksOrTreats(TrickOrTreat.Halloween.TRICK, persons);
        assertEquals(21, result);
    }

}
