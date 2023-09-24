import challenge_6.ReverseChains;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ReverseChainsTest {

    @Test
    public void reverseChainsTest(){

        String reverseChain = ReverseChains.reverseChains("Hello World");
        assertEquals(reverseChain,"dlroW olleH");
    }
}
