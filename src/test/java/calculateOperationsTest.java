import org.testng.annotations.Test;

import static challenge_21.TxtCalculator.calculateOperations;

public class calculateOperationsTest {

    @Test
    public void calculateOperation(){

        calculateOperations("src/main/resources/txtCalculatorResources/operations.txt");
    }

}
