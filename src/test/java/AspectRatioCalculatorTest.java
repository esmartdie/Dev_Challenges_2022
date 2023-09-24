import challenge_5.AspectRatioCalculator;
import org.testng.annotations.Test;

import static challenge_5.AspectRatioCalculator.calculateAspectRatio;
import static org.testng.Assert.assertEquals;

public class AspectRatioCalculatorTest {

    @Test
    public void aspectRatioImageTest(){

        AspectRatioCalculator exampleChallengeImage = new AspectRatioCalculator();
        String aspectRatioImage = calculateAspectRatio("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
        assertEquals(aspectRatioImage,"128:41");
    }
}
