import challenge_20.TimeStop;
import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;

public class futureSumResultTest {

    @Test(timeOut = 6000)
    public void futureSumTest_1() throws InterruptedException {

        int num1 = 8;
        int num2 = 2;
        int seconds = 5;

        long startTime = System.currentTimeMillis();
        int result = TimeStop.futureSumResult(num1, num2, seconds);
        long endTime = System.currentTimeMillis();

        System.out.println("The future result of the sum 1 is: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");


        assert (endTime - startTime) >= seconds * 1000;
    }
}
