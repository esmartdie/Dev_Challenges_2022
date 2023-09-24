import challenge_13.Factorial;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void simpleFactorial(){

        int result = Factorial.calculateFactorial(4);

        assertEquals(result, 24);
    }
}
