import challenge_0.FizzBuzz;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterMethod
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz.fizzBuzz();
        String expectedOutput = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizzbuzz\n" +
                "16\n17\nfizz\n19\nbuzz\nfizz\n22\n23\nfizz\nbuzz\n26\nfizz\n28\n29\nfizzbuzz\n" +
                "31\n32\nfizz\n34\nbuzz\nfizz\n37\n38\nfizz\nbuzz\n41\nfizz\n43\n44\nfizzbuzz\n" +
                "46\n47\nfizz\n49\nbuzz\nfizz\n52\n53\nfizz\nbuzz\n56\nfizz\n58\n59\nfizzbuzz\n" +
                "61\n62\nfizz\n64\nbuzz\nfizz\n67\n68\nfizz\nbuzz\n71\nfizz\n73\n74\nfizzbuzz\n" +
                "76\n77\nfizz\n79\nbuzz\nfizz\n82\n83\nfizz\nbuzz\n86\nfizz\n88\n89\nfizzbuzz\n" +
                "91\n92\nfizz\n94\nbuzz\nfizz\n97\n98\nfizz\nbuzz\n";

        Assert.assertEquals(outputStreamCaptor.toString(), expectedOutput);
    }
}
