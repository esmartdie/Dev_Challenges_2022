import org.testng.annotations.Test;

import java.util.Arrays;

import static challenge_22.SpecialSets.makeSpecialSet;
import static org.testng.Assert.assertEquals;

public class SpecialSetTest {

    @Test
    public void differentElements (){

        String[] array1 = {"apple", "orange", "banana", "kiwi"};
        String[] array2 = {"kiwi", "pear", "banana", "grape", "kiwi", "1", "100"};

        String[] result = makeSpecialSet(array1, array2, true);
        System.out.println("Common elements: " + Arrays.toString(result));

        String[] expected = {"banana", "kiwi"};
        assertEquals(expected,result);

    }

    @Test
    public void uniqueElements(){

        String[] array1 = {"apple", "orange", "banana", "kiwi"};
        String[] array2 = {"kiwi", "pear", "banana", "grape", "kiwi", "1", "100"};

        String[] result = makeSpecialSet(array1, array2, false);
        System.out.println("Non Common elements: " + Arrays.toString(result));

        String[] expected = {"orange", "1", "100", "apple", "pear", "grape"};
        assertEquals(expected,result);

    }
}
